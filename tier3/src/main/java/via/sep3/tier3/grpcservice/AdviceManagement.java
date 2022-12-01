package via.sep3.tier3.grpcservice;


import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.generatedprotos.*;
import via.sep3.tier3.database.entity.ElectricityAdviceEntity;
import via.sep3.tier3.database.entity.UserEntity;
import via.sep3.tier3.database.entity.WaterAdviceEntity;
import via.sep3.tier3.database.repository.ElectricityAdviceRepository;
import via.sep3.tier3.database.repository.WaterAdviceRepository;
import via.sep3.tier3.database.service.ElectricityAdviceService;
import via.sep3.tier3.database.service.UserService;
import via.sep3.tier3.database.service.WaterAdviceService;

import java.util.ArrayList;
import java.util.List;

@GRpcService
public class AdviceManagement extends AdviceManagementGrpc.AdviceManagementImplBase
{
    WaterAdviceService waterAdviceService;
    ElectricityAdviceService electricityAdviceService;
    UserService userService;

    public AdviceManagement(WaterAdviceService waterAdviceService, ElectricityAdviceService electricityAdviceService, UserService userService)
    {
        this.waterAdviceService = waterAdviceService;
        this.electricityAdviceService = electricityAdviceService;
        this.userService = userService;
    }

    @Override
    public void createWaterUsageAdvice(WaterUsageAdvice waterUsageAdvice, StreamObserver<WaterUsageAdvice> observer)
    {
        WaterAdviceEntity waterAdviceEntity = new WaterAdviceEntity();
        waterAdviceEntity.setText(waterUsageAdvice.getBody());
        waterAdviceEntity = waterAdviceService.saveWaterAdvice(waterAdviceEntity);

        WaterUsageAdvice waterUsageAdviceToSend = WaterUsageAdvice.newBuilder()
                .setId(waterAdviceEntity.getId())
                .setBody(waterAdviceEntity.getText())
                .build();

        observer.onNext(waterUsageAdviceToSend);
        observer.onCompleted();
    }

    @Override
    public void createElectricityUsageAdvice(ElectricityUsageAdvice electricityUsageAdvice, StreamObserver<ElectricityUsageAdvice> observer)
    {
        ElectricityAdviceEntity electricityAdviceEntity = new ElectricityAdviceEntity();
        electricityAdviceEntity.setText(electricityUsageAdvice.getBody());
        electricityAdviceEntity = electricityAdviceService.saveElectricityAdvice(electricityAdviceEntity);

        ElectricityUsageAdvice electricityUsageAdviceToSend = ElectricityUsageAdvice.newBuilder()
                .setId(electricityAdviceEntity.getId())
                .setBody(electricityAdviceEntity.getText())
                .build();

        observer.onNext(electricityUsageAdviceToSend);
        observer.onCompleted();
    }

    @Override
    public void deleteWaterUsageAdvice(ID id, StreamObserver<Empty> observer)
    {
        waterAdviceService.deleteWaterAdvice(id.getId());
        observer.onNext(Empty.newBuilder().build());
        observer.onCompleted();
    }

    @Override
    public void deleteElectricityUsageAdvice(ID id, StreamObserver<Empty> observer)
    {
        electricityAdviceService.deleteElectricityAdvice(id.getId());
        observer.onNext(Empty.newBuilder().build());
        observer.onCompleted();
    }

    @Override
    public void updateWaterUsageAdvice(WaterUsageAdvice waterUsageAdvice, StreamObserver<WaterUsageAdvice> observer)
    {
        WaterAdviceEntity waterAdviceEntity = new WaterAdviceEntity();
        waterAdviceEntity.setId(waterUsageAdvice.getId());
        waterAdviceEntity.setText(waterUsageAdvice.getBody());
        waterAdviceService.updateWaterAdvice(waterAdviceEntity);
        WaterUsageAdvice waterUsageAdviceToSend = WaterUsageAdvice.newBuilder()
                .setId(waterUsageAdvice.getId())
                .setBody(waterUsageAdvice.getBody())
                .build();
        observer.onNext(waterUsageAdviceToSend);
        observer.onCompleted();
    }

