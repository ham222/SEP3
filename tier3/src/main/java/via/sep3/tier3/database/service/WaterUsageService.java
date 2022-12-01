package via.sep3.tier3.database.service;



import via.sep3.tier3.database.entity.WaterUsageEntity;

import java.util.ArrayList;
import java.util.List;

public interface WaterUsageService
{
    List<WaterUsageEntity> getAllWaterUsages();
    WaterUsageEntity getWaterUsageById(int id);
    WaterUsageEntity saveWaterUsage(WaterUsageEntity waterUsage);
    WaterUsageEntity updateWaterUsage(WaterUsageEntity waterUsage);
    void deleteWaterUsage(int id);

    ArrayList<WaterUsageEntity> getWaterUsageByUserId(int id);

}
