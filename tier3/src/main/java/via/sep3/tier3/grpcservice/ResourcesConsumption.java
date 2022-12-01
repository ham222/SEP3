package via.sep3.tier3.grpcservice;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.generatedprotos.*;

import via.sep3.tier3.database.entity.ElectricityUsageEntity;
import via.sep3.tier3.database.entity.WaterUsageEntity;
import via.sep3.tier3.database.service.ElectricityUsageService;
import via.sep3.tier3.database.service.UserService;
import via.sep3.tier3.database.service.WaterUsageService;


import java.util.ArrayList;
import java.util.List;


@GRpcService
public class ResourcesConsumption extends ResourcesConsumptionGrpc.ResourcesConsumptionImplBase
{

    private WaterUsageService waterUsageService;
    private ElectricityUsageService electricityUsageService;
    private UserService userService;

    public ResourcesConsumption(WaterUsageService waterUsageService, ElectricityUsageService electricityUsageService, UserService userService)
    {
        this.waterUsageService = waterUsageService;
        this.electricityUsageService = electricityUsageService;
        this.userService = userService;
    }

    @Override
    public void getElectricityUsages(Empty empty, StreamObserver<ListElectricityUsage> observer)
    {
        ArrayList<ElectricityUsageEntity> eUsages = (ArrayList<ElectricityUsageEntity>) electricityUsageService.getAllElectricityUsages();
        // Setting the GRPc Objects
        ArrayList<ElectricityUsage> eGrpcUsages = new ArrayList<>();
        // add all the database water info in one GRPc Object
        for (ElectricityUsageEntity electr : eUsages)
        {
            System.out.println(electr.getUser().getId());
            ElectricityUsage temporaryE = ElectricityUsage.newBuilder()
                    .setId(electr.getId())
                    .setAmount(electr.getAmount())
                    .setMonth(electr.getMonth())
                    .setYear(electr.getYear())
                    .setUserId(electr.getUser().getId())
                    .build();

            eGrpcUsages.add(temporaryE);
        }

        ListElectricityUsage listElectricityrUsage = ListElectricityUsage.newBuilder()
                .addAllElectricity(eGrpcUsages)
                .build();

        observer.onNext(listElectricityrUsage);
        observer.onCompleted();
    }

    @Override
    public void getWaterUsages(Empty empty, StreamObserver<ListWaterUsage> observer)
    {
        ArrayList<WaterUsageEntity> wUsages = (ArrayList<WaterUsageEntity>) waterUsageService.getAllWaterUsages();
        // Setting the GRPc Objects
        ArrayList<WaterUsage> wGrpcUsages = new ArrayList<>();
        // add all the database water info in one GRPc Object
        for (WaterUsageEntity water : wUsages)
        {
            System.out.println(water.getUser().getId());
            WaterUsage temporaryW = WaterUsage.newBuilder()
                    .setId(water.getId())
                    .setAmount(water.getAmount())
                    .setMonth(water.getMonth())
//                    .setUserId(water.getUserId())
                    .setYear(water.getYear())
                    .setUserId(water.getUser().getId())
                    .build();

            wGrpcUsages.add(temporaryW);
        }
        ListWaterUsage listWaterUsage = ListWaterUsage.newBuilder()
                .addAllWater(wGrpcUsages)
                .build();

        observer.onNext(listWaterUsage);
        observer.onCompleted();

    }

    @Override
    public void logWaterUsage(WaterUsage waterUsage, StreamObserver<WaterUsage> observer)
    {

        WaterUsageEntity waterUsageEntity = new WaterUsageEntity();
        waterUsageEntity.setAmount(waterUsage.getAmount());
        waterUsageEntity.setMonth(waterUsage.getMonth());
        waterUsageEntity.setYear(waterUsage.getYear());
        waterUsageEntity.setUser(userService.getUserById(waterUsage.getUserId()));

        WaterUsageEntity returnedWaterUsageEntity = waterUsageService.saveWaterUsage(waterUsageEntity);

        WaterUsage returnedWaterUsage = WaterUsage.newBuilder()
                .setId(returnedWaterUsageEntity.getId())
                .setAmount(returnedWaterUsageEntity.getAmount())
                .setMonth(returnedWaterUsageEntity.getMonth())
                .setYear(returnedWaterUsageEntity.getYear())
                .setUserId(returnedWaterUsageEntity.getUser().getId())
                .build();

        observer.onNext(returnedWaterUsage);
        observer.onCompleted();

    }

