package via.sep3.tier2.logic.servicesImpl;

import org.springframework.stereotype.Service;
import via.sep3.tier2.logic.interfaces.ElectricityAdviceService;
import via.sep3.tier2.logic.interfaces.ElectricityUsageService;
import via.sep3.tier2.logic.interfaces.UserService;
import via.sep3.tier2.model.ElectricityUsage;
import via.sep3.tier2.model.ElectricityUsageAdvice;
import via.sep3.tier2.model.User;
import via.sep3.tier2.repository.Interfaces.ElectricityUsageRepository;

import javax.swing.text.AbstractDocument;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class ElectricityUsageServiceImpl implements ElectricityUsageService
{

    final
    ElectricityUsageRepository repository;

    final ElectricityAdviceService adviceService;

    final
    UserService userService;

    private ElectricityUsageServiceImpl(ElectricityUsageRepository repository, ElectricityAdviceService adviceService, UserService userService)
    {
        this.repository = repository;
        this.adviceService = adviceService;
        this.userService = userService;
    }


    @Override
    public ArrayList<ElectricityUsage> getUserElectricityUsages(int id)
    {
        return repository.getUserElectricityUsages(id);
    }

    @Override
    public ElectricityUsage insertElectricityUsage(ElectricityUsage usage)
    {


        if (usage.getAmount() > 100)
        {
            ArrayList<ElectricityUsageAdvice> advices = adviceService.getAllElectricityAdvice();
            ArrayList<ElectricityUsageAdvice> userAdvices = adviceService.getElectricityAdviceByUserId(usage.getUserId());
            ArrayList<ElectricityUsageAdvice> advicesToAssign = new ArrayList<>();
            System.out.println("amount is greater than 100");
            if (userAdvices.size() != advices.size())
            {
                if (userAdvices.size() == 0)
                {
                    advicesToAssign = advices;
                } else
                {
                    ArrayList<ElectricityUsageAdvice> i = new ArrayList<>();
                    for (ElectricityUsageAdvice advice : userAdvices)
                    {
                        advices.forEach(advice1 ->
                        {
                            if (advice1.getId() != advice.getId())
                            {
                                i.add(advice1);
                                System.out.println("added advice " + advice1.getId());
                            }
                        });
                    }
                    advicesToAssign = i;
                }
                System.out.println("E advices to assign: " + advicesToAssign.size());
                int adviceId;
                if(advicesToAssign.size() == 1)
                {
                    adviceId = advicesToAssign.get(0).getId();
                }else {
                    int randomNum = getRandomNumber(1, advicesToAssign.size());
                    adviceId = advicesToAssign.get(randomNum).getId();
                }

                System.out.println("Start assigning advice " + adviceId);
                adviceService.assignElectricityAdvice(usage.getUserId(), adviceId);
                System.out.println("assigned advice " + adviceId);
            }
        }

        return repository.insertElectricityUsage(usage);
    }

    @Override
    public ElectricityUsage editElectricityUsage(ElectricityUsage usage)
    {
        return repository.editElectricityUsage(usage);
    }

    @Override
    public void deleteElectricityUsage(int id)
    {
        repository.deleteElectricityUsage(id);
    }

    @Override
    public double getAverageElectricityUsageByArea(int areaId)
    {
        ArrayList<ElectricityUsage> usages = repository.getAllElectricityUsages();
        ArrayList<User> users = userService.getUsers();
        double sum = 0;
        int count = 0;
        for (ElectricityUsage usage : usages)
        {
            for (User user : users)
            {
                if (user.getArea() == areaId && user.getId() == usage.getUserId())
                {
                    sum += usage.getAmount();
                    count++;
                }
            }
        }
        return sum / count;
    }

    public int getRandomNumber(int min, int max)
    {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