    @Override
    public void updateElectricityUsageAdvice(ElectricityUsageAdvice electricityUsageAdvice, StreamObserver<ElectricityUsageAdvice> observer)
    {
        ElectricityAdviceEntity electricityAdviceEntity = new ElectricityAdviceEntity();
        electricityAdviceEntity.setId(electricityUsageAdvice.getId());
        electricityAdviceEntity.setText(electricityUsageAdvice.getBody());
        electricityAdviceService.updateElectricityAdvice(electricityAdviceEntity);
        ElectricityUsageAdvice electricityUsageAdviceToSend = ElectricityUsageAdvice.newBuilder()
                .setId(electricityUsageAdvice.getId())
                .setBody(electricityUsageAdvice.getBody())
                .build();
        observer.onNext(electricityUsageAdviceToSend);
        observer.onCompleted();
    }

    @Override
    public void getWaterUsageAdvices(Empty empty, StreamObserver<ListWaterUsageAdvice> observer)
    {
        ArrayList<WaterAdviceEntity> waterAdviceEntities = (ArrayList<WaterAdviceEntity>) waterAdviceService.getAllWaterAdvices();

        ArrayList<WaterUsageAdvice> waterUsageAdvices = new ArrayList<>();

        for (WaterAdviceEntity waterAdviceEntity : waterAdviceEntities)
        {
            WaterUsageAdvice waterUsageAdvice = WaterUsageAdvice.newBuilder()
                    .setId(waterAdviceEntity.getId())
                    .setBody(waterAdviceEntity.getText())
                    .build();
            waterUsageAdvices.add(waterUsageAdvice);
        }

        ListWaterUsageAdvice listWaterUsageAdvice = ListWaterUsageAdvice.newBuilder()
                .addAllWater(waterUsageAdvices).build();

        observer.onNext(listWaterUsageAdvice);
        observer.onCompleted();
    }

    @Override
    public void getElectricityUsageAdvices(Empty empty, StreamObserver<ListElectricityUsageAdvice> observer)
    {
        ArrayList<ElectricityAdviceEntity> electricityAdviceEntities = (ArrayList<ElectricityAdviceEntity>) electricityAdviceService.getAllElectricityAdvices();

        ArrayList<ElectricityUsageAdvice> electricityUsageAdvices = new ArrayList<>();

        for (ElectricityAdviceEntity electricityAdviceEntity : electricityAdviceEntities)
        {
            ElectricityUsageAdvice electricityUsageAdvice = ElectricityUsageAdvice.newBuilder()
                    .setId(electricityAdviceEntity.getId())
                    .setBody(electricityAdviceEntity.getText())
                    .build();
            electricityUsageAdvices.add(electricityUsageAdvice);
        }

        ListElectricityUsageAdvice listElectricityUsageAdvice = ListElectricityUsageAdvice.newBuilder()
                .addAllElectricity(electricityUsageAdvices).build();

        observer.onNext(listElectricityUsageAdvice);
        observer.onCompleted();
    }

    @Override
    public void getWaterUsageAdviceById(ID id, StreamObserver<WaterUsageAdvice> observer)
    {
        WaterAdviceEntity waterAdviceEntity = waterAdviceService.getWaterAdviceById(id.getId());
        WaterUsageAdvice waterUsageAdvice = WaterUsageAdvice.newBuilder()
                .setId(waterAdviceEntity.getId())
                .setBody(waterAdviceEntity.getText())
                .build();
        observer.onNext(waterUsageAdvice);
        observer.onCompleted();
    }

