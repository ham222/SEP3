package via.sep3.tier2.logic.servicesImpl;

import org.springframework.stereotype.Component;
import via.sep3.tier2.logic.interfaces.ElectricityAdviceService;
import via.sep3.tier2.model.ElectricityUsageAdvice;
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
    public ElectricityUsageAdvice createAdvice(ElectricityUsageAdvice advice) {

        return repository.createAdvice(advice);
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
    public ElectricityUsageAdvice editAdviceById(ElectricityUsageAdvice id) {
        return repository.editAdviceById(id);
    }

    @Override
    public void assignElectricityAdvice(int id, int adviceId)
    {
        repository.assignElectricityAdvice(id, adviceId);
    }

    @Override
    public ElectricityUsageAdvice updateAdvice(ElectricityUsageAdvice fromPath)
    {
        return repository.updateAdvice(fromPath);
    }

    @Override
    public ArrayList<ElectricityUsageAdvice> getElectricityAdviceByUserId(int id)
    {
        return repository.getElectricityAdviceByUserId(id);
    }
}
