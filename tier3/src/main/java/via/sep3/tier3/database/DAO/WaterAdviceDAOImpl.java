package via.sep3.tier3.database.DAO;

import via.sep3.tier3.database.DAOInterfaces.WaterAdviceDAO;
import via.sep3.tier3.database.DatabaseFront;
import via.sep3.tier3.model.WaterUsageAdvice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class WaterAdviceDAOImpl implements WaterAdviceDAO {
    @Override
    public void addWaterAdvice(WaterUsageAdvice waterAdvice) {
        try {
            Connection connection = DatabaseFront.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO WaterAdvice values (DEFAULT, ?)"
            );
            statement.setString(1, waterAdvice.getText());
            statement.execute();
        } catch (SQLException e) {
            System.err.println("Error inserting water usage advice");
            throw new RuntimeException(e);
        }

    }

    @Override
    public ArrayList<WaterUsageAdvice> getAllWaterUsageAdvice() {
        ArrayList<WaterUsageAdvice> waterAdvice = new ArrayList<>();
        try {
            Connection connection = DatabaseFront.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement("select * from WaterUsageAdvice");
            ResultSet results = statement.executeQuery();
            while (results.next()) {
                WaterUsageAdvice w = new WaterUsageAdvice
                        (
                                results.getInt("id"),
                                results.getString("text")
                        );
                waterAdvice.add(w);
            }
        } catch (SQLException e) {
            System.err.println("Error getting all water usage advice from the database");
            throw new RuntimeException(e);
        }
        return waterAdvice;
    }
}

