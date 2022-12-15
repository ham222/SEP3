package via.sep3.tier2.repository.implementations;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;
import via.generatedprotos.AdviceManagementGrpc;
import via.generatedprotos.Empty;
import via.generatedprotos.ListElectricityUsageAdvice;
import via.sep3.tier2.model.ElectricityUsageAdvice;
import via.sep3.tier2.repository.Interfaces.ElectricityAdviceRepository;

import java.util.ArrayList;

@Component
public class ElectricityAdviceRepositoryImpl implements ElectricityAdviceRepository {

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

    AdviceManagementGrpc.AdviceManagementBlockingStub adviceStub = AdviceManagementGrpc.newBlockingStub(channel);

    @Override
    public ElectricityUsageAdvice getAdviceById(int id) {

        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        via.generatedprotos.ElectricityUsageAdvice grpcResponse = null;
        try {
            grpcResponse = adviceStub.getElectricityUsageAdviceById(grpcId);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error getting electricity advice via gRPC service!");
        }

        if (grpcResponse != null) {
            return new via.sep3.tier2.model.ElectricityUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
    }

    @Override
    public ElectricityUsageAdvice createAdvice(ElectricityUsageAdvice electricityUsageAdvice) {
        via.generatedprotos.ElectricityUsageAdvice grpcAdvice = via.generatedprotos.ElectricityUsageAdvice.newBuilder()
                .setId(electricityUsageAdvice.getId())
                .setBody(electricityUsageAdvice.getText())
                .build();
        via.generatedprotos.ElectricityUsageAdvice grpcResponse = null;
        try {
            grpcResponse = adviceStub.createElectricityUsageAdvice(grpcAdvice);
        } catch (Exception e) {
            System.err.println("Error creating electricity advice via gRPC!\n" + e.getMessage());
        }
        if (grpcResponse != null) {
            return new via.sep3.tier2.model.ElectricityUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
    }

    @Override
    public void deleteAdviceById(int id) {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        try {
            adviceStub.deleteElectricityUsageAdvice(grpcId);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error deleting electricity advice via gRPC service!");
        }
    }

    public ArrayList<ElectricityUsageAdvice> getAllElectricityAdvice() {
        ArrayList<via.sep3.tier2.model.ElectricityUsageAdvice> advices = new ArrayList<>();
        ListElectricityUsageAdvice grpcUsers = adviceStub.getElectricityUsageAdvices(Empty.newBuilder().build());

        ArrayList<via.generatedprotos.ElectricityUsageAdvice> eGrpc = new ArrayList<>(grpcUsers.getElectricityList());


        for (via.generatedprotos.ElectricityUsageAdvice e : eGrpc) {

            via.sep3.tier2.model.ElectricityUsageAdvice currentE = new via.sep3.tier2.model.ElectricityUsageAdvice(
                    e.getId(),
                    e.getBody()
            );

            advices.add(currentE);
        }
        return advices;
    }

    @Override
    public ElectricityUsageAdvice editAdviceById(ElectricityUsageAdvice advice) {
        via.generatedprotos.ElectricityUsageAdvice grpcAdvice = via.generatedprotos.ElectricityUsageAdvice.newBuilder()
                .setId(advice.getId())
                .setBody(advice.getText())
                .build();
        via.generatedprotos.ElectricityUsageAdvice grpcResponse = null;
        try {
            grpcResponse = adviceStub.updateElectricityUsageAdvice(grpcAdvice);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error editing electricity advice via gRPC service!");
        }

        if (grpcResponse != null) {
            return new via.sep3.tier2.model.ElectricityUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
    }

    @Override
    public void assignElectricityAdvice(int id, int adviceId) {
        via.generatedprotos.AdviceCreation grpcAssign = via.generatedprotos.AdviceCreation.newBuilder()
                .setUserId(id)
                .setAdviceId(adviceId)
                .build();
        try {
            adviceStub.assignElectricityUsageAdviceToUser(grpcAssign);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error assigning electricity advice via gRPC service!");
        }
    }

    @Override
    public ElectricityUsageAdvice updateAdvice(ElectricityUsageAdvice fromPath) {
        via.generatedprotos.ElectricityUsageAdvice grpcAdvice = via.generatedprotos.ElectricityUsageAdvice.newBuilder()
                .setId(fromPath.getId())
                .setBody(fromPath.getText())
                .build();
        via.generatedprotos.ElectricityUsageAdvice grpcResponse = null;
        try {
            grpcResponse = adviceStub.updateElectricityUsageAdvice(grpcAdvice);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error updating electricity advice via gRPC service!");
        }

        if (grpcResponse != null) {
            return new via.sep3.tier2.model.ElectricityUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
    }

    @Override
    public ArrayList<ElectricityUsageAdvice> getElectricityAdviceByUserId(int id) {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        via.generatedprotos.ListElectricityUsageAdvice grpcResponse = null;
        try {
            grpcResponse = adviceStub.getElectricityAdvicesByUserId(grpcId);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error getting electricity advice via gRPC service!");
        }

        if (grpcResponse != null) {
            ArrayList<via.sep3.tier2.model.ElectricityUsageAdvice> advices = new ArrayList<>();
            for (via.generatedprotos.ElectricityUsageAdvice grpcAdvice : grpcResponse.getElectricityList()) {
                advices.add(new via.sep3.tier2.model.ElectricityUsageAdvice(
                        grpcAdvice.getId(),
                        grpcAdvice.getBody()
                ));
            }
            return advices;
        }
        return null;
    }

}
