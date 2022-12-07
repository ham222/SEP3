package via.sep3.tier2.repository.Interfaces;

import com.google.protobuf.InvalidProtocolBufferException;
import via.sep3.tier2.model.WaterUsageAdvice;

import java.util.ArrayList;

public interface WaterAdviceRepository {

    WaterUsageAdvice getAdviceById(int id);

    void createAdvice(WaterUsageAdvice waterUsageAdvice);


    void deleteAdviceById(int id);

    ArrayList<WaterUsageAdvice> getAllWaterAdvice();


    WaterUsageAdvice UpdateAdvice(WaterUsageAdvice waterUsageAdvice) ;
}
