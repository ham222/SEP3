package via.sep3.tier2.repository.Interfaces;

import via.sep3.tier2.model.WaterUsage;

import java.util.ArrayList;

public interface WaterUsageRepository {
    ArrayList<WaterUsage> getUserWaterUsages(int id);

    WaterUsage insertWaterUsage(WaterUsage usage);

    WaterUsage editWaterUsage(WaterUsage fromPath);

    void deleteWaterUsage(int id);

    ArrayList<WaterUsage> getAllWaterUsages();
}
