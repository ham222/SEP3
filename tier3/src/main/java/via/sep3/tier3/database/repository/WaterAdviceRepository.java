package via.sep3.tier3.database.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import via.sep3.tier3.database.entity.UserEntity;
import via.sep3.tier3.database.entity.WaterAdviceEntity;

@Repository
public interface WaterAdviceRepository extends JpaRepository<WaterAdviceEntity, Integer>
{

    @Transactional
    @Modifying
    @Query("update WaterAdviceEntity w set w.text = ?1 where w.id = ?2")
    void updateWaterAdvice(String text,  @NonNull int id);













//    @Transactional
//    @Modifying
//    @Query("delete from WaterAdviceEntity.users w  where w.id = ?1")
//    void deleteUser(@NonNull int id);


}