    @Override
    public void logElectricityUsage(ElectricityUsage electricityUsage, StreamObserver<ElectricityUsage> observer)
    {

        ElectricityUsageEntity electricityUsageEntity = new ElectricityUsageEntity();
        electricityUsageEntity.setAmount(electricityUsage.getAmount());
        electricityUsageEntity.setMonth(electricityUsage.getMonth());
        electricityUsageEntity.setYear(electricityUsage.getYear());
        electricityUsageEntity.setUser(userService.getUserById(electricityUsage.getUserId()));

        ElectricityUsageEntity returnedElectricityUsageEntity = electricityUsageService.saveElectricityUsage(electricityUsageEntity);

        ElectricityUsage returnedElectricityUsage = ElectricityUsage.newBuilder()
                .setId(returnedElectricityUsageEntity.getId())
                .setAmount(returnedElectricityUsageEntity.getAmount())
                .setMonth(returnedElectricityUsageEntity.getMonth())
                .setYear(returnedElectricityUsageEntity.getYear())
                .setUserId(returnedElectricityUsageEntity.getUser().getId())
                .build();


        observer.onNext(returnedElectricityUsage);
        observer.onCompleted();
    }

    @Override
    public void getWaterUsageById(ID id, StreamObserver<WaterUsage> observer)
    {
        WaterUsageEntity waterUsageEntity = waterUsageService.getWaterUsageById(id.getId());
        WaterUsage returnedWaterUsage = WaterUsage.newBuilder()
                .setId(waterUsageEntity.getId())
                .setAmount(waterUsageEntity.getAmount())
                .setMonth(waterUsageEntity.getMonth())
                .setYear(waterUsageEntity.getYear())
                .setUserId(waterUsageEntity.getUser().getId())
                .build();

        observer.onNext(returnedWaterUsage);
        observer.onCompleted();
    }

    @Override
    public void getElectricityUsageById(ID id, StreamObserver<ElectricityUsage> observer)
    {
        ElectricityUsageEntity electricityUsageEntity = electricityUsageService.getElectricityUsageById(id.getId());
        ElectricityUsage returnedElectricityUsage = ElectricityUsage.newBuilder()
                .setId(electricityUsageEntity.getId())
                .setAmount(electricityUsageEntity.getAmount())
                .setMonth(electricityUsageEntity.getMonth())
                .setYear(electricityUsageEntity.getYear())
                .setUserId(electricityUsageEntity.getUser().getId())
                .build();

        observer.onNext(returnedElectricityUsage);
        observer.onCompleted();
    }

    @Override
    public void updateWaterUsage(WaterUsage waterUsage, StreamObserver<WaterUsage> observer)
    {
        WaterUsageEntity waterUsageEntity = new WaterUsageEntity();
        waterUsageEntity.setId(waterUsage.getId());
        waterUsageEntity.setAmount(waterUsage.getAmount());
        waterUsageEntity.setMonth(waterUsage.getMonth());
        waterUsageEntity.setYear(waterUsage.getYear());
        waterUsageEntity.setUser(userService.getUserById(waterUsage.getUserId()));

        WaterUsageEntity returnedWaterUsageEntity = waterUsageService.updateWaterUsage(waterUsageEntity);

        WaterUsage returnedWaterUsage = WaterUsage.newBuilder()
                .setId(returnedWaterUsageEntity.getId())
                .setAmount(returnedWaterUsageEntity.getAmount())
                .setMonth(returnedWaterUsageEntity.getMonth())
                .setYear(returnedWaterUsageEntity.getYear())
                .setUserId(returnedWaterUsageEntity.getUser().getId())
                .build();

        observer.onNext(returnedWaterUsage);
        observer.onCompleted();
    }

