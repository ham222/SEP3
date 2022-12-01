package via.sep3.tier3.database.service.implimentations;

import org.springframework.stereotype.Service;
import via.sep3.tier3.database.entity.WaterUsageEntity;
import via.sep3.tier3.database.repository.WaterUsageRepository;
import via.sep3.tier3.database.service.WaterUsageService;


import java.util.List;

@Service
public class WaterUsageServiceImpl implements WaterUsageService
{
    WaterUsageRepository waterUsageRepository;

    public WaterUsageServiceImpl(WaterUsageRepository waterUsageRepository)
    {
        this.waterUsageRepository = waterUsageRepository;
    }

    @Override
    public List<WaterUsageEntity> getAllWaterUsages()
    {
        return waterUsageRepository.findAll();
    }

    @Override
    public WaterUsageEntity getWaterUsageById(int id)
    {
        return waterUsageRepository.findById(id).orElse(null);
    }

    @Override
    public WaterUsageEntity saveWaterUsage(WaterUsageEntity waterUsage)
    {
        return waterUsageRepository.save(waterUsage);
    }

    @Override
    public WaterUsageEntity updateWaterUsage(WaterUsageEntity waterUsage)
    {
        waterUsageRepository.updateWaterUsage(
                waterUsage.getAmount(),
                waterUsage.getMonth(),
                waterUsage.getYear(),
                waterUsage.getUser(),
                waterUsage.getId()
        );
       return waterUsageRepository.findById(waterUsage.getId()).orElse(null);
    }

    @Override
    public void deleteWaterUsage(int id)
    {
        waterUsageRepository.deleteById(id);

    }
}
