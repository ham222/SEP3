package via.sep3.tier2.logic.interfaces;

import via.sep3.tier2.model.ElectricityUsage;
import via.sep3.tier2.model.ElectricityUsageAdvice;

import java.util.ArrayList;

public interface ElectricityUsageService {

    ArrayList<ElectricityUsage> getUserElectricityUsages(int id);

    ElectricityUsage insertElectricityUsage(ElectricityUsage usage);

    ElectricityUsage editElectricityUsage(ElectricityUsage usage);

    void deleteElectricityUsage(int id);

    double getAverageElectricityUsageByArea(int areaId);
}
