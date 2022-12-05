package via.sep3.tier2.repository.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import via.sep3.tier2.GrpcClient;
import via.sep3.tier2.model.User;
import via.sep3.tier2.repository.Interfaces.UserRepository;

import java.util.ArrayList;

@Component
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    GrpcClient grpcClient;

    @Override
    public ArrayList<User> getUsers() {
        //TODO implement gRPC calls
        return null;
    }

    @Override
    public User saveUser(User user)
    {
        return grpcClient.createUser(user);
    }

    @Override
    public User findUserByUsername(String username)
    {
        return grpcClient.findUserByUsername(username);
    }
}
