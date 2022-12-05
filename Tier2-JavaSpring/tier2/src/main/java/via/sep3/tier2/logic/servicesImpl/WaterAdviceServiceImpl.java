package via.sep3.tier2.logic.servicesImpl;

import org.springframework.stereotype.Service;
import via.sep3.tier2.logic.interfaces.WaterAdviceService;
import via.sep3.tier2.model.ElectricityUsageAdvice;
import via.sep3.tier2.model.WaterUsageAdvice;
import via.sep3.tier2.repository.Interfaces.ElectricityAdviceRepository;
import via.sep3.tier2.repository.Interfaces.WaterAdviceRepository;

import java.util.ArrayList;

@Service
public class WaterAdviceServiceImpl implements WaterAdviceService {

    final
    WaterAdviceRepository repository;

    public WaterAdviceServiceImpl(WaterAdviceRepository repository) {
        this.repository = repository;
    }

    @Override
    public WaterUsageAdvice getWaterAdviceById(int id) {
        return repository.getAdviceById(id);
    }

    @Override
    public void CreateAdvice(WaterUsageAdvice advice) {
        repository.createAdvice(advice);
    }

    @Override
    public void DeleteAdviceById(int id) {
        repository.deleteAdviceById(id);
    }

    @Override
    public ArrayList<WaterUsageAdvice> getAllWaterAdvice() {
        return repository.getAllWaterAdvice();
    }


}
