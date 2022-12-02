package via.sep3.tier3.database.service.implimentations;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import via.sep3.tier3.database.entity.ElectricityAdviceEntity;
import via.sep3.tier3.database.entity.UserEntity;
import via.sep3.tier3.database.entity.WaterAdviceEntity;
import via.sep3.tier3.database.repository.ElectricityAdviceRepository;
import via.sep3.tier3.database.repository.UserRepository;
import via.sep3.tier3.database.service.ElectricityAdviceService;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ElectricityAdviceServiceImpl implements ElectricityAdviceService
{
    ElectricityAdviceRepository electricityAdviceRepository;
    UserRepository userRepository;

    public ElectricityAdviceServiceImpl(ElectricityAdviceRepository electricityAdviceRepository, UserRepository userRepository)
    {
        this.electricityAdviceRepository = electricityAdviceRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<ElectricityAdviceEntity> getAllElectricityAdvices()
    {
        return electricityAdviceRepository.findAll();
    }

    @Override
    public ElectricityAdviceEntity getElectricityAdviceById(int id)
    {
        return electricityAdviceRepository.findById(id).get();
    }

    @Override
    public ElectricityAdviceEntity saveElectricityAdvice(ElectricityAdviceEntity electricityAdvice)
    {
        return electricityAdviceRepository.save(electricityAdvice);
    }

    @Override
    public ElectricityAdviceEntity updateElectricityAdvice(ElectricityAdviceEntity electricityAdvice)
    {
        electricityAdviceRepository.updateElectricityAdvice(
                electricityAdvice.getText(),
                electricityAdvice.getId()
        );
        return electricityAdviceRepository.findById(electricityAdvice.getId()).get();
    }

    @Override
    public void deleteElectricityAdvice(int id)
    {
        electricityAdviceRepository.deleteById(id);
    }


    //todo maybe change it later to repository stuff
    @Override
    public List<ElectricityAdviceEntity> getElectricityAdviceByUserId(int id)
    {
        ArrayList<ElectricityAdviceEntity> entities = (ArrayList<ElectricityAdviceEntity>) getAllElectricityAdvices();

        ArrayList<ElectricityAdviceEntity> returnList = new ArrayList<>();
        ArrayList<UserEntity> users;

        for (ElectricityAdviceEntity entity : entities)
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
    public void assignElectricityAdviceToUser(UserEntity user, ElectricityAdviceEntity advice)
    {
        user.assignElectricityAdvice(advice);
        userRepository.save(user);
    }


}
