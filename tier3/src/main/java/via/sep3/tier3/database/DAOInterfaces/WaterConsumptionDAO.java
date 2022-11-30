package via.sep3.tier3.database.DAOInterfaces;

import via.sep3.tier3.model.WaterUsage;

import java.util.ArrayList;

public interface WaterConsumptionDAO {

    void addWaterData(WaterUsage waterUsage);
    ArrayList<WaterUsage> getAllWaterUsage();
}
