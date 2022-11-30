package via.sep3.tier2.logic.Interfaces;

import via.sep3.tier2.model.WaterUsage;

import java.util.ArrayList;

public interface WaterUsageGrpc {
    ArrayList<WaterUsage> getUserWaterUsages(int id);
}
