package via.sep3.tier3.database.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import via.sep3.tier3.database.entity.ElectricityAdviceEntity;

import java.util.List;

@Repository
public interface ElectricityAdviceRepository extends JpaRepository<ElectricityAdviceEntity, Integer>
{
    @Transactional
    @Modifying
    @Query("update ElectricityAdviceEntity e set e.text = ?1 where e.id = ?2")
    void updateElectricityAdvice(@NonNull String text, @NonNull int id);

    @Query("select e from ElectricityAdviceEntity e inner join e.users users where users.id = ?1")
    List<ElectricityAdviceEntity> getAllAdvicesByUserId(@NonNull int id);



}
