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

        return grpcClient.getElectricityAdviceById(id);
    }

    @Override
    public ElectricityUsageAdvice createAdvice(ElectricityUsageAdvice electricityUsageAdvice) {
       return grpcClient.createElectricityAdvice(electricityUsageAdvice);
    }

    @Override
    public void deleteAdviceById(int id) {
        grpcClient.deleteElectricityAdviceById(id);
    }

    public ArrayList<ElectricityUsageAdvice> getAllElectricityAdvice(){
        return grpcClient.getAllElectricityAdvice();
    }

    @Override
    public ElectricityUsageAdvice editAdviceById(ElectricityUsageAdvice id)
    {
        return grpcClient.editElectricityAdviceById(id);
    }

    @Override
    public void assignElectricityAdvice(int id, int adviceId)
    {
        grpcClient.assignElectricityAdvice(id, adviceId);
    }

    @Override
    public ElectricityUsageAdvice updateAdvice(ElectricityUsageAdvice fromPath)
    {
        return grpcClient.updateElectricityAdvice(fromPath);
    }

    @Override
    public ArrayList<ElectricityUsageAdvice> getElectricityAdviceByUserId(int id)
    {
        return grpcClient.getElectricityAdviceByUserId(id);
    }

//    @Override
//    public ElectricityUsageAdvice editAdviceById(int id) {
//        return grpcClient.editElectricityAdviceById(id);
//    }
}
