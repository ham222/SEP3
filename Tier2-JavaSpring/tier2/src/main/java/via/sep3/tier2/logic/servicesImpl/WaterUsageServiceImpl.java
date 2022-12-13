package via.sep3.tier2.logic.servicesImpl;

import org.springframework.stereotype.Service;
import via.sep3.tier2.logic.interfaces.UserService;
import via.sep3.tier2.logic.interfaces.WaterAdviceService;
import via.sep3.tier2.logic.interfaces.WaterUsageService;
import via.sep3.tier2.model.ElectricityUsageAdvice;
import via.sep3.tier2.model.User;
import via.sep3.tier2.model.WaterUsage;
import via.sep3.tier2.model.WaterUsageAdvice;
import via.sep3.tier2.repository.Interfaces.WaterUsageRepository;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class WaterUsageServiceImpl implements WaterUsageService
{

    final
    WaterUsageRepository repository;

    final WaterAdviceService adviceService;

    final
    UserService userService;

    private WaterUsageServiceImpl(WaterUsageRepository repository, WaterAdviceService adviceService, UserService userService)
    {
        this.repository = repository;
        this.adviceService = adviceService;
        this.userService = userService;
    }


    @Override
    public ArrayList<WaterUsage> getUserWaterUsages(int id)
    {
        return repository.getUserWaterUsages(id);
    }

    @Override
    public WaterUsage insertWaterUsage(WaterUsage usage)
    {

        if (usage.getAmount() > 100)
        {
            ArrayList<WaterUsageAdvice> advices = adviceService.getAllWaterAdvice();
            ArrayList<WaterUsageAdvice> userAdvices = adviceService.getWaterAdviceByUserId(usage.getUserId());
            ArrayList<WaterUsageAdvice> advicesToAssign = new ArrayList<>();
            System.out.println("amount is greater than 100");
            if (userAdvices.size() != advices.size())
            {
                if (userAdvices.size() == 0)
                {
                    advicesToAssign = advices;
                } else
                {
                    ArrayList<WaterUsageAdvice> i = new ArrayList<>();
                    for (WaterUsageAdvice advice : userAdvices)
                    {
                        advices.forEach(advice1 ->
                        {
                            if (advice1.getId() != advice.getId())
                            {
                                i.add(advice1);
                            }
                        });
                    }
                    advicesToAssign = i;
                }
                System.out.println("advices to assign: " + advicesToAssign.size());
                int adviceId;
                if(advicesToAssign.size() == 1)
                {
                    adviceId = advicesToAssign.get(0).getId();
                }else {
                    int randomNum = getRandomNumber(1, advicesToAssign.size());
                    adviceId = advicesToAssign.get(randomNum).getId();
                }

                System.out.println("Start assigning advice " + adviceId);
                adviceService.assignWaterAdvice(usage.getUserId(), adviceId);
                System.out.println("assigned advice " + adviceId);
            }


        }


        return repository.insertWaterUsage(usage);
    }

    @Override
    public WaterUsage editWaterUsage(WaterUsage fromPath)
    {
        return repository.editWaterUsage(fromPath);
    }

    @Override
    public void deleteWaterUsage(int id)
    {
        repository.deleteWaterUsage(id);
    }

    @Override
    public double getAverageWaterUsageByArea(int id)
    {
        ArrayList<WaterUsage> usages = repository.getAllWaterUsages();
        ArrayList<User> users = userService.getUsers();
        double sum = 0;
        int count = 0;
        for (WaterUsage usage : usages)
        {
            for (User user : users)
            {
                if (user.getArea() == id && user.getId() == usage.getUserId())
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
