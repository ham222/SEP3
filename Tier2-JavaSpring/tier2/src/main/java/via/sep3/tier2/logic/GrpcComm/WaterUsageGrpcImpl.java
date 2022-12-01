package via.sep3.tier2.logic.GrpcComm;

import via.sep3.tier2.GrpcClient;
import via.sep3.tier2.logic.Interfaces.WaterUsageGrpc;
import via.sep3.tier2.model.UsageList;
import via.sep3.tier2.model.WaterUsage;

import java.util.ArrayList;

public class WaterUsageGrpcImpl implements WaterUsageGrpc {

    private static WaterUsageGrpcImpl instance;

    private WaterUsageGrpcImpl(){
    }

    public static WaterUsageGrpcImpl getInstance(){
        if(instance==null){
            instance = new WaterUsageGrpcImpl();
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
