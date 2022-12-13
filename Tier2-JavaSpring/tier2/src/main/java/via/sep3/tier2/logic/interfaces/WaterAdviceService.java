package via.sep3.tier2.logic.interfaces;

import via.sep3.tier2.model.WaterUsageAdvice;

import java.util.ArrayList;

public interface WaterAdviceService {
    WaterUsageAdvice getWaterAdviceById(int id);

    WaterUsageAdvice createAdvice(WaterUsageAdvice advice);

    void DeleteAdviceById(int id);

    ArrayList<WaterUsageAdvice> getAllWaterAdvice();

    WaterUsageAdvice editAdviceById(WaterUsageAdvice fromPath);

    void assignWaterAdvice(int id, int adviceId);

    WaterUsageAdvice updateAdvice(WaterUsageAdvice fromPath);

    ArrayList<WaterUsageAdvice> getWaterAdviceByUserId(int id);
}
