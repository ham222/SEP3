package via.sep3.tier2.repository.Interfaces;

import via.sep3.tier2.model.WaterUsage;

import java.util.ArrayList;

public interface WaterUsageRepository {
    ArrayList<WaterUsage> getUserWaterUsages(int id);

    String insertWaterUsage(WaterUsage usage);
}
