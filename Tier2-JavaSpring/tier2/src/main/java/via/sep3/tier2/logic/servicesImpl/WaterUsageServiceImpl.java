package via.sep3.tier2.logic.servicesImpl;

import org.springframework.stereotype.Service;
import via.sep3.tier2.logic.interfaces.WaterUsageService;
import via.sep3.tier2.model.WaterUsage;
import via.sep3.tier2.repository.Interfaces.WaterUsageRepository;

import java.util.ArrayList;

@Service
public class WaterUsageServiceImpl implements WaterUsageService {

    final
    WaterUsageRepository repository;

    private WaterUsageServiceImpl(WaterUsageRepository repository) {
        this.repository = repository;
    }


    @Override
    public ArrayList<WaterUsage> getUserWaterUsages(int id) {
        return repository.getUserWaterUsages(id);
    }

    @Override
    public String insertWaterUsage(WaterUsage usage) {
        return repository.insertWaterUsage(usage);
    }
}
