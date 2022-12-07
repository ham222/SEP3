package via.sep3.tier2.logic.servicesImpl;

import org.springframework.stereotype.Service;
import via.sep3.tier2.logic.interfaces.UserService;
import via.sep3.tier2.model.User;
import via.sep3.tier2.model.dto.LoginCredentials;
import via.sep3.tier2.repository.Interfaces.UserRepository;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    final
    UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public ArrayList<User> getUsers() {
        return repository.getUsers();
    }

    @Override
    public User createUser(LoginCredentials loginCredentials)
    {
        User user = new User(0, loginCredentials.getUsername(), loginCredentials.getPassword(), 1);
        return repository.saveUser(user);
    }

    @Override
    public User findUserByUsername(String username)
    {
        return repository.findUserByUsername(username);
    }
}
