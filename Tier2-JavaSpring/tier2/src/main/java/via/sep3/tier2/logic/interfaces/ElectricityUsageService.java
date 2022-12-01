package via.sep3.tier2.logic.interfaces;

import via.sep3.tier2.model.ElectricityUsage;

import java.util.ArrayList;

public interface ElectricityUsageService {

    ArrayList<ElectricityUsage> getUserElectricityUsages(int id);

    String insertElectricityUsage(ElectricityUsage usage);
}
