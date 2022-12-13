package via.sep3.tier2.repository.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import via.sep3.tier2.GrpcClient;
import via.sep3.tier2.model.ElectricityUsage;
import via.sep3.tier2.repository.Interfaces.ElectricityUsageRepository;

import java.util.ArrayList;

@Component
public  class ElectricityUsageRepositoryImpl implements ElectricityUsageRepository {

    @Autowired
    GrpcClient grpcClient;

    private ElectricityUsageRepositoryImpl(){
    }

    @Override
    public ArrayList<ElectricityUsage> getUserElectricityUsages(int id) {
        ArrayList<ElectricityUsage> usages = grpcClient.getElectricityUsage();

        ArrayList<ElectricityUsage> userW = new ArrayList<>();

        for (ElectricityUsage currentW : usages) {

            if (currentW.getUserId() == id) {
                userW.add(currentW);
            }

        }
        return userW;
    }

    @Override
    public ArrayList<ElectricityUsage> getAllElectricityUsages()
    {
        return grpcClient.getElectricityUsage();
    }

    @Override
    public ElectricityUsage insertElectricityUsage(ElectricityUsage electricityUsage) {
        return grpcClient.insertElectricityUsage(electricityUsage);
    }

    @Override
    public ElectricityUsage editElectricityUsage(ElectricityUsage usage)
    {
        return grpcClient.editElectricityUsage(usage);
    }

    @Override
    public void deleteElectricityUsage(int id)
    {
        grpcClient.deleteElectricityUsage(id);
    }

//    @Override
//    public ElectricityUsage editElectricityUsage(ElectricityUsage usage) {
//        return grpcClient.editElectricityUsage(usage);
//    }
}
