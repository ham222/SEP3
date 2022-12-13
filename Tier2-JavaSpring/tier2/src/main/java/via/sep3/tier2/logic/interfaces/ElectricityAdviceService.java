package via.sep3.tier2.logic.interfaces;

import via.sep3.tier2.model.ElectricityUsageAdvice;

import java.util.ArrayList;

public interface ElectricityAdviceService {

    ElectricityUsageAdvice getAdviceById(int id);

    ElectricityUsageAdvice createAdvice(ElectricityUsageAdvice advice);

    void deleteAdviceById(int id);

    ArrayList<ElectricityUsageAdvice> getAllElectricityAdvice();

    ElectricityUsageAdvice editAdviceById(ElectricityUsageAdvice id);

    void assignElectricityAdvice(int id, int adviceId);

    ElectricityUsageAdvice updateAdvice(ElectricityUsageAdvice fromPath);

    ArrayList<ElectricityUsageAdvice> getElectricityAdviceByUserId(int id);
}
