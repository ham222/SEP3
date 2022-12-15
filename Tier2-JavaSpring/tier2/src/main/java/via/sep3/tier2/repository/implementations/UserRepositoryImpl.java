package via.sep3.tier2.repository.implementations;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;
import via.generatedprotos.Empty;
import via.generatedprotos.ListUsers;
import via.generatedprotos.UserManagementGrpc;
import via.sep3.tier2.model.User;
import via.sep3.tier2.repository.Interfaces.UserRepository;

import java.util.ArrayList;

@Component
public class UserRepositoryImpl implements UserRepository {

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

    UserManagementGrpc.UserManagementBlockingStub userStub = UserManagementGrpc.newBlockingStub(channel);

    @Override
    public ArrayList<User> getUsers() {
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

    @Override
    public User saveUser(User user) {
        via.generatedprotos.User grpcUser = via.generatedprotos.User.newBuilder()
                .setId(0)
                .setPassword(user.getPassword())
                .setUsername(user.getUsername())
                .setRole(user.getRole())
                .setArea(user.getArea())
                .build();
        User response = null;
        via.generatedprotos.User grpcResponse = null;
        try {
            grpcResponse = userStub.createUser(grpcUser);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error creating user via gRPC service!");
        }

        if (grpcResponse != null) {
            response = new User(grpcResponse.getId(), grpcResponse.getUsername(), grpcResponse.getPassword(), grpcResponse.getRole(), grpcResponse.getArea());
        }

        return response;
    }

    @Override
    public User findUserByUsername(String username) {
        ListUsers response = userStub.getUsers(Empty.newBuilder().build());
        ArrayList<via.generatedprotos.User> users = new ArrayList<>(response.getUsersList());
        User user = null;
        for (via.generatedprotos.User u : users) {
            if (u.getUsername().equals(username)) {
                user = new User(u.getId(), u.getUsername(), u.getPassword(), u.getRole(), u.getArea());
            }
        }
        return user;
    }

    @Override
    public User updateUser(User user) {
        via.generatedprotos.User grpcUser = via.generatedprotos.User.newBuilder()
                .setId(user.getId())
                .setPassword(user.getPassword())
                .setUsername(user.getUsername())
                .setRole(user.getRole())
                .setArea(user.getArea())
                .build();
        User response = null;
        via.generatedprotos.User grpcResponse = null;
        try {
            grpcResponse = userStub.updateUser(grpcUser);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error updating user via gRPC service!");
        }

        if (grpcResponse != null) {
            response = new User(grpcResponse.getId(), grpcResponse.getUsername(), grpcResponse.getPassword(), grpcResponse.getRole(), grpcResponse.getArea());
        }

        return response;
    }

    @Override
    public User getUserById(int id) {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        User response = null;
        via.generatedprotos.User grpcResponse = null;
        try {
            grpcResponse = userStub.getUserById(grpcId);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error getting user via gRPC service!");
        }

        if (grpcResponse != null) {
            response = new User(grpcResponse.getId(), grpcResponse.getUsername(), grpcResponse.getPassword(), grpcResponse.getRole(), grpcResponse.getArea());
        }

        return response;
    }

    @Override
    public void deleteUser(int id) {
        via.generatedprotos.ID grpcId = via.generatedprotos.ID.newBuilder()
                .setId(id)
                .build();
        try {
            userStub.deleteUser(grpcId);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error deleting user via gRPC service!");
        }
    }

    @Override
    public User getUserByUsername(String username) {
        via.generatedprotos.Username grpcUsername = via.generatedprotos.Username.newBuilder()
                .setUsername(username)
                .build();
        via.generatedprotos.User grpcResponse = null;
        try {
            grpcResponse = userStub.getUserByUsername(grpcUsername);
        } catch (Exception err) {
            err.printStackTrace();
            System.err.println("Error getting user via gRPC service!");
        }

        if (grpcResponse != null) {
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
}
