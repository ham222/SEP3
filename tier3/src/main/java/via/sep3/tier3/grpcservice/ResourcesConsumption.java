package via.sep3.tier3.grpcservice;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.generatedprotos.*;

import via.sep3.tier3.database.entity.WaterUsageEntity;
import via.sep3.tier3.database.service.WaterUsageService;


import java.util.ArrayList;


@GRpcService
public class ResourcesConsumption extends ResourcesConsumptionGrpc.ResourcesConsumptionImplBase {

    private WaterUsageService waterUsageService;

    public ResourcesConsumption(WaterUsageService waterUsageService)
    {
        this.waterUsageService = waterUsageService;
    }


//    @Override
//    public void getElectricityUsage(Empty empty, StreamObserver<ListElectricityUsage> observer)
//    {
//
//        ArrayList<ElectricutyUsageEntity> wUsages = (ArrayList<WaterUsageEntity>) waterUsageService.getAllWaterUsages();
//
//        System.out.println(wUsages.toArray().toString());
//
//
//        // Setting the GRPc Objects
//
//        ArrayList<WaterUsage> wGrpcUsages = new ArrayList<>();
//
//        // add all the database water info in one GRPc Object
//        for (WaterUsageEntity water : wUsages)
//        {
//            System.out.println(water.getUser().getId());
//            WaterUsage temporaryW = WaterUsage.newBuilder()
//                    .setId(water.getId())
//                    .setAmount(water.getAmount())
//                    .setMonth(water.getMonth())
////                    .setUserId(water.getUserId())
//                    .setYear(water.getYear())
//                    .setUserId(water.getUser().getId())
//                    .build();
//
//            wGrpcUsages.add(temporaryW);
//        }
//
//        ListWaterUsage listWaterUsage = ListWaterUsage.newBuilder()
//                .addAllWater(wGrpcUsages)
//                .build();
//
//        observer.onNext(listWaterUsage);
//        observer.onCompleted();
//
//    }
    
    @Override
    public void getWaterUsage(Empty empty, StreamObserver<ListWaterUsage> observer)
    {

        ArrayList<WaterUsageEntity> wUsages = (ArrayList<WaterUsageEntity>) waterUsageService.getAllWaterUsages();

        System.out.println(wUsages.toArray().toString());


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



}