    @Override
    public void getElectricityUsageAdviceById(ID id, StreamObserver<ElectricityUsageAdvice> observer)
    {
        ElectricityAdviceEntity electricityAdviceEntity = electricityAdviceService.getElectricityAdviceById(id.getId());
        ElectricityUsageAdvice electricityUsageAdvice = ElectricityUsageAdvice.newBuilder()
                .setId(electricityAdviceEntity.getId())
                .setBody(electricityAdviceEntity.getText())
                .build();
        observer.onNext(electricityUsageAdvice);
        observer.onCompleted();
    }

    @Override
    public void getElectricityAdvicesByUserId(ID id, StreamObserver<ListElectricityUsageAdvice> observer)
    {

        ArrayList<ElectricityAdviceEntity> electricityAdviceEntities = (ArrayList<ElectricityAdviceEntity>) electricityAdviceService.getElectricityAdviceByUserId(id.getId());
        ArrayList<ElectricityUsageAdvice> electricityUsageAdvices = new ArrayList<>();

        for (  ElectricityAdviceEntity electricityAdviceEntity : electricityAdviceEntities)
        {
            ElectricityUsageAdvice electricityUsageAdvice = ElectricityUsageAdvice.newBuilder()
                    .setId(electricityAdviceEntity.getId())
                    .setBody(electricityAdviceEntity.getText())
                    .build();
            electricityUsageAdvices.add(electricityUsageAdvice);

        }
        ListElectricityUsageAdvice listElectricityUsageAdvice = ListElectricityUsageAdvice.newBuilder()
                .addAllElectricity(electricityUsageAdvices).build();
        observer.onNext(listElectricityUsageAdvice);
        observer.onCompleted();
    }
    @Override
    public void getWaterAdvicesByUserId(ID id, StreamObserver<ListWaterUsageAdvice> observer)
    {

        ArrayList<WaterAdviceEntity> waterAdviceEntities = (ArrayList<WaterAdviceEntity>) waterAdviceService.getWaterAdviceByUserId(id.getId());
        ArrayList<WaterUsageAdvice> waterUsageAdvices = new ArrayList<>();

        for (  WaterAdviceEntity waterAdviceEntity : waterAdviceEntities)
        {
            WaterUsageAdvice waterUsageAdvice = WaterUsageAdvice.newBuilder()
                    .setId(waterAdviceEntity.getId())
                    .setBody(waterAdviceEntity.getText())
                    .build();
            waterUsageAdvices.add(waterUsageAdvice);

        }
        ListWaterUsageAdvice listWaterUsageAdvice = ListWaterUsageAdvice.newBuilder()
                .addAllWater(waterUsageAdvices).build();
        observer.onNext(listWaterUsageAdvice);
        observer.onCompleted();
    }

    @Override
    public void assignWaterUsageAdviceToUser(AdviceCreation adviceCreation, StreamObserver<ListWaterUsageAdvice> observer)
    {
        WaterAdviceEntity waterAdviceEntity = waterAdviceService.getWaterAdviceById(adviceCreation.getAdviceId());
        UserEntity userEntity = userService.getUserById(adviceCreation.getUserId());

        waterAdviceService.assignWaterAdviceToUser(userEntity, waterAdviceEntity);
        getWaterAdvicesByUserId(ID.newBuilder().setId(adviceCreation.getUserId()).build(), observer);

//        observer.onNext(ListWaterUsageAdvice.newBuilder().build());
//        observer.onCompleted();
    }

    @Override
    public void assignElectricityUsageAdviceToUser(AdviceCreation adviceCreation, StreamObserver<ListElectricityUsageAdvice> observer)
    {
        ElectricityAdviceEntity electricityAdviceEntity = electricityAdviceService.getElectricityAdviceById(adviceCreation.getAdviceId());
        UserEntity userEntity = userService.getUserById(adviceCreation.getUserId());

        electricityAdviceService.assignElectricityAdviceToUser(userEntity, electricityAdviceEntity);
        getElectricityAdvicesByUserId(ID.newBuilder().setId(adviceCreation.getUserId()).build(), observer);


//        observer.onNext(ListElectricityUsageAdvice.newBuilder().build());
//        observer.onCompleted();
    }

}
