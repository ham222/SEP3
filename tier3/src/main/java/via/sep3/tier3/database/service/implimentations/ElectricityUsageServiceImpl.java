package via.sep3.tier3.database.service.implimentations;

import org.springframework.stereotype.Service;
import via.sep3.tier3.database.entity.ElectricityUsageEntity;
import via.sep3.tier3.database.repository.ElectricityUsageRepository;
import via.sep3.tier3.database.service.ElectricityUsageService;

import java.util.List;

@Service
public class ElectricityUsageServiceImpl implements ElectricityUsageService
{
    ElectricityUsageRepository electricityUsageRepository;

    public ElectricityUsageServiceImpl(ElectricityUsageRepository electricityUsageRepository)
    {
        this.electricityUsageRepository = electricityUsageRepository;
    }

    @Override
    public List<ElectricityUsageEntity> getAllElectricityUsages()
    {
        return electricityUsageRepository.findAll();
    }

    @Override
    public ElectricityUsageEntity getElectricityUsageById(int id)
    {
        return electricityUsageRepository.findById(id).orElse(null);
    }

    @Override
    public ElectricityUsageEntity saveElectricityUsage(ElectricityUsageEntity electricityUsage)
    {
        return electricityUsageRepository.save(electricityUsage);
    }

    @Override
    public ElectricityUsageEntity updateElectricityUsage(ElectricityUsageEntity electricityUsage)
    {
        electricityUsageRepository.updateElectricityUsage(
                electricityUsage.getAmount(),
                electricityUsage.getMonth(),
                electricityUsage.getYear(),
                electricityUsage.getUser(),
                electricityUsage.getId()
        );
        return electricityUsageRepository.findById(electricityUsage.getId()).orElse(null);
    }

    @Override
    public void deleteElectricityUsage(int id)
    {
        electricityUsageRepository.deleteById(id);
    }
}
