package via.sep3.tier2.logic.GrpcComm;

import org.springframework.stereotype.Component;
import via.sep3.tier2.logic.Interfaces.UserService;
import via.sep3.tier2.model.User;

import java.util.ArrayList;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public ArrayList<User> getUsers() {
        return null;
    }
}
