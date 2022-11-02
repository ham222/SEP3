package via.sep3.tier2.logic.Interfaces;

import via.sep3.tier2.model.UserImpl;
import via.sep3.tier2.model.WaterUsageImpl;

import java.util.ArrayList;

public interface WaterUsageDAO {
    ArrayList<WaterUsageImpl> getUserWaterUsages(int id);
}
