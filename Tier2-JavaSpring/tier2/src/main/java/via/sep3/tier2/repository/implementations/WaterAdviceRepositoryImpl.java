package via.sep3.tier2.repository.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import via.sep3.tier2.GrpcClient;
import via.sep3.tier2.model.WaterUsageAdvice;
import via.sep3.tier2.repository.Interfaces.WaterAdviceRepository;

import java.util.ArrayList;

@Component
public class WaterAdviceRepositoryImpl implements WaterAdviceRepository {


    @Autowired
    GrpcClient grpcClient;

    @Override
    public WaterUsageAdvice getAdviceById(int id) {

        return grpcClient.getWaterAdviceById(id);
    }

    @Override
    public WaterUsageAdvice createAdvice(WaterUsageAdvice waterUsageAdvice) {

        return   grpcClient.createWaterAdvice(waterUsageAdvice);
    }

    @Override
    public void deleteAdviceById(int id) {
        grpcClient.deleteWaterAdviceById(id);
    }


    public ArrayList<WaterUsageAdvice> getAllWaterAdvice(){
        return grpcClient.getAllWaterAdvice();
    }

    @Override
    public WaterUsageAdvice editAdviceById(WaterUsageAdvice fromPath)
    {
        return grpcClient.editWaterAdviceById(fromPath);
    }

    @Override
    public void assignWaterAdvice(int id, int adviceId)
    {
        grpcClient.assignWaterAdvice(id, adviceId);
    }

    @Override
    public WaterUsageAdvice updateAdvice(WaterUsageAdvice fromPath)
    {
        return grpcClient.updateWaterAdvice(fromPath);
    }

    @Override
    public ArrayList<WaterUsageAdvice> getWaterAdviceByUserId(int id)
    {
        return grpcClient.getWaterAdviceByUserId(id);
    }
}

