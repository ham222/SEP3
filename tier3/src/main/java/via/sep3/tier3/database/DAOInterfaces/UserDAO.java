package via.sep3.tier3.database.DAOInterfaces;

import via.sep3.tier3.model.User;

import java.util.ArrayList;

public interface UserDAO {

    ArrayList<User> getAllUsers() ;
    User getUserById(int id);
}
