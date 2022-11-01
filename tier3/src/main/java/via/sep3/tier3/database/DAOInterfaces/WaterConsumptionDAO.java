package via.sep3.tier3.database.DAOInterfaces;

import via.sep3.tier3.model.WaterUsageImpl;

import java.util.ArrayList;

public interface WaterConsumptionDAO {

    void addWaterData(WaterUsageImpl waterUsage);
    ArrayList<WaterUsageImpl> getAllWaterUsage();
}
