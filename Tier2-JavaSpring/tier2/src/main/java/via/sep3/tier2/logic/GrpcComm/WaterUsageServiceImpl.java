package via.sep3.tier2.logic.GrpcComm;

import org.springframework.stereotype.Component;
import via.sep3.tier2.GrpcClient;
import via.sep3.tier2.logic.Interfaces.WaterUsageService;
import via.sep3.tier2.model.UsageList;
import via.sep3.tier2.model.WaterUsage;

import java.util.ArrayList;

@Component
public class WaterUsageServiceImpl implements WaterUsageService {

    private static WaterUsageServiceImpl instance;

    private WaterUsageServiceImpl(){
    }

    public static WaterUsageServiceImpl getInstance(){
        if(instance==null){
            instance = new WaterUsageServiceImpl();
        }
        return instance;
    }

    @Override
    public ArrayList<WaterUsage> getUserWaterUsages(int id) {
        GrpcClient grpc = new GrpcClient();
        grpc.getUsage();

        UsageList usageList = UsageList.getInstance();

        ArrayList<WaterUsage> w = usageList.getwUsage();

        ArrayList<WaterUsage> userW = new ArrayList<>();

        for (WaterUsage currentW:w) {

            if (currentW.getUserId() ==  id)
            {
                userW.add(currentW);
            }

        }
        return userW;
    }
}
