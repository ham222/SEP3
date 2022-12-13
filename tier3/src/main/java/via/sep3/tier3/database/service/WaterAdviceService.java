package via.sep3.tier3.database.service;

import via.sep3.tier3.database.entity.ElectricityAdviceEntity;
import via.sep3.tier3.database.entity.UserEntity;
import via.sep3.tier3.database.entity.WaterAdviceEntity;

import java.util.List;

public interface WaterAdviceService
{
    List<WaterAdviceEntity> getAllWaterAdvices();
    WaterAdviceEntity getWaterAdviceById(int id);
    WaterAdviceEntity saveWaterAdvice(WaterAdviceEntity waterAdvice);
    WaterAdviceEntity updateWaterAdvice(WaterAdviceEntity waterAdvice);
    void deleteWaterAdvice(int id);
    List<WaterAdviceEntity> getWaterAdviceByUserId(int id);
    void assignWaterAdviceToUser(UserEntity user, WaterAdviceEntity advice);
}
