package via.sep3.tier2.logic.Interfaces;

import via.sep3.tier2.model.ElectricityUsageImpl;

import java.util.ArrayList;

public interface ElectricityUsageDAO {

    ArrayList<ElectricityUsageImpl> getUserElectricityUsages(int id);
}
