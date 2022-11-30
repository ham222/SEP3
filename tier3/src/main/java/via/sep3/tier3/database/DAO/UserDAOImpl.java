package via.sep3.tier3.database.DAO;

import via.sep3.tier3.database.DAOInterfaces.UserDAO;
import via.sep3.tier3.database.DatabaseFront;
import via.sep3.tier3.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAOImpl implements UserDAO {

    DatabaseFront credentials = DatabaseFront.getInstance();

    @Override
    public ArrayList<User> getAllUsers() {
        try {
            Connection connection = credentials.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * from Users");
            ResultSet rs = statement.executeQuery();
            ArrayList<User> users = new ArrayList<>();
            User currentUser = null;

            while (rs.next())
            {
                int id = rs.getInt("id");
                if (currentUser == null || id != currentUser.getId())
                {
                    String username = rs.getString("username");
                    String pass = rs.getString("password");
                    int role = rs.getInt("role");
                    currentUser = new User(id,username,pass,role);
                    users.add(currentUser);
                }
            }

            return users;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public User getUserById(int id) {
     return null;
    }


}
