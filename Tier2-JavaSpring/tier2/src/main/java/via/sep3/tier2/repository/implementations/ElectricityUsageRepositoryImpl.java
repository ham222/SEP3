package via.sep3.tier2.repository.implementations;

import org.springframework.stereotype.Component;
import via.sep3.tier2.model.ElectricityUsage;
import via.sep3.tier2.repository.Interfaces.ElectricityUsageRepository;

import java.util.ArrayList;

@Component
public  class ElectricityUsageRepositoryImpl implements ElectricityUsageRepository {


    private ElectricityUsageRepositoryImpl(){
    }

    @Override
    public ArrayList<ElectricityUsage> getUserElectricityUsages(int id) {
        //TODO implement gRPC calls
        return null;
    }

    @Override
    public String insertElectricityUsage(ElectricityUsage electricityUsage) {
        //TODO implement gRPC calls
        return null;
    }
}
