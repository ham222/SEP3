package via.sep3.tier3.database.service;

import via.sep3.tier3.database.entity.ElectricityUsageEntity;

import java.util.List;

public interface ElectricityUsageService
{
    List<ElectricityUsageEntity> getAllElectricityUsages();
    ElectricityUsageEntity getElectricityUsageById(int id);
    ElectricityUsageEntity saveElectricityUsage(ElectricityUsageEntity electricityUsage);
    ElectricityUsageEntity updateElectricityUsage(ElectricityUsageEntity electricityUsage);
    void deleteElectricityUsage(int id);
}
