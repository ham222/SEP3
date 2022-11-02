package via.sep3.tier2.logic.DAOs;

import via.sep3.tier2.GrpcClient;
import via.sep3.tier2.logic.Interfaces.WaterUsageDAO;
import via.sep3.tier2.model.UsageListImpl;
import via.sep3.tier2.model.UserImpl;
import via.sep3.tier2.model.WaterUsageAdviceImpl;
import via.sep3.tier2.model.WaterUsageImpl;

import java.util.ArrayList;

public class WaterUsageDAOImpl implements WaterUsageDAO {

    private static WaterUsageDAOImpl instance;

    private WaterUsageDAOImpl(){
    }

    public static WaterUsageDAOImpl getInstance(){
        if(instance==null){
            instance = new WaterUsageDAOImpl();
        }
        return instance;
    }

    @Override
    public ArrayList<WaterUsageImpl> getUserWaterUsages(int id) {
        GrpcClient grpc = new GrpcClient();
        grpc.getUsage();

        UsageListImpl usageList = UsageListImpl.getInstance();

        ArrayList<WaterUsageImpl> w = usageList.getwUsage();

        ArrayList<WaterUsageImpl> userW = new ArrayList<>();

        for (WaterUsageImpl currentW:w) {

            if (currentW.getUserId() ==  id)
            {
                userW.add(currentW);
            }

        }
        return userW;
    }
}
