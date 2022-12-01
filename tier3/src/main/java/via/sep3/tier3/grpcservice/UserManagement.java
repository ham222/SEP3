package via.sep3.tier3.grpcservice;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.generatedprotos.*;
import via.sep3.tier3.database.entity.UserEntity;
import via.sep3.tier3.database.service.UserService;


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
        userEntity = userService.saveUser(userEntity);
        User userToSend = User.newBuilder()
                .setId(userEntity.getId())
                .setUsername(userEntity.getUsername())
                .setPassword(userEntity.getPassword())
                .setRole(userEntity.getRole())
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
}

