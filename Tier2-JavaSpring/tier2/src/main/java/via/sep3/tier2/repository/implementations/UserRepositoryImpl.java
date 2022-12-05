package via.sep3.tier2.repository.implementations;

import org.springframework.stereotype.Component;
import via.sep3.tier2.model.User;
import via.sep3.tier2.repository.Interfaces.UserRepository;

import java.util.ArrayList;

@Component
public class UserRepositoryImpl implements UserRepository {

    @Override
    public ArrayList<User> getUsers() {
        //TODO implement gRPC calls
        return null;
    }
}
