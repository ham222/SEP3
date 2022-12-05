package via.sep3.tier2.logic.servicesImpl;

import org.springframework.stereotype.Service;
import via.sep3.tier2.logic.interfaces.WaterAdviceService;
import via.sep3.tier2.model.WaterUsageAdvice;
import via.sep3.tier2.repository.Interfaces.WaterAdviceRepository;

@Service
public class WaterAdviceServiceImpl implements WaterAdviceService {

    final
    WaterAdviceRepository repository;

    public WaterAdviceServiceImpl(WaterAdviceRepository repository) {
        this.repository = repository;
    }


    @Override
    public WaterUsageAdvice getWaterAdvice() {
        return repository.getWaterAdvice();
    }
}
