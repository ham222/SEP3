package via.sep3.tier3.database.service.implimentations;

import org.springframework.stereotype.Service;
import via.sep3.tier3.database.entity.UserEntity;
import via.sep3.tier3.database.repository.UserRepository;
import via.sep3.tier3.database.service.UserService;


import java.util.List;


@Service
public class UserServiceImpl implements UserService
{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> getAllUsers()
    {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUserById(int id)
    {
        return userRepository.findById(id).orElse(null);
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
            userEntity.setPassword(user.getPassword());
            userEntity.setRole(user.getRole());
            return userRepository.save(userEntity);
        }).orElse(null);
    }

    @Override
    public void deleteUser(int id)
    {
        userRepository.deleteById(id);

    }
}
