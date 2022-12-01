package via.sep3.tier2.repository.implementations;

import org.springframework.stereotype.Component;
import via.sep3.tier2.GrpcClient;
import via.sep3.tier2.model.UsageList;
import via.sep3.tier2.model.WaterUsage;
import via.sep3.tier2.repository.Interfaces.WaterUsageRepository;

import java.util.ArrayList;

@Component
public class WaterUsageRepositoryImpl implements WaterUsageRepository {


    private WaterUsageRepositoryImpl() {
    }


    @Override
    public ArrayList<WaterUsage> getUserWaterUsages(int id) {
        GrpcClient grpc = new GrpcClient();
        grpc.getUsage();

        UsageList usageList = UsageList.getInstance();

        ArrayList<WaterUsage> w = usageList.getwUsage();

        ArrayList<WaterUsage> userW = new ArrayList<>();

        for (WaterUsage currentW : w) {

            if (currentW.getUserId() == id) {
                userW.add(currentW);
            }

        }
        return userW;
    }

    @Override
    public String insertWaterUsage(WaterUsage usage) {
        //TODO implement gRPC calls
        return null;
    }
}
