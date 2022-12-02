package via.sep3.tier2;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.stereotype.Service;
import via.generatedprotos.Empty;
import via.generatedprotos.ListElectricityUsage;
import via.generatedprotos.ListWaterUsage;
import via.generatedprotos.ResourcesConsumptionGrpc;
import via.sep3.tier2.model.ElectricityUsage;
import via.sep3.tier2.model.WaterUsage;

import java.util.ArrayList;


@Service
public class GrpcClient {


    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
    ResourcesConsumptionGrpc.ResourcesConsumptionBlockingStub stub = ResourcesConsumptionGrpc.newBlockingStub(channel);

    public static void main(String[] args) {

    }


    public ArrayList<WaterUsage> getWaterUsage() {
        ListWaterUsage response = stub.getWaterUsages(Empty.newBuilder().build());

        // get list of water usage from grpc
        ArrayList<via.generatedprotos.WaterUsage> wGrpc = new ArrayList<>(response.getWaterList());

        // create a model water usage list
        ArrayList<WaterUsage> wUsage = new ArrayList<>();

        // cast grpc object to model
        for (via.generatedprotos.WaterUsage w : wGrpc) {

            WaterUsage currentW = new WaterUsage(
                    w.getId(),
                    w.getAmount(),
                    w.getMonth(),
                    w.getYear(),
                    w.getUserId()
            );

            wUsage.add(currentW);
        }

        return wUsage;
    }

    public ArrayList<ElectricityUsage> getElectricityUsage() {
        ListElectricityUsage response = stub.getElectricityUsages(Empty.newBuilder().build());
        // get list of water usage from grpc
        ArrayList<via.generatedprotos.ElectricityUsage> eGrpc = new ArrayList<>(response.getElectricityList());

        // create a model water usage list
        ArrayList<ElectricityUsage> eUsage = new ArrayList<>();

        // cast grpc object to model
        for (via.generatedprotos.ElectricityUsage e : eGrpc) {

            ElectricityUsage currentE = new ElectricityUsage(
                    e.getId(),
                    e.getAmount(),
                    e.getMonth(),
                    e.getYear(),
                    e.getUserId()
            );

            eUsage.add(currentE);
        }

        return eUsage;
    }

}
