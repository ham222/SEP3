package via.sep3.tier3.database.DAO;

import via.sep3.tier3.database.DAOInterfaces.ElectricityAdviceDAO;
import via.sep3.tier3.database.DatabaseFront;
import via.sep3.tier3.model.ElectricityUsageAdviceImpl;
import via.sep3.tier3.model.ElectricityUsageImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ElectricityAdviceDAOImpl implements ElectricityAdviceDAO {

    DatabaseFront database = DatabaseFront.getInstance();

    @Override
    public void addElectricityAdvice(ElectricityUsageAdviceImpl electricityAdvice) {

        try {
            Connection connection = DatabaseFront.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO ElectricityUsageAdvice values (DEFAULT, ?)"
            );
            statement.setString(1, electricityAdvice.getText());
            statement.execute();
        } catch (SQLException e) {
            System.err.println("Error inserting Electricity usage advice");
            throw new RuntimeException(e);
        }

    }

    @Override
    public ArrayList<ElectricityUsageAdviceImpl> getAllElectricityUsageAdvice() {
        ArrayList<ElectricityUsageAdviceImpl> electricityUsageAdvices = new ArrayList<>();
        try {
            Connection connection = database.getConnection();
            PreparedStatement statement = connection.prepareStatement("select * from ElectricityUsageAdvice");
            ResultSet resultSet = statement.executeQuery();

            ElectricityUsageAdviceImpl currentAdvice = null;
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                if(currentAdvice == null || id != currentAdvice.getId()){
                    String text = resultSet.getString("text");
                    electricityUsageAdvices.add(currentAdvice);
                }
            }



        }  catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return electricityUsageAdvices;


        //done
    }
}
