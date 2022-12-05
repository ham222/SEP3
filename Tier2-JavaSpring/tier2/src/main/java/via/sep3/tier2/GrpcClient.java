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
    ResourcesConsumptionGrpc.ResourcesConsumptionBlockingStub stubResources = ResourcesConsumptionGrpc.newBlockingStub(channel);
    UserManagementGrpc.UserManagementBlockingStub stubUser = UserManagementGrpc.newBlockingStub(channel);



    public ArrayList<WaterUsage> getWaterUsage() {
        ListWaterUsage response = stubResources.getWaterUsages(Empty.newBuilder().build());

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
        ListElectricityUsage response = stubResources.getElectricityUsages(Empty.newBuilder().build());
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
            stubResources.logWaterUsage(e);
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
            stubResources.logElectricityUsage(e);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error logging electricity usage via gRPC service! ");
        }
    }

    public User createUser(User user)
    {
        via.generatedprotos.User grpcUser = via.generatedprotos.User.newBuilder()
                .setId(0)
                .setPassword(user.getPassword())
                .setUsername(user.getUsername())
                .setRole(1)
                .build();
        User response = null;
        via.generatedprotos.User grpcResponse = null;
        try{
            grpcResponse = stubUser.createUser(grpcUser);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error creating user via gRPC service!");
        }

        if(grpcResponse != null)
        {
            response = new User(grpcResponse.getId(),grpcResponse.getUsername(), grpcResponse.getPassword(), grpcResponse.getRole());
        }

        return response;
    }


    public User findUserByUsername(String username)
    {
        ListUsers response = stubUser.getUsers(Empty.newBuilder().build());
        ArrayList<via.generatedprotos.User> users = new ArrayList<>(response.getUsersList());
        User user = null;
        for (via.generatedprotos.User u : users) {
            if(u.getUsername().equals(username))
            {
                user = new User(u.getId(),u.getUsername(), u.getPassword(), u.getRole());
            }
        }
        return user;
    }
}
