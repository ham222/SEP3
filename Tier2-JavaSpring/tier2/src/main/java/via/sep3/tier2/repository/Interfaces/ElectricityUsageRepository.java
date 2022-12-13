package via.sep3.tier2.repository.Interfaces;

import via.sep3.tier2.model.ElectricityUsage;

import java.util.ArrayList;

public interface ElectricityUsageRepository {

    ArrayList<ElectricityUsage> getUserElectricityUsages(int id);
    ArrayList<ElectricityUsage> getAllElectricityUsages();

    ElectricityUsage insertElectricityUsage(ElectricityUsage electricityUsage);

    ElectricityUsage editElectricityUsage(ElectricityUsage usage);

    void deleteElectricityUsage(int id);
}
