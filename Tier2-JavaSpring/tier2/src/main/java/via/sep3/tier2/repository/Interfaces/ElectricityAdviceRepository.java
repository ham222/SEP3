package via.sep3.tier2.repository.Interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import via.sep3.tier2.GrpcClient;
import via.sep3.tier2.model.ElectricityUsageAdvice;
import via.sep3.tier2.model.WaterUsageAdvice;

import java.util.ArrayList;

public interface ElectricityAdviceRepository {

    ElectricityUsageAdvice getAdviceById(int id);

    void createAdvice(ElectricityUsageAdvice electricityUsageAdvice);

    void deleteAdviceById(int id);

    ArrayList<ElectricityUsageAdvice> getAllElectricityAdvice();
}
