package via.sep3.tier2;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.generatedprotos.*;
import via.sep3.tier2.model.ElectricityUsageImpl;
import via.sep3.tier2.model.UsageListImpl;
import via.sep3.tier2.model.WaterUsageImpl;

import java.util.ArrayList;


public class GrpcClient {


    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
    ResourcesConsumptionGrpc.ResourcesConsumptionBlockingStub stub = ResourcesConsumptionGrpc.newBlockingStub(channel);

    public static void main(String[] args) {

    }


    public UsageListImpl getUsage() {
        ListUsage response = stub.getUsage(Empty.newBuilder().build());

        // get list of water usage from grpc
        ArrayList<WaterUsage> wGrpc = new ArrayList<>(response.getWaterList());

        // create a model water usage list
        ArrayList<WaterUsageImpl> wUsage = new ArrayList<>();

        // cast grpc object to model
        for (WaterUsage w : wGrpc) {

            WaterUsageImpl currentW = new WaterUsageImpl(
                    w.getId(),
                    w.getAmount(),
                    w.getMonth(),
                    w.getYear(),
                    w.getUserId()
            );

            wUsage.add(currentW);
        }

        // get list of water usage from grpc
        ArrayList<ElectricityUsage> eGrpc = new ArrayList<>(response.getElectricityList());

        // create a model water usage list
        ArrayList<ElectricityUsageImpl> eUsage = new ArrayList<>();

        // cast grpc object to model
        for (ElectricityUsage e : eGrpc) {

            ElectricityUsageImpl currentE = new ElectricityUsageImpl(
                    e.getId(),
                    e.getAmount(),
                    e.getMonth(),
                    e.getYear(),
                    e.getUserId()
            );

            eUsage.add(currentE);
        }


        UsageListImpl usageList = UsageListImpl.getInstance();
        usageList.seteUsage(eUsage);
        usageList.setwUsage(wUsage);
        return usageList;
    }


    //TextConverterGrpc.TextConverterBlockingStub stub = TextConverterGrpc.newBlockingStub(channel);
//    RequestText request = RequestText.newBuilder().setInputText("Lets try").build();
//
//    RequestText request2 = RequestText.newBuilder().setInputText("lets get it try").build();
//
//    ResponseText response = stub.toUpper(request);
//        System.out.println("Received: " + response.getOutputText());
//
//    ResponseText response2 = stub.capitalizeFirstCharacter(request2);
//        System.out.println("Received: " + response2.getOutputText());
//
//        channel.shutdown();
}
