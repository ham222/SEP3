package via.sep3.tier2.repository.implementations;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;
import via.generatedprotos.Empty;
import via.generatedprotos.ListElectricityUsage;
import via.generatedprotos.ResourcesConsumptionGrpc;
import via.sep3.tier2.model.ElectricityUsage;
import via.sep3.tier2.repository.Interfaces.ElectricityUsageRepository;

import java.util.ArrayList;

@Component
public class ElectricityUsageRepositoryImpl implements ElectricityUsageRepository {

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

    ResourcesConsumptionGrpc.ResourcesConsumptionBlockingStub stubResources = ResourcesConsumptionGrpc.newBlockingStub(channel);


    private ElectricityUsageRepositoryImpl() {
    }

    @Override
    public ArrayList<ElectricityUsage> getUserElectricityUsages(int id) {


        ArrayList<ElectricityUsage> usages = getAllElectricityUsages();

        ArrayList<ElectricityUsage> userW = new ArrayList<>();

        for (ElectricityUsage currentW : usages) {

            if (currentW.getUserId() == id) {
                userW.add(currentW);
            }

        }
        return userW;
    }

    @Override
    public ArrayList<ElectricityUsage> getAllElectricityUsages() {
        ListElectricityUsage response = stubResources.getElectricityUsages(Empty.newBuilder().build());
        // get list of water usage from grpc
        ArrayList<via.generatedprotos.ElectricityUsage> eGrpc = new ArrayList<>(response.getElectricityList());

        // create a model water usage list
        ArrayList<ElectricityUsage> eUsage = new ArrayList<>();

        // cast grpc object to model
        for (via.generatedprotos.ElectricityUsage e : eGrpc) {

            ElectricityUsage currentE = new ElectricityUsage(
                    e.getId(),
                    (int) e.getAmount(),
                    e.getMonth(),
                    e.getYear(),
                    e.getUserId()
            );

            eUsage.add(currentE);
        }

        return eUsage;
    }

    @Override
    public ElectricityUsage insertElectricityUsage(ElectricityUsage electricityUsage) {
        via.generatedprotos.ElectricityUsage e = via.generatedprotos.ElectricityUsage.newBuilder()
                .setId(electricityUsage.getId())
                .setAmount(electricityUsage.getAmount())
                .setMonth(electricityUsage.getMonth())
                .setYear(electricityUsage.getYear())
                .setUserId(electricityUsage.getUserId())
                .build();

        via.generatedprotos.ElectricityUsage response = null;
        try {
            response = stubResources.logElectricityUsage(e);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error logging electricity usage via gRPC service! ");
        }
        if (response != null) {
            return new ElectricityUsage(
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
    public ElectricityUsage editElectricityUsage(ElectricityUsage usage) {
        via.generatedprotos.ElectricityUsage grpcUsage = via.generatedprotos.ElectricityUsage.newBuilder()
                .setId(usage.getId())
                .setUserId(usage.getUserId())
                .setAmount(usage.getAmount())
                .setMonth(usage.getMonth())
                .setYear(usage.getYear())
                .build();
        via.generatedprotos.ElectricityUsage response = null;
        try {
            response = stubResources.updateElectricityUsage(grpcUsage);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error editing electricity usage via gRPC service!");
        }

        if (response != null) {
            return new ElectricityUsage(
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
    public void deleteElectricityUsage(int id) {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        try {
            stubResources.deleteElectricityUsage(grpcId);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error deleting electricity usage via gRPC service!");
        }
    }

}
