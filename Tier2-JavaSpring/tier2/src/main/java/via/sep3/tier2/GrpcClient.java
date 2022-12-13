package via.sep3.tier2;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;
import via.generatedprotos.*;
import via.sep3.tier2.model.ElectricityUsage;
import via.sep3.tier2.model.User;
import via.sep3.tier2.model.WaterUsage;

import java.util.ArrayList;
import java.util.Arrays;


@Service
public class GrpcClient {


    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();


    UserManagementGrpc.UserManagementBlockingStub userStub = UserManagementGrpc.newBlockingStub(channel);
    AdviceManagementGrpc.AdviceManagementBlockingStub adviceStub = AdviceManagementGrpc.newBlockingStub(channel);

    ResourcesConsumptionGrpc.ResourcesConsumptionBlockingStub stubResources = ResourcesConsumptionGrpc.newBlockingStub(channel);



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
                    (int) w.getAmount(),
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
                    (int) e.getAmount(),
                    e.getMonth(),
                    e.getYear(),
                    e.getUserId()
            );

            eUsage.add(currentE);
        }

        return eUsage;
    }

    public WaterUsage insertWaterUsage(WaterUsage waterUsage){
        via.generatedprotos.WaterUsage e = via.generatedprotos.WaterUsage.newBuilder()
                .setId(waterUsage.getId())
                .setAmount(waterUsage.getAmount())
                .setMonth(waterUsage.getMonth())
                .setYear(waterUsage.getYear())
                .setUserId(waterUsage.getUserId())
                .build();

        via.generatedprotos.WaterUsage grpcResponse = null;
        try {
            grpcResponse =  stubResources.logWaterUsage(e);
        } catch (Exception err){
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

    public ElectricityUsage insertElectricityUsage(ElectricityUsage electricityUsage){
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
        } catch (Exception err){
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

    public via.sep3.tier2.model.ElectricityUsageAdvice createElectricityAdvice(via.sep3.tier2.model.ElectricityUsageAdvice advice){
        ElectricityUsageAdvice grpcAdvice = ElectricityUsageAdvice.newBuilder()
                .setId(advice.getId())
                .setBody(advice.getText())
                .build();
        ElectricityUsageAdvice grpcResponse = null;
        try {
           grpcResponse = adviceStub.createElectricityUsageAdvice(grpcAdvice);
        } catch (Exception e){
            System.err.println("Error creating electricity advice via gRPC!\n"+e.getMessage());
        }
        if (grpcResponse != null) {
            return new via.sep3.tier2.model.ElectricityUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;

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


    public User createUser(User user)
    {
        via.generatedprotos.User grpcUser = via.generatedprotos.User.newBuilder()
                .setId(0)
                .setPassword(user.getPassword())
                .setUsername(user.getUsername())
                .setRole(user.getRole())
                .setArea(user.getArea())
                .build();
        User response = null;
        via.generatedprotos.User grpcResponse = null;
        try{
            grpcResponse = userStub.createUser(grpcUser);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error creating user via gRPC service!");
        }

        if(grpcResponse != null)
        {
            response = new User(grpcResponse.getId(),grpcResponse.getUsername(), grpcResponse.getPassword(), grpcResponse.getRole(),grpcResponse.getArea());
        }

        return response;
    }


    public User findUserByUsername(String username)
    {
        ListUsers response = userStub.getUsers(Empty.newBuilder().build());
        ArrayList<via.generatedprotos.User> users = new ArrayList<>(response.getUsersList());
        User user = null;
        for (via.generatedprotos.User u : users) {
            if(u.getUsername().equals(username))
            {
                user = new User(u.getId(),u.getUsername(), u.getPassword(), u.getRole(),u.getArea());
            }
        }
        return user;
    }

    public via.sep3.tier2.model.WaterUsageAdvice createWaterAdvice(via.sep3.tier2.model.WaterUsageAdvice advice){
        WaterUsageAdvice grpcAdvice = WaterUsageAdvice.newBuilder()
                .setId(advice.getId())
                .setBody(advice.getText())
                .build();
        WaterUsageAdvice grpcResponse = null;
        try {
            grpcResponse = adviceStub.createWaterUsageAdvice(grpcAdvice);
        } catch (Exception e){
            System.err.println("Error creating water advice via gRPC!\n"+e.getMessage());
        }
        if (grpcResponse != null) {
            return new via.sep3.tier2.model.WaterUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
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


    public User updateUser(User user)
    {
        via.generatedprotos.User grpcUser = via.generatedprotos.User.newBuilder()
                .setId(user.getId())
                .setPassword(user.getPassword())
                .setUsername(user.getUsername())
                .setRole(user.getRole())
                .setArea(user.getArea())
                .build();
        User response = null;
        via.generatedprotos.User grpcResponse = null;
        try{
            grpcResponse = userStub.updateUser(grpcUser);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error updating user via gRPC service!");
        }

        if(grpcResponse != null)
        {
            response = new User(grpcResponse.getId(),grpcResponse.getUsername(), grpcResponse.getPassword(), grpcResponse.getRole(),grpcResponse.getArea());
        }

        return response;
    }

    public User getUserById(int id)
    {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        User response = null;
        via.generatedprotos.User grpcResponse = null;
        try{
            grpcResponse = userStub.getUserById(grpcId);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error getting user via gRPC service!");
        }

        if(grpcResponse != null)
        {
            response = new User(grpcResponse.getId(),grpcResponse.getUsername(), grpcResponse.getPassword(), grpcResponse.getRole(),grpcResponse.getArea());
        }

        return response;
    }

    public void deleteUser(int id)
    {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        try{
            userStub.deleteUser(grpcId);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error deleting user via gRPC service!");
        }
    }

    public ElectricityUsage editElectricityUsage(ElectricityUsage usage)
    {

        via.generatedprotos.ElectricityUsage grpcUsage = via.generatedprotos.ElectricityUsage.newBuilder()
                .setId(usage.getId())
                .setUserId(usage.getUserId())
                .setAmount(usage.getAmount())
                .setMonth(usage.getMonth())
                .setYear(usage.getYear())
                .build();
        via.generatedprotos.ElectricityUsage response = null;
        try{
            response = stubResources.updateElectricityUsage(grpcUsage);
        } catch (Exception err){
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

    public WaterUsage updateWaterUsage(WaterUsage fromPath)
    {
        via.generatedprotos.WaterUsage grpcUsage = via.generatedprotos.WaterUsage.newBuilder()
                .setId(fromPath.getId())
                .setUserId(fromPath.getUserId())
                .setAmount(fromPath.getAmount())
                .setMonth(fromPath.getMonth())
                .setYear(fromPath.getYear())
                .build();
        via.generatedprotos.WaterUsage response = null;
        try{
            response = stubResources.updateWaterUsage(grpcUsage);
        } catch (Exception err){
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

    public void deleteWaterUsage(int id)
    {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        try{
            stubResources.deleteWaterUsage(grpcId);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error deleting water usage via gRPC service!");
        }
    }

    public void deleteElectricityUsage(int id)
    {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        try{
            stubResources.deleteElectricityUsage(grpcId);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error deleting electricity usage via gRPC service!");
        }
    }

    public via.sep3.tier2.model.ElectricityUsageAdvice getElectricityAdviceById(int id)
    {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        via.generatedprotos.ElectricityUsageAdvice grpcResponse = null;
        try{
            grpcResponse = adviceStub.getElectricityUsageAdviceById(grpcId);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error getting electricity advice via gRPC service!");
        }

        if(grpcResponse != null)
        {
            return new via.sep3.tier2.model.ElectricityUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
    }

    public via.sep3.tier2.model.WaterUsageAdvice getWaterAdviceById(int id)
    {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        via.generatedprotos.WaterUsageAdvice grpcResponse = null;
        try{
            grpcResponse = adviceStub.getWaterUsageAdviceById(grpcId);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error getting water advice via gRPC service!");
        }

        if(grpcResponse != null)
        {
            return new via.sep3.tier2.model.WaterUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
    }

    public void deleteElectricityAdviceById(int id)
    {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        try{
            adviceStub.deleteElectricityUsageAdvice(grpcId);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error deleting electricity advice via gRPC service!");
        }
    }

    public void deleteWaterAdviceById(int id)
    {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        try{
            adviceStub.deleteWaterUsageAdvice(grpcId);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error deleting water advice via gRPC service!");
        }
    }

    public via.sep3.tier2.model.ElectricityUsageAdvice editElectricityAdviceById(via.sep3.tier2.model.ElectricityUsageAdvice advice)
    {
        via.generatedprotos.ElectricityUsageAdvice grpcAdvice = via.generatedprotos.ElectricityUsageAdvice.newBuilder()
                .setId(advice.getId())
                .setBody(advice.getText())
                .build();
        via.generatedprotos.ElectricityUsageAdvice grpcResponse = null;
        try{
            grpcResponse = adviceStub.updateElectricityUsageAdvice(grpcAdvice);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error editing electricity advice via gRPC service!");
        }

        if(grpcResponse != null)
        {
            return new via.sep3.tier2.model.ElectricityUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
    }

    public via.sep3.tier2.model.WaterUsageAdvice editWaterAdviceById(via.sep3.tier2.model.WaterUsageAdvice fromPath)
    {
        via.generatedprotos.WaterUsageAdvice grpcAdvice = via.generatedprotos.WaterUsageAdvice.newBuilder()
                .setId(fromPath.getId())
                .setBody(fromPath.getText())
                .build();
        via.generatedprotos.WaterUsageAdvice grpcResponse = null;
        try{
            grpcResponse = adviceStub.updateWaterUsageAdvice(grpcAdvice);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error editing water advice via gRPC service!");
        }

        if(grpcResponse != null)
        {
            return new via.sep3.tier2.model.WaterUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
    }

    public void assignElectricityAdvice(int id, int adviceId)
    {
        via.generatedprotos.AdviceCreation grpcAssign = via.generatedprotos.AdviceCreation.newBuilder()
                .setUserId(id)
                .setAdviceId(adviceId)
                .build();
        try{
            adviceStub.assignElectricityUsageAdviceToUser(grpcAssign);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error assigning electricity advice via gRPC service!");
        }
    }

    public void assignWaterAdvice(int id, int adviceId)
    {
        via.generatedprotos.AdviceCreation grpcAssign = via.generatedprotos.AdviceCreation.newBuilder()
                .setUserId(id)
                .setAdviceId(adviceId)
                .build();
        try{
            adviceStub.assignWaterUsageAdviceToUser(grpcAssign);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error assigning water advice via gRPC service!");
        }
    }

    public User getUserByUsername(String username)
    {
        via.generatedprotos.Username grpcUsername = via.generatedprotos.Username.newBuilder()
                .setUsername(username)
                .build();
        via.generatedprotos.User grpcResponse = null;
        try{
            grpcResponse = userStub.getUserByUsername(grpcUsername);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error getting user via gRPC service!");
        }

        if(grpcResponse != null)
        {
            return new User(
                    grpcResponse.getId(),
                    grpcResponse.getUsername(),
                    grpcResponse.getPassword(),
                    grpcResponse.getRole(),
                    grpcResponse.getArea()
            );
        }
        return null;
    }

    public via.sep3.tier2.model.ElectricityUsageAdvice updateElectricityAdvice(via.sep3.tier2.model.ElectricityUsageAdvice fromPath)
    {
        via.generatedprotos.ElectricityUsageAdvice grpcAdvice = via.generatedprotos.ElectricityUsageAdvice.newBuilder()
                .setId(fromPath.getId())
                .setBody(fromPath.getText())
                .build();
        via.generatedprotos.ElectricityUsageAdvice grpcResponse = null;
        try{
            grpcResponse = adviceStub.updateElectricityUsageAdvice(grpcAdvice);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error updating electricity advice via gRPC service!");
        }

        if(grpcResponse != null)
        {
            return new via.sep3.tier2.model.ElectricityUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
    }

    public via.sep3.tier2.model.WaterUsageAdvice updateWaterAdvice(via.sep3.tier2.model.WaterUsageAdvice fromPath)
    {
        via.generatedprotos.WaterUsageAdvice grpcAdvice = via.generatedprotos.WaterUsageAdvice.newBuilder()
                .setId(fromPath.getId())
                .setBody(fromPath.getText())
                .build();
        via.generatedprotos.WaterUsageAdvice grpcResponse = null;
        try{
            grpcResponse = adviceStub.updateWaterUsageAdvice(grpcAdvice);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error updating water advice via gRPC service!");
        }

        if(grpcResponse != null)
        {
            return new via.sep3.tier2.model.WaterUsageAdvice(
                    grpcResponse.getId(),
                    grpcResponse.getBody()
            );
        }
        return null;
    }

    public ArrayList<via.sep3.tier2.model.ElectricityUsageAdvice> getElectricityAdviceByUserId(int id)
    {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        via.generatedprotos.ListElectricityUsageAdvice grpcResponse = null;
        try{
            grpcResponse = adviceStub.getElectricityAdvicesByUserId(grpcId);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error getting electricity advice via gRPC service!");
        }

        if(grpcResponse != null)
        {
            ArrayList<via.sep3.tier2.model.ElectricityUsageAdvice> advices = new ArrayList<>();
            for(via.generatedprotos.ElectricityUsageAdvice grpcAdvice : grpcResponse.getElectricityList())
            {
                advices.add(new via.sep3.tier2.model.ElectricityUsageAdvice(
                        grpcAdvice.getId(),
                        grpcAdvice.getBody()
                ));
            }
            return advices;
        }
        return null;
    }

    public ArrayList<via.sep3.tier2.model.WaterUsageAdvice> getWaterAdviceByUserId(int id)
    {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        via.generatedprotos.ListWaterUsageAdvice grpcResponse = null;
        try{
            grpcResponse = adviceStub.getWaterAdvicesByUserId(grpcId);
        } catch (Exception err){
            err.printStackTrace();
            System.err.println("Error getting water advice via gRPC service!");
        }

        if(grpcResponse != null)
        {
            ArrayList<via.sep3.tier2.model.WaterUsageAdvice> advices = new ArrayList<>();
            for(via.generatedprotos.WaterUsageAdvice grpcAdvice : grpcResponse.getWaterList())
            {
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
