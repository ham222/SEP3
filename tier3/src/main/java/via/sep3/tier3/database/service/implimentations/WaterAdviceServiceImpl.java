package via.sep3.tier3.database.service.implimentations;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import via.generatedprotos.WaterUsageAdvice;
import via.sep3.tier3.database.entity.ElectricityAdviceEntity;
import via.sep3.tier3.database.entity.UserEntity;
import via.sep3.tier3.database.entity.WaterAdviceEntity;
import via.sep3.tier3.database.repository.UserRepository;
import via.sep3.tier3.database.repository.WaterAdviceRepository;
import via.sep3.tier3.database.service.WaterAdviceService;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class WaterAdviceServiceImpl implements WaterAdviceService
{
    WaterAdviceRepository waterAdviceRepository;
    UserRepository userRepository;

    public WaterAdviceServiceImpl(WaterAdviceRepository waterAdviceRepository, UserRepository userRepository)
    {
        this.waterAdviceRepository = waterAdviceRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<WaterAdviceEntity> getAllWaterAdvices()
    {
        return waterAdviceRepository.findAll();
    }

    @Override
    public WaterAdviceEntity getWaterAdviceById(int id)
    {
        return waterAdviceRepository.findById(id).get();
    }

    @Override
    public WaterAdviceEntity saveWaterAdvice(WaterAdviceEntity waterAdvice)
    {
        return waterAdviceRepository.save(waterAdvice);
    }

    @Override
    public WaterAdviceEntity updateWaterAdvice(WaterAdviceEntity waterAdvice)
    {
        waterAdviceRepository.updateWaterAdvice(
                waterAdvice.getText(),
                waterAdvice.getId()
        );
        return waterAdviceRepository.findById(waterAdvice.getId()).get();
    }

    @Override
    public void deleteWaterAdvice(int id)
    {
        waterAdviceRepository.deleteById(id);
    }


    @Override
    public List<WaterAdviceEntity> getWaterAdviceByUserId(int id)
    {
        ArrayList<WaterAdviceEntity> entities = (ArrayList<WaterAdviceEntity>) getAllWaterAdvices();

        ArrayList<WaterAdviceEntity> returnList = new ArrayList<>();
        ArrayList<UserEntity> users;

        for (WaterAdviceEntity entity : entities)
        {
            users = new ArrayList<UserEntity>(entity.getUsers());
            for (UserEntity user : users)
            {
                if (user.getId() == id)
                {
                    returnList.add(entity);
                    break;
                }
            }
        }

        return returnList;
    }

    @Override
    public void assignWaterAdviceToUser(UserEntity user, WaterAdviceEntity advice)
    {

        user.assignWaterAdvice(advice);
        userRepository.save(user);

//        ArrayList<UserEntity> users;
//        try
//        {
//            users = new ArrayList<UserEntity>(advice.getUsers());
//        } catch (Exception e)
//        {
//            System.out.println("Error: " + e.getMessage());
//            users = new ArrayList<>();
//        }
//        users.add(user);
//        advice.setUsers(users);
//        waterAdviceRepository.save(advice);
    }
}

