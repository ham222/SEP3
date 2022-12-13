package via.sep3.tier2.repository.Interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import via.sep3.tier2.GrpcClient;
import via.sep3.tier2.model.ElectricityUsageAdvice;
import via.sep3.tier2.model.WaterUsageAdvice;

import java.util.ArrayList;

public interface ElectricityAdviceRepository {

    ElectricityUsageAdvice getAdviceById(int id);

    ElectricityUsageAdvice createAdvice(ElectricityUsageAdvice electricityUsageAdvice);

    void deleteAdviceById(int id);

    ArrayList<ElectricityUsageAdvice> getAllElectricityAdvice();

    ElectricityUsageAdvice editAdviceById(ElectricityUsageAdvice id);

    void assignElectricityAdvice(int id, int adviceId);

    ElectricityUsageAdvice updateAdvice(ElectricityUsageAdvice fromPath);

    ArrayList<ElectricityUsageAdvice> getElectricityAdviceByUserId(int id);
}
