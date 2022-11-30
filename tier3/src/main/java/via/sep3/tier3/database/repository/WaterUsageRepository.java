package via.sep3.tier3.database.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sep3.tier3.database.entity.WaterUsageEntity;

@Repository
public interface WaterUsageRepository extends JpaRepository<WaterUsageEntity, Integer>
{


}
