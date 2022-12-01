package via.sep3.tier2.repository.implementations;

import org.springframework.stereotype.Component;
import via.sep3.tier2.model.WaterUsageAdvice;
import via.sep3.tier2.repository.Interfaces.WaterAdviceRepository;

@Component
public class WaterAdviceRepositoryImpl implements WaterAdviceRepository {


    @Override
    public WaterUsageAdvice getWaterAdvice() {
        //TODO implement gRPC calls
        return null;
    }
}
