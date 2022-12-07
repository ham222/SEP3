package via.sep3.tier2.repository.implementations;

import com.google.protobuf.InvalidProtocolBufferException;
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
        //TODO implement
        return null;
    }

    @Override
    public void createAdvice(WaterUsageAdvice waterUsageAdvice) {
        grpcClient.createWaterAdvice(waterUsageAdvice);
    }

    @Override
    public void deleteAdviceById(int id) {
        grpcClient.deleteAdviceById(id);
    }


    public ArrayList<WaterUsageAdvice> getAllWaterAdvice(){
        return grpcClient.getAllWaterAdvice();
    }



    @Override
    public via.sep3.tier2.model.WaterUsageAdvice UpdateAdvice(via.sep3.tier2.model.WaterUsageAdvice waterUsageAdvice) {
        return grpcClient.UpdateAdvice(waterUsageAdvice);
    }
}

