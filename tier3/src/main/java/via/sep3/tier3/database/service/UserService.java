package via.sep3.tier3.database.service;



import via.sep3.tier3.database.entity.UserEntity;

import java.util.List;


public interface UserService
{

    List<UserEntity> getAllUsers();

    UserEntity getUserById(int id);

    UserEntity getUserByUsername(String username);

    UserEntity saveUser(UserEntity user);

    UserEntity updateUser(UserEntity user);

    void deleteUser(int id);




}
