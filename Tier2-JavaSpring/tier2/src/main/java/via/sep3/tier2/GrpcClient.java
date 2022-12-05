package via.sep3.tier2;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;
import via.generatedprotos.*;
import via.sep3.tier2.model.ElectricityUsage;
import via.sep3.tier2.model.User;
import via.sep3.tier2.model.WaterUsage;

import java.util.ArrayList;


@Service
public class GrpcClient {


    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
    ResourcesConsumptionGrpc.ResourcesConsumptionBlockingStub stub = ResourcesConsumptionGrpc.newBlockingStub(channel);
    UserManagementGrpc.UserManagementBlockingStub userStub = UserManagementGrpc.newBlockingStub(channel);
    AdviceManagementGrpc.AdviceManagementBlockingStub adviceStub = AdviceManagementGrpc.newBlockingStub(channel);

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

    public void insertWaterUsage(WaterUsage waterUsage){
        via.generatedprotos.WaterUsage e = via.generatedprotos.WaterUsage.newBuilder()
                .setId(waterUsage.getId())
                .setAmount(waterUsage.getAmount())
                .setMonth(waterUsage.getMonth())
                .setYear(waterUsage.getYear())
                .setUserId(waterUsage.getUserId())
                .build();
        try {
            stub.logWaterUsage(e);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error logging water usage via gRPC service! ");
        }
    }

    public void insertElectricityUsage(ElectricityUsage electricityUsage){
        via.generatedprotos.ElectricityUsage e = via.generatedprotos.ElectricityUsage.newBuilder()
                .setId(electricityUsage.getId())
                .setAmount(electricityUsage.getAmount())
                .setMonth(electricityUsage.getMonth())
                .setYear(electricityUsage.getYear())
                .setUserId(electricityUsage.getUserId())
                .build();
        try {
            stub.logElectricityUsage(e);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error logging electricity usage via gRPC service! ");
        }
    }

    public ArrayList<User> getUsers(){
        ArrayList<User> users = new ArrayList<>();
        ListUsers grpcUsers = userStub.getUsers(Empty.newBuilder().build());

        ArrayList<via.generatedprotos.User> eGrpc = new ArrayList<>(grpcUsers.getUsersList());


        for (via.generatedprotos.User e : eGrpc) {

            User currentE = new User(
                    e.getId(),
                    e.getUsername(),
                    e.getPassword(),
                    e.getRole(),
                    e.getArea()
            );

            users.add(currentE);
        }
        return users;
    }

    public void createElectricityAdvice(via.sep3.tier2.model.ElectricityUsageAdvice advice){
        ElectricityUsageAdvice grpcAdvice = ElectricityUsageAdvice.newBuilder()
                .setId(advice.getId())
                .setBody(advice.getText())
                .build();
        try {
           adviceStub.createElectricityUsageAdvice(grpcAdvice);
        } catch (Exception e){
            System.err.println("Error creating electricity advice via gRPC!\n"+e.getMessage());
        }
    }

    public ArrayList<via.sep3.tier2.model.ElectricityUsageAdvice> getAllElectricityAdvice(){
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

    public void createWaterAdvice(via.sep3.tier2.model.WaterUsageAdvice advice){
        WaterUsageAdvice grpcAdvice = WaterUsageAdvice.newBuilder()
                .setId(advice.getId())
                .setBody(advice.getText())
                .build();
        try {
            adviceStub.createWaterUsageAdvice(grpcAdvice);
        } catch (Exception e){
            System.err.println("Error creating water advice via gRPC!\n"+e.getMessage());
        }
    }

    public ArrayList<via.sep3.tier2.model.WaterUsageAdvice> getAllWaterAdvice(){
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

}
