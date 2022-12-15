package via.sep3.tier2.repository.implementations;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;
import via.generatedprotos.AdviceManagementGrpc;
import via.generatedprotos.Empty;
import via.generatedprotos.ListWaterUsageAdvice;
import via.sep3.tier2.model.WaterUsageAdvice;
import via.sep3.tier2.repository.Interfaces.WaterAdviceRepository;

import java.util.ArrayList;

@Component
public class WaterAdviceRepositoryImpl implements WaterAdviceRepository {

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

    AdviceManagementGrpc.AdviceManagementBlockingStub adviceStub = AdviceManagementGrpc.newBlockingStub(channel);

    @Override
    public WaterUsageAdvice getAdviceById(int id) {

        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        via.generatedprotos.WaterUsageAdvice grpcResponse = null;
        try {
            grpcResponse = adviceStub.getWaterUsageAdviceById(grpcId);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error getting water advice via gRPC service!");
        }

        if (grpcResponse != null) {
            return new via.sep3.tier2.model.WaterUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
    }

    @Override
    public WaterUsageAdvice createAdvice(WaterUsageAdvice waterUsageAdvice) {
        via.generatedprotos.WaterUsageAdvice grpcAdvice = via.generatedprotos.WaterUsageAdvice.newBuilder()
                .setId(waterUsageAdvice.getId())
                .setBody(waterUsageAdvice.getText())
                .build();
        via.generatedprotos.WaterUsageAdvice grpcResponse = null;
        try {
            grpcResponse = adviceStub.createWaterUsageAdvice(grpcAdvice);
        } catch (Exception e) {
            System.err.println("Error creating water advice via gRPC!\n" + e.getMessage());
        }
        if (grpcResponse != null) {
            return new via.sep3.tier2.model.WaterUsageAdvice(
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
            adviceStub.deleteWaterUsageAdvice(grpcId);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error deleting water advice via gRPC service!");
        }
    }


    public ArrayList<WaterUsageAdvice> getAllWaterAdvice() {
        ArrayList<via.sep3.tier2.model.WaterUsageAdvice> advices = new ArrayList<>();
        ListWaterUsageAdvice grpcUsers = adviceStub.getWaterUsageAdvices(Empty.newBuilder().build());

        ArrayList<via.generatedprotos.WaterUsageAdvice> eGrpc = new ArrayList<>(grpcUsers.getWaterList());


        for (via.generatedprotos.WaterUsageAdvice e : eGrpc) {

            via.sep3.tier2.model.WaterUsageAdvice currentE = new via.sep3.tier2.model.WaterUsageAdvice(
                    e.getId(),
                    e.getBody()
            );

            advices.add(currentE);
        }
        return advices;
    }

    @Override
    public WaterUsageAdvice editAdviceById(WaterUsageAdvice fromPath) {
        via.generatedprotos.WaterUsageAdvice grpcAdvice = via.generatedprotos.WaterUsageAdvice.newBuilder()
                .setId(fromPath.getId())
                .setBody(fromPath.getText())
                .build();
        via.generatedprotos.WaterUsageAdvice grpcResponse = null;
        try {
            grpcResponse = adviceStub.updateWaterUsageAdvice(grpcAdvice);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error editing water advice via gRPC service!");
        }

        if (grpcResponse != null) {
            return new via.sep3.tier2.model.WaterUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
    }

    @Override
    public void assignWaterAdvice(int id, int adviceId) {
        via.generatedprotos.AdviceCreation grpcAssign = via.generatedprotos.AdviceCreation.newBuilder()
                .setUserId(id)
                .setAdviceId(adviceId)
                .build();
        try {
            adviceStub.assignWaterUsageAdviceToUser(grpcAssign);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error assigning water advice via gRPC service!");
        }
    }

    @Override
    public WaterUsageAdvice updateAdvice(WaterUsageAdvice fromPath) {
        via.generatedprotos.WaterUsageAdvice grpcAdvice = via.generatedprotos.WaterUsageAdvice.newBuilder()
                .setId(fromPath.getId())
                .setBody(fromPath.getText())
                .build();
        via.generatedprotos.WaterUsageAdvice grpcResponse = null;
        try {
            grpcResponse = adviceStub.updateWaterUsageAdvice(grpcAdvice);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error updating water advice via gRPC service!");
        }

        if (grpcResponse != null) {
            return new via.sep3.tier2.model.WaterUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
    }

    @Override
    public ArrayList<WaterUsageAdvice> getWaterAdviceByUserId(int id) {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        via.generatedprotos.ListWaterUsageAdvice grpcResponse = null;
        try {
            grpcResponse = adviceStub.getWaterAdvicesByUserId(grpcId);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error getting water advice via gRPC service!");
        }

        if (grpcResponse != null) {
            ArrayList<via.sep3.tier2.model.WaterUsageAdvice> advices = new ArrayList<>();
            for (via.generatedprotos.WaterUsageAdvice grpcAdvice : grpcResponse.getWaterList()) {
                advices.add(new via.sep3.tier2.model.WaterUsageAdvice(
                        grpcAdvice.getId(),
                        grpcAdvice.getBody()
                ));
            }
            return advices;
        }
        return null;
    }
}

