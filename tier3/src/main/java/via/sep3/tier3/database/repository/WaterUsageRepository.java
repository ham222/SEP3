package via.sep3.tier3.database.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import via.sep3.tier3.database.entity.UserEntity;
import via.sep3.tier3.database.entity.WaterUsageEntity;

@Repository
public interface WaterUsageRepository extends JpaRepository<WaterUsageEntity, Integer>
{
    @Transactional
    @Modifying
    @Query("update WaterUsageEntity w set w.amount = ?1, w.month = ?2, w.year = ?3, w.user = ?4 where w.id = ?5")
    void updateWaterUsage(double amount, int month, int year, UserEntity user,@NonNull int idToFind);

    @Transactional
    @Modifying
    @Query("delete from WaterUsageEntity w where w.user.id = ?1")
    void deleteWhereUserId(@NonNull int id);



}
