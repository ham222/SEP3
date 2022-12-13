package via.sep3.tier3.database.service.implimentations;

import org.springframework.stereotype.Service;
import via.sep3.tier3.database.entity.UserEntity;
import via.sep3.tier3.database.repository.ElectricityUsageRepository;
import via.sep3.tier3.database.repository.UserRepository;
import via.sep3.tier3.database.repository.WaterUsageRepository;
import via.sep3.tier3.database.service.UserService;


import java.util.List;


@Service
public class UserServiceImpl implements UserService
{
    private final UserRepository userRepository;
    private final WaterUsageRepository waterUsageRepository;
    private final ElectricityUsageRepository electricityUsageRepository;

    public UserServiceImpl(UserRepository userRepository, WaterUsageRepository waterUsageRepository, ElectricityUsageRepository electricityUsageRepository)
    {
        this.userRepository = userRepository;
        this.waterUsageRepository = waterUsageRepository;
        this.electricityUsageRepository = electricityUsageRepository;
    }

    @Override
    public List<UserEntity> getAllUsers()
    {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUserById(int id)
    {
        try
        {
            return userRepository.findById(id).get();
        }
        catch (Exception e)
        {
            return null;
        }

    }

    @Override
    public UserEntity getUserByUsername(String username)
    {
        return userRepository.findByUsernameAllIgnoreCase(username);
    }

    @Override
    public UserEntity saveUser(UserEntity user)
    {
        return userRepository.save(user);
    }

    @Override
    public UserEntity updateUser(UserEntity user)
    {
        return userRepository.findById(user.getId()).map(userEntity -> {
            userEntity.setUsername(user.getUsername());
            userEntity.setRole(user.getRole());
            userEntity.setArea(user.getArea());
            return userRepository.save(userEntity);
        }).orElse(null);
    }

    @Override
    public void deleteUser(int id)
    {
        waterUsageRepository.deleteWhereUserId(id);
        electricityUsageRepository.deleteWhereUserId(id);
        userRepository.deleteById(id);
    }
}
