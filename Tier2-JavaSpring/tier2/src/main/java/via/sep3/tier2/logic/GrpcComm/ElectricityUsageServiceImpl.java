package via.sep3.tier2.logic.GrpcComm;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import via.sep3.tier2.logic.Interfaces.ElectricityUsageService;
import via.sep3.tier2.model.ElectricityUsage;

import java.util.ArrayList;

@Component
public class ElectricityUsageServiceImpl implements ElectricityUsageService {

    private static ElectricityUsageServiceImpl instance;

    private ElectricityUsageServiceImpl(){
    }

    public static ElectricityUsageServiceImpl getInstance(){
        if(instance==null){
            instance = new ElectricityUsageServiceImpl();
        }
        return instance;
    }

    @Override
    public ArrayList<ElectricityUsage> getUserElectricityUsages(int id) {
        return null;
    }

    @Override
    public void insertElectricityUsage(ElectricityUsage usage) {
        //TODO implement
    }
}
