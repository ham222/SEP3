package via.sep3.tier3.database.DAOInterfaces;

import via.sep3.tier3.model.WaterUsageAdvice;

import java.util.ArrayList;

public interface WaterAdviceDAO {

    void addWaterAdvice(WaterUsageAdvice waterAdvice);
    ArrayList<WaterUsageAdvice> getAllWaterUsageAdvice();
}
