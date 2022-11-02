package via.sep3.tier3.database.DAO;

import via.sep3.tier3.database.DAOInterfaces.WaterConsumptionDAO;
import via.sep3.tier3.database.DatabaseFront;
import via.sep3.tier3.model.WaterUsageImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class WaterConsumptionDAOImpl implements WaterConsumptionDAO {
    @Override
    public void addWaterData(WaterUsageImpl waterUsage) {
        try {
            Connection connection = DatabaseFront.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO waterusage VALUES (DEFAULT,?,?,?,?)"
            );
            statement.setDouble(1, waterUsage.getAmount());
            statement.setInt(2, waterUsage.getMonth());
            statement.setInt(3, waterUsage.getYear());
            statement.setInt(4, waterUsage.getUserId());
            statement.execute();
        } catch (SQLException e) {
            System.err.println("Error inserting water usage data into database");
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<WaterUsageImpl> getAllWaterUsage() {
        ArrayList<WaterUsageImpl> waterUsages = new ArrayList<>();

        try {
            Connection connection = DatabaseFront.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM waterusage"
            );
            ResultSet results = statement.executeQuery();
            while (results.next()) {

                WaterUsageImpl w = new WaterUsageImpl(
                        results.getInt("id"),
                        results.getDouble("amount"),
                        results.getInt("month"),
                        results.getInt("year"),
                        results.getInt("userid"));

                waterUsages.add(w);
            }
        } catch (SQLException e) {
            System.err.println("Error getting all water usages from the database");
            throw new RuntimeException(e);
        }

        return waterUsages;
    }
}
