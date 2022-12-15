package via.sep3.tier2.repository.implementations;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;
import via.generatedprotos.Empty;
import via.generatedprotos.ListWaterUsage;
import via.generatedprotos.ResourcesConsumptionGrpc;
import via.sep3.tier2.model.WaterUsage;
import via.sep3.tier2.repository.Interfaces.WaterUsageRepository;

import java.util.ArrayList;

@Component
public class WaterUsageRepositoryImpl implements WaterUsageRepository {

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

    ResourcesConsumptionGrpc.ResourcesConsumptionBlockingStub stubResources = ResourcesConsumptionGrpc.newBlockingStub(channel);

    private WaterUsageRepositoryImpl() {
    }


    @Override
    public ArrayList<WaterUsage> getUserWaterUsages(int id) {
        ArrayList<WaterUsage> usages = getAllWaterUsages();

        ArrayList<WaterUsage> userW = new ArrayList<>();

        for (WaterUsage currentW : usages) {

            if (currentW.getUserId() == id) {
                userW.add(currentW);
            }

        }
        return userW;
    }

    @Override
    public WaterUsage insertWaterUsage(WaterUsage usage) {
        via.generatedprotos.WaterUsage e = via.generatedprotos.WaterUsage.newBuilder()
                .setId(usage.getId())
                .setAmount(usage.getAmount())
                .setMonth(usage.getMonth())
                .setYear(usage.getYear())
                .setUserId(usage.getUserId())
                .build();

        via.generatedprotos.WaterUsage grpcResponse = null;
        try {
            grpcResponse = stubResources.logWaterUsage(e);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error logging water usage via gRPC service! ");
        }

        WaterUsage response = new WaterUsage(
                grpcResponse.getId(),
                (int) grpcResponse.getAmount(),
                grpcResponse.getMonth(),
                grpcResponse.getYear(),
                grpcResponse.getUserId()
        );

        return response;
    }

    @Override
    public WaterUsage editWaterUsage(WaterUsage fromPath) {
        via.generatedprotos.WaterUsage grpcUsage = via.generatedprotos.WaterUsage.newBuilder()
                .setId(fromPath.getId())
                .setUserId(fromPath.getUserId())
                .setAmount(fromPath.getAmount())
                .setMonth(fromPath.getMonth())
                .setYear(fromPath.getYear())
                .build();
        via.generatedprotos.WaterUsage response = null;
        try {
            response = stubResources.updateWaterUsage(grpcUsage);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error editing water usage via gRPC service!");
        }

        if (response != null) {
            return new WaterUsage(
                    response.getId(),
                    (int) response.getAmount(),
                    response.getMonth(),
                    response.getYear(),
                    response.getUserId()
            );
        }
        return null;
    }

    @Override
    public void deleteWaterUsage(int id) {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        try {
            stubResources.deleteWaterUsage(grpcId);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error deleting water usage via gRPC service!");
        }
    }

    @Override
    public ArrayList<WaterUsage> getAllWaterUsages() {
        ListWaterUsage response = stubResources.getWaterUsages(Empty.newBuilder().build());

        // get list of water usage from grpc
        ArrayList<via.generatedprotos.WaterUsage> wGrpc = new ArrayList<>(response.getWaterList());

        // create a model water usage list
        ArrayList<WaterUsage> wUsage = new ArrayList<>();

        // cast grpc object to model
        for (via.generatedprotos.WaterUsage w : wGrpc) {

            WaterUsage currentW = new WaterUsage(
                    w.getId(),
                    (int) w.getAmount(),
                    w.getMonth(),
                    w.getYear(),
                    w.getUserId()
            );

            wUsage.add(currentW);
        }

        return wUsage;
    }
}
