package via.sep3.tier3.database.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import via.sep3.tier3.database.entity.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>
{
    @Query("select u from UserEntity u where upper(u.username) = upper(?1)")
    @Nullable
    UserEntity findByUsernameAllIgnoreCase(String username);

//    @Transactional
//    @Modifying
//    @Query("delete from UserEntity.waterAdvices where WaterAdviceEntity.id = ?1")
//    void deleteWaterAdvice(@NonNull int id);



//    @Transactional
//    @Modifying
//    @Query("delete from UserEntity u inner join u.electricityAdvices electricityAdvices where electricityAdvices.id = ?1")
//    void deleteElectricityAdvice(@NonNull int id);



}
