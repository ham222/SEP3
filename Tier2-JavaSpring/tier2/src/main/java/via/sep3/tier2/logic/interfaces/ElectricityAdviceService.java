package via.sep3.tier2.logic.interfaces;

import via.sep3.tier2.model.ElectricityUsageAdvice;
import via.sep3.tier2.model.WaterUsageAdvice;

import java.util.ArrayList;

public interface ElectricityAdviceService {

    ElectricityUsageAdvice getAdviceById(int id);

    void createAdvice(ElectricityUsageAdvice advice);

    void deleteAdviceById(int id);

    ArrayList<ElectricityUsageAdvice> getAllElectricityAdvice();
}
