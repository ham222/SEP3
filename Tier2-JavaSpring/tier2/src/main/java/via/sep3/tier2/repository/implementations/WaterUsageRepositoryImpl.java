package via.sep3.tier2.repository.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import via.sep3.tier2.GrpcClient;
import via.sep3.tier2.model.WaterUsage;
import via.sep3.tier2.repository.Interfaces.WaterUsageRepository;

import java.util.ArrayList;

@Component
public class WaterUsageRepositoryImpl implements WaterUsageRepository {

    @Autowired
    GrpcClient grpcClient;

    private WaterUsageRepositoryImpl() {
    }


    @Override
    public ArrayList<WaterUsage> getUserWaterUsages(int id) {
        ArrayList<WaterUsage> usages = grpcClient.getWaterUsage();

        ArrayList<WaterUsage> userW = new ArrayList<>();

        for (WaterUsage currentW : usages) {

            if (currentW.getUserId() == id) {
                userW.add(currentW);
            }

        }
        return userW;
    }

    @Override
    public void insertWaterUsage(WaterUsage usage) {
        grpcClient.insertWaterUsage(usage);
    }
}
