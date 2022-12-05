package via.sep3.tier3.database.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import via.sep3.tier3.database.entity.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>
{
    @Query("select u from UserEntity u where upper(u.username) = upper(?1)")
    @Nullable
    UserEntity findByUsernameAllIgnoreCase(String username);

}
