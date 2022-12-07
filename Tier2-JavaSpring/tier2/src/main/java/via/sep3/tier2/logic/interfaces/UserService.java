package via.sep3.tier2.logic.interfaces;

import via.sep3.tier2.model.User;
import via.sep3.tier2.model.dto.LoginCredentials;

import java.util.ArrayList;

public interface UserService {

    ArrayList<User> getUsers();

    User createUser(LoginCredentials loginCredentials);

    User findUserByUsername(String username);

    User updateUser(User user);

    User getUserById(int id);

    void deleteUser(int id);

}
