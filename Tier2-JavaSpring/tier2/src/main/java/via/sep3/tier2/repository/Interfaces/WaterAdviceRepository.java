package via.sep3.tier2.repository.Interfaces;

import via.sep3.tier2.model.WaterUsageAdvice;

import java.util.ArrayList;

public interface WaterAdviceRepository {

    WaterUsageAdvice getAdviceById(int id);

    WaterUsageAdvice createAdvice(WaterUsageAdvice waterUsageAdvice);


    void deleteAdviceById(int id);

    ArrayList<WaterUsageAdvice> getAllWaterAdvice();

    WaterUsageAdvice editAdviceById(WaterUsageAdvice fromPath);

    void assignWaterAdvice(int id, int adviceId);

    WaterUsageAdvice updateAdvice(WaterUsageAdvice fromPath);

    ArrayList<WaterUsageAdvice> getWaterAdviceByUserId(int id);
}
