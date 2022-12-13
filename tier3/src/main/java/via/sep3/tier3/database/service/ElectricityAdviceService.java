package via.sep3.tier3.database.service;

import via.sep3.tier3.database.entity.ElectricityAdviceEntity;
import via.sep3.tier3.database.entity.UserEntity;
import via.sep3.tier3.database.entity.WaterAdviceEntity;

import java.util.List;

public interface ElectricityAdviceService
{
    List<ElectricityAdviceEntity> getAllElectricityAdvices();
    ElectricityAdviceEntity getElectricityAdviceById(int id);
    ElectricityAdviceEntity saveElectricityAdvice(ElectricityAdviceEntity electricityAdvice);
    ElectricityAdviceEntity updateElectricityAdvice(ElectricityAdviceEntity electricityAdvice);
    void deleteElectricityAdvice(int id);
    List<ElectricityAdviceEntity> getElectricityAdviceByUserId(int id);
    void assignElectricityAdviceToUser(UserEntity user, ElectricityAdviceEntity advice);



}
