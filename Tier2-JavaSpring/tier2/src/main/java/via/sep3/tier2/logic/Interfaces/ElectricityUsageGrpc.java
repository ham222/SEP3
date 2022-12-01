package via.sep3.tier2.logic.Interfaces;

import via.sep3.tier2.model.ElectricityUsage;

import java.util.ArrayList;

public interface ElectricityUsageGrpc {

    ArrayList<ElectricityUsage> getUserElectricityUsages(int id);
}
