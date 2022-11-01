package via.sep3.tier3.database.DAOInterfaces;

import via.sep3.tier3.model.UserImpl;

import java.util.ArrayList;

public interface UserDAO {

    ArrayList<UserImpl> getAllUsers();
    UserImpl getUserById(int id);
}
