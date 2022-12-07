package via.sep3.tier2.logic.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import via.sep3.tier2.logic.interfaces.ElectricityAdviceService;
import via.sep3.tier2.model.ElectricityUsageAdvice;
import via.sep3.tier2.model.WaterUsageAdvice;
import via.sep3.tier2.repository.Interfaces.ElectricityAdviceRepository;

import java.util.ArrayList;

@Component
public class ElectricityAdviceServiceImpl implements ElectricityAdviceService {

    final
    ElectricityAdviceRepository repository;

    public ElectricityAdviceServiceImpl(ElectricityAdviceRepository repository) {
        this.repository = repository;
    }

    @Override
    public ElectricityUsageAdvice getAdviceById(int id) {
        return repository.getAdviceById(id);
    }

    @Override
    public void createAdvice(ElectricityUsageAdvice advice) {
        repository.createAdvice(advice);
    }

    @Override
    public void deleteAdviceById(int id) {
        repository.deleteAdviceById(id);
    }

    @Override
    public ArrayList<ElectricityUsageAdvice> getAllElectricityAdvice() {
        return repository.getAllElectricityAdvice();
    }

    @Override
    public ElectricityUsageAdvice editAdviceById(int id) {
        return repository.editAdviceById(id);
    }
}
