package via.sep3.tier3.database.DAOInterfaces;

import via.sep3.tier3.model.WaterUsageAdviceImpl;

import java.util.ArrayList;

public interface WaterAdviceDAO {

    void addWaterAdvice(WaterUsageAdviceImpl waterAdvice);
    ArrayList<WaterUsageAdviceImpl> getAllWaterUsageAdvice();
}
