package via.sep3.tier2.logic.interfaces;

import via.sep3.tier2.model.WaterUsage;

import java.util.ArrayList;

public interface WaterUsageService {
    ArrayList<WaterUsage> getUserWaterUsages(int id);
}