    @Override
    public void updateElectricityUsage(ElectricityUsage electricityUsage, StreamObserver<ElectricityUsage> observer)
    {
        ElectricityUsageEntity electricityUsageEntity = new ElectricityUsageEntity();
        electricityUsageEntity.setId(electricityUsage.getId());
        electricityUsageEntity.setAmount(electricityUsage.getAmount());
        electricityUsageEntity.setMonth(electricityUsage.getMonth());
        electricityUsageEntity.setYear(electricityUsage.getYear());
        electricityUsageEntity.setUser(userService.getUserById(electricityUsage.getUserId()));

        ElectricityUsageEntity returnedElectricityUsageEntity = electricityUsageService.updateElectricityUsage(electricityUsageEntity);

        ElectricityUsage returnedElectricityUsage = ElectricityUsage.newBuilder()
                .setId(returnedElectricityUsageEntity.getId())
                .setAmount(returnedElectricityUsageEntity.getAmount())
                .setMonth(returnedElectricityUsageEntity.getMonth())
                .setYear(returnedElectricityUsageEntity.getYear())
                .setUserId(returnedElectricityUsageEntity.getUser().getId())
                .build();

        observer.onNext(returnedElectricityUsage);
        observer.onCompleted();
    }

    @Override
    public void deleteWaterUsage(ID id, StreamObserver<Empty> observer)
    {
        waterUsageService.deleteWaterUsage(id.getId());
        observer.onNext(Empty.newBuilder().build());
        observer.onCompleted();
    }

    @Override
    public void deleteElectricityUsage(ID id, StreamObserver<Empty> observer)
    {
        electricityUsageService.deleteElectricityUsage(id.getId());
        observer.onNext(Empty.newBuilder().build());
        observer.onCompleted();
    }


    @Override
    public void getWaterUsageByUserId(ID id, StreamObserver<ListWaterUsage> observer)
    {
        ArrayList<WaterUsageEntity> waterUsageEntities = waterUsageService.getWaterUsageByUserId(id.getId());
        ArrayList<WaterUsage> grpcWaterUsage = new ArrayList<>();
        for (WaterUsageEntity waterUsageEntity : waterUsageEntities)
        {
            WaterUsage waterUsage = WaterUsage.newBuilder()
                    .setId(waterUsageEntity.getId())
                    .setAmount(waterUsageEntity.getAmount())
                    .setMonth(waterUsageEntity.getMonth())
                    .setYear(waterUsageEntity.getYear())
                    .setUserId(waterUsageEntity.getUser().getId())
                    .build();
            grpcWaterUsage.add(waterUsage);
        }
        ListWaterUsage listWaterUsageBuilder = ListWaterUsage.newBuilder().addAllWater(grpcWaterUsage).build();
        observer.onNext(listWaterUsageBuilder);
        observer.onCompleted();
    }

    @Override
    public void getElectricityUsageByUserId(ID id, StreamObserver<ListElectricityUsage> observer)
    {
        ArrayList<ElectricityUsageEntity> electricityUsageEntities = electricityUsageService.getElectricityUsageByUserId(id.getId());
        ArrayList<ElectricityUsage> grpcElectricityUsage = new ArrayList<>();
        for (ElectricityUsageEntity electricityUsageEntity : electricityUsageEntities)
        {
            ElectricityUsage electricityUsage = ElectricityUsage.newBuilder()
                    .setId(electricityUsageEntity.getId())
                    .setAmount(electricityUsageEntity.getAmount())
                    .setMonth(electricityUsageEntity.getMonth())
                    .setYear(electricityUsageEntity.getYear())
                    .setUserId(electricityUsageEntity.getUser().getId())
                    .build();
            grpcElectricityUsage.add(electricityUsage);
        }
        ListElectricityUsage listElectricityUsageBuilder = ListElectricityUsage.newBuilder().addAllElectricity(grpcElectricityUsage).build();
        observer.onNext(listElectricityUsageBuilder);
        observer.onCompleted();
    }


}
