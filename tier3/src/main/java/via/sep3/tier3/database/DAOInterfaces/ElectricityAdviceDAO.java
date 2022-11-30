package via.sep3.tier3.database.DAOInterfaces;

import via.sep3.tier3.model.ElectricityUsageAdvice;

import java.util.ArrayList;

public interface ElectricityAdviceDAO {
    void addElectricityAdvice(ElectricityUsageAdvice electricityAdvice);
    ArrayList<ElectricityUsageAdvice> getAllElectricityUsageAdvice();
}
