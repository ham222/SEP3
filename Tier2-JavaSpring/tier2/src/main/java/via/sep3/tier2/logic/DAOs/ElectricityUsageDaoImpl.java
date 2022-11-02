package via.sep3.tier2.logic.DAOs;

import via.sep3.tier2.logic.Interfaces.ElectricityUsageDAO;
import via.sep3.tier2.model.ElectricityUsageImpl;
import via.sep3.tier2.model.WaterUsageImpl;

import java.util.ArrayList;

public  class ElectricityUsageDaoImpl implements ElectricityUsageDAO {

    private static ElectricityUsageDaoImpl instance;

    private ElectricityUsageDaoImpl(){
    }

    public static ElectricityUsageDaoImpl getInstance(){
        if(instance==null){
            instance = new ElectricityUsageDaoImpl();
        }
        return instance;
    }

    @Override
    public ArrayList<ElectricityUsageImpl> getUserElectricityUsages(int id) {
        return null;
    }
}
