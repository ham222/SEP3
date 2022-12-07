package via.sep3.tier2.logic.servicesImpl;

import org.springframework.stereotype.Service;
import via.sep3.tier2.logic.interfaces.ElectricityUsageService;
import via.sep3.tier2.model.ElectricityUsage;
import via.sep3.tier2.repository.Interfaces.ElectricityUsageRepository;

import java.util.ArrayList;

@Service
public class ElectricityUsageServiceImpl implements ElectricityUsageService {

    final
    ElectricityUsageRepository repository;

    private ElectricityUsageServiceImpl(ElectricityUsageRepository repository) {
        this.repository = repository;
    }


    @Override
    public ArrayList<ElectricityUsage> getUserElectricityUsages(int id) {
        return repository.getUserElectricityUsages(id);
    }

    @Override
    public void insertElectricityUsage(ElectricityUsage usage) {
        repository.insertElectricityUsage(usage);
    }
}
