package via.sep3.tier2.repository.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import via.sep3.tier2.GrpcClient;
import via.sep3.tier2.model.ElectricityUsageAdvice;
import via.sep3.tier2.repository.Interfaces.ElectricityAdviceRepository;

import java.util.ArrayList;

@Component
public class ElectricityAdviceRepositoryImpl implements ElectricityAdviceRepository {

    @Autowired
    GrpcClient grpcClient;

    @Override
    public ElectricityUsageAdvice getAdviceById(int id) {
        //TODO implement
        return null;
    }

    @Override
    public void createAdvice(ElectricityUsageAdvice electricityUsageAdvice) {
        grpcClient.createElectricityAdvice(electricityUsageAdvice);
    }

    @Override
    public void deleteAdviceById(int id) {
        //TODO implement
    }

    public ArrayList<ElectricityUsageAdvice> getAllElectricityAdvice(){
        return grpcClient.getAllElectricityAdvice();
    }

    @Override
    public ElectricityUsageAdvice editAdviceById(int id)
    {
        return null;
    }

//    @Override
//    public ElectricityUsageAdvice editAdviceById(int id) {
//        return grpcClient.editElectricityAdviceById(id);
//    }
}
