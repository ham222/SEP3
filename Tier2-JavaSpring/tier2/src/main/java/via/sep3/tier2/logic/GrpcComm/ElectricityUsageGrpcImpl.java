package via.sep3.tier2.logic.GrpcComm;

import via.sep3.tier2.logic.Interfaces.ElectricityUsageGrpc;
import via.sep3.tier2.model.ElectricityUsage;

import java.util.ArrayList;

public  class ElectricityUsageGrpcImpl implements ElectricityUsageGrpc {

    private static ElectricityUsageGrpcImpl instance;

    private ElectricityUsageGrpcImpl(){
    }

    public static ElectricityUsageGrpcImpl getInstance(){
        if(instance==null){
            instance = new ElectricityUsageGrpcImpl();
        }
        return instance;
    }

    @Override
    public ArrayList<ElectricityUsage> getUserElectricityUsages(int id) {
        return null;
    }
}
