package via.sep3.tier3.database.DAOInterfaces;

import via.sep3.tier3.model.ElectricityUsageAdviceImpl;

import java.util.ArrayList;

public interface ElectricityAdviceDAO {
    void addElectricityAdvice(ElectricityUsageAdviceImpl electricityAdvice);
    ArrayList<ElectricityUsageAdviceImpl> getAllElectricityUsageAdvice();
}
