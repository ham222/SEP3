package via.sep3.tier3.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.generatedprotos.*;
import via.sep3.tier3.database.DAO.ElectricityConsumptionDAOImpl;
import via.sep3.tier3.database.DAO.WaterConsumptionDAOImpl;
import via.sep3.tier3.database.DAOInterfaces.ElectricityConsumptionDAO;
import via.sep3.tier3.database.DAOInterfaces.WaterConsumptionDAO;
import via.sep3.tier3.model.ElectricityUsageImpl;
import via.sep3.tier3.model.WaterUsageImpl;

import java.util.ArrayList;


@GRpcService
public class ResourcesConsumption extends ResourcesConsumptionGrpc.ResourcesConsumptionImplBase {


    ElectricityConsumptionDAO eDao = new ElectricityConsumptionDAOImpl();
    WaterConsumptionDAO wDao = new WaterConsumptionDAOImpl();

    @Override
    public void logElectricityUsage(ElectricityUsage electricityUsage, StreamObserver<Empty> observer)
    {
        System.out.println("Got a request in LogElectricityUsage With:" + electricityUsage.toString());

        // set up the arguments for the ElectricityUsageImpl
        //int id = electricityUsage.getId();
        double amount = electricityUsage.getAmount();
        int month = electricityUsage.getMonth();
        int year = electricityUsage.getYear();
        int userId = electricityUsage.getUserId();

        // creating ElectricityUsageImpl
        ElectricityUsageImpl sendElectricity = new ElectricityUsageImpl(amount,month,year,userId);

        // sending ElectricityUsageImpl to database
        eDao.addElectricityData(sendElectricity);

        // grpc stuff
        observer.onNext(Empty.newBuilder().build());
        observer.onCompleted();
    }

    @Override
    public void logWaterUsage(WaterUsage waterUsage, StreamObserver<Empty> observer)
    {
        System.out.println("Got a request in logWaterUsage With:" + waterUsage.toString());
        // set up the arguments for the WaterUsageImpl
        int id = waterUsage.getId();
        double amount = waterUsage.getAmount();
        int month = waterUsage.getMonth();
        int year = waterUsage.getYear();
        int userId = waterUsage.getUserId();

        // creating WaterUsageImpl
        WaterUsageImpl sendWater = new WaterUsageImpl(amount,month,year,userId);

        // sending WaterUsageImpl to database
        wDao.addWaterData(sendWater);

        // grpc stuff
        observer.onNext(Empty.newBuilder().build());
        observer.onCompleted();

    }



    // todo rename properly "GetUsage" not GetWaterUsage
    @Override
    public void getUsage(Empty empty, StreamObserver<ListUsage> observer)
    {
        // get lists of usages from each DAO
        // commented for testing
        // todo uncomment after done testing

        ArrayList<WaterUsageImpl> wUsages = wDao.getAllWaterUsage();

        System.out.println(wUsages.toArray());
        ArrayList<ElectricityUsageImpl> eUsages = eDao.getAllElectricityUsage();

        // for testing
        // todo delete later
//        ArrayList<WaterUsageImpl> wUsages = new ArrayList<>();
//        wUsages.add(new WaterUsageImpl(1,2,3,4,5));
//        wUsages.add(new WaterUsageImpl(2,3,4,5,7));
//        ArrayList<ElectricityUsageImpl> eUsages = new ArrayList<>();
//        eUsages.add(new ElectricityUsageImpl(1,2,3,4,9));
//        eUsages.add(new ElectricityUsageImpl(3,4,5,6,3310));

        // finish for testing part




        // Setting the GRPc Objects

        ArrayList<WaterUsage> wGrpcUsages = new ArrayList<>();
        ArrayList<ElectricityUsage> eGrpcUsages = new ArrayList<>();


        // add all the database water info in one GRPc Object
        for (WaterUsageImpl water : wUsages)
        {
            WaterUsage temporaryW = WaterUsage.newBuilder()
                    .setId(water.getId())
                    .setAmount(water.getAmount())
                    .setMonth(water.getMonth())
                    .setYear(water.getYear())
                    .setUserId(water.getUserId())
                    .build();

            wGrpcUsages.add(temporaryW);
        }


        // add all the database electricity info in one GRPc Object
        for (ElectricityUsageImpl electr : eUsages)
        {
            ElectricityUsage temporaryE = ElectricityUsage.newBuilder()
                    .setId(electr.getId())
                    .setAmount(electr.getAmount())
                    .setMonth(electr.getMonth())
                    .setYear(electr.getYear())
                    .setUserId(electr.getUserId())
                    .build();

            eGrpcUsages.add(temporaryE);
        }

        // Create the GRPc object to send

        ListUsage listUsage = ListUsage.newBuilder()
                .addAllWater(wGrpcUsages)
                .addAllElectricity(eGrpcUsages)
                .build();

        observer.onNext(listUsage);
        observer.onCompleted();

    }



}
