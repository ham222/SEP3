package via.sep3.tier2.logic.interfaces;

import via.sep3.tier2.model.WaterUsageAdvice;

import java.util.ArrayList;

public interface WaterAdviceService {
    WaterUsageAdvice getWaterAdviceById(int id);

    void CreateAdvice(WaterUsageAdvice advice);

    void DeleteAdviceById(int id);

    ArrayList<WaterUsageAdvice> getAllWaterAdvice();

    WaterUsageAdvice UpdateAdvice(WaterUsageAdvice advice);

}
