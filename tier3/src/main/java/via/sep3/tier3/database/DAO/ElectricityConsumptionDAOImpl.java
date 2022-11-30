package via.sep3.tier3.database.DAO;

import via.sep3.tier3.database.DAOInterfaces.ElectricityConsumptionDAO;
import via.sep3.tier3.database.DatabaseFront;
import via.sep3.tier3.model.ElectricityUsage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ElectricityConsumptionDAOImpl implements ElectricityConsumptionDAO {

    @Override
    public void addElectricityData(ElectricityUsage electricityUsage) {
        try {
            Connection connection = DatabaseFront.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO electricityusage VALUES (DEFAULT,?,?,?,?)"
            );
            statement.setDouble(1,electricityUsage.getAmount());
            statement.setInt(2,electricityUsage.getMonth());
            statement.setInt(3,electricityUsage.getYear());
            statement.setInt(4,electricityUsage.getUserId());
            statement.execute();
        } catch (SQLException e) {
            System.err.println("Error inserting water usage data into database");
            throw new RuntimeException(e);
        }

    }

    @Override
    public ArrayList<ElectricityUsage> getAllElectricityUsage() {
        ArrayList<ElectricityUsage> electrUsages = new ArrayList<>();

        try {
            Connection connection = DatabaseFront.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM electricityusage"
            );
            ResultSet results = statement.executeQuery();
            while (results.next()){

                ElectricityUsage e = new ElectricityUsage(
                        results.getInt("id"),
                        results.getDouble("amount"),
                        results.getInt("month"),
                        results.getInt("year"),
                        results.getInt("userid"));

                electrUsages.add(e);
            }
        } catch (SQLException e) {
            System.err.println("");
            throw new RuntimeException(e);
        }

        return electrUsages;
    }
}
