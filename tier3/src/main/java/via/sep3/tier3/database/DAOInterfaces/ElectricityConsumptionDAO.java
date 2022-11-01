package via.sep3.tier3.database.DAOInterfaces;

import via.sep3.tier3.model.ElectricityUsageImpl;

import java.util.ArrayList;

public interface ElectricityConsumptionDAO {


    void addElectricityData(ElectricityUsageImpl electricityUsage);
    ArrayList<ElectricityUsageImpl> getAllElectricityUsage();


}
