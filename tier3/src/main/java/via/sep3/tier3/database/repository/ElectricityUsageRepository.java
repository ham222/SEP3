package via.sep3.tier3.database.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import via.sep3.tier3.database.entity.ElectricityUsageEntity;
import via.sep3.tier3.database.entity.UserEntity;

@Repository
public interface ElectricityUsageRepository extends JpaRepository<ElectricityUsageEntity, Integer>
{
    @Transactional
    @Modifying
    @Query("update ElectricityUsageEntity e set e.amount = ?1, e.month = ?2, e.year = ?3, e.user = ?4 where e.id = ?5")
    void updateElectricityUsage(double amount, int month, int year, UserEntity user, @NonNull int id);

    @Transactional
    @Modifying
    @Query("delete from ElectricityUsageEntity e where e.user.id = ?1")
    void deleteWhereUserId(@NonNull int id);

}

