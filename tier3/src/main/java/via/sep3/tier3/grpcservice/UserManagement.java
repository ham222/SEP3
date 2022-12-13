package via.sep3.tier3.grpcservice;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.generatedprotos.*;
import via.sep3.tier3.database.entity.UserEntity;
import via.sep3.tier3.database.service.UserService;

import java.util.ArrayList;


@GRpcService
public class UserManagement extends UserManagementGrpc.UserManagementImplBase
{
    UserService userService;

    public UserManagement(UserService userService)
    {
        this.userService = userService;
    }

    @Override
    public void createUser(User user, StreamObserver<User> observer)
    {
        if(userService.getUserByUsername(user.getUsername()) != null)
        {
            observer.onNext(User.newBuilder().setUsername("Username already exists").build());
            observer.onCompleted();
            return;
        }
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(user.getUsername());
        userEntity.setPassword(user.getPassword());
        userEntity.setRole(user.getRole());
        userEntity.setArea(user.getArea());
        userEntity = userService.saveUser(userEntity);
        User userToSend = User.newBuilder()
                .setId(userEntity.getId())
                .setUsername(userEntity.getUsername())
                .setPassword(userEntity.getPassword())
                .setRole(userEntity.getRole())
                .setArea(userEntity.getArea())
                .build();

        observer.onNext(userToSend);
        observer.onCompleted();
    }

    @Override
    public void deleteUser(ID id, StreamObserver<Empty> observer)
    {
        userService.deleteUser(id.getId());
        observer.onNext(Empty.newBuilder().build());
        observer.onCompleted();
    }

    @Override
    public void updateUser(User user, StreamObserver<User> observer)
    {
        UserEntity userEntity = userService.getUserById(user.getId());
        userEntity.setUsername(user.getUsername());
        userEntity.setPassword(user.getPassword());
        userEntity.setRole(user.getRole());
        userEntity.setId(user.getId());
        userEntity.setArea(user.getArea());
        userEntity = userService.updateUser(userEntity);
        User userToSend = User.newBuilder()
                .setId(userEntity.getId())
                .setUsername(userEntity.getUsername())
                .setPassword(userEntity.getPassword())
                .setRole(userEntity.getRole())
                .setArea(userEntity.getArea())
                .build();

        observer.onNext(userToSend);
        observer.onCompleted();
    }

    @Override
    public void getUsers(Empty empty, StreamObserver<ListUsers> observer)
    {
        ArrayList<UserEntity> allUsers = (ArrayList<UserEntity>) userService.getAllUsers();
        ArrayList<User> grpcUsers = new ArrayList<>();
        User grpcUser;
        for (UserEntity user : allUsers)
        {
            grpcUser = User.newBuilder()
                    .setId(user.getId())
                    .setUsername(user.getUsername())
                    .setPassword(user.getPassword())
                    .setRole(user.getRole())
                    .setArea(user.getArea())
                    .build();
            grpcUsers.add(grpcUser);
        }

        ListUsers listUsers = ListUsers.newBuilder()
                .addAllUsers(grpcUsers)
                .build();
        observer.onNext(listUsers);
        observer.onCompleted();
    }

    @Override
    public void getUserById(ID id, StreamObserver<User> observer)
    {
        UserEntity userEntity = userService.getUserById(id.getId());
        if(userEntity == null)
        {
            observer.onNext(User.newBuilder().setUsername("User not found").build());
            observer.onCompleted();
            return;
        }
        User userToSend = User.newBuilder()
                .setId(userEntity.getId())
                .setUsername(userEntity.getUsername())
                .setPassword(userEntity.getPassword())
                .setRole(userEntity.getRole())
                .setArea(userEntity.getArea())
                .build();

        observer.onNext(userToSend);
        observer.onCompleted();
    }

    @Override
    public void getUserByUsername(Username username, StreamObserver<User> observer)
    {
        UserEntity userEntity = userService.getUserByUsername(username.getUsername());
        if(userEntity == null)
        {
            observer.onNext(User.newBuilder().setUsername("User not found").build());
            observer.onCompleted();
            return;
        }
        User userToSend = User.newBuilder()
                .setId(userEntity.getId())
                .setUsername(userEntity.getUsername())
                .setPassword(userEntity.getPassword())
                .setRole(userEntity.getRole())
                .setArea(userEntity.getArea())
                .build();

        observer.onNext(userToSend);
        observer.onCompleted();
    }
}

