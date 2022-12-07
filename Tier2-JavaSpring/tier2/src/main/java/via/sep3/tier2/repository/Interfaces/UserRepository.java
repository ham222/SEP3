package via.sep3.tier2.repository.Interfaces;

import via.sep3.tier2.model.User;

import java.util.ArrayList;

public interface UserRepository {


    ArrayList<User> getUsers();

    User saveUser(User user);

    User findUserByUsername(String username);

    User updateUser(User user);

    User getUserById(int id);
<<<<<<< Updated upstream

    void deleteUser(int id);
=======
>>>>>>> Stashed changes
}
