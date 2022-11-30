package via.sep3.tier3.database.DAOInterfaces;

import via.sep3.tier3.model.ElectricityUsage;

import java.util.ArrayList;

public interface ElectricityConsumptionDAO {


    void addElectricityData(ElectricityUsage electricityUsage);
    ArrayList<ElectricityUsage> getAllElectricityUsage();


}
