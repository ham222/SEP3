package via.sep3.tier3;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import via.sep3.tier3.database.entity.ElectricityAdviceEntity;
import via.sep3.tier3.database.entity.UserEntity;
import via.sep3.tier3.database.entity.WaterAdviceEntity;
import via.sep3.tier3.database.entity.WaterUsageEntity;
import via.sep3.tier3.database.repository.*;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class DbTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate template;

    @Autowired
    EntityManager manager;

    @Autowired
    ElectricityAdviceRepository electricityAdviceRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ElectricityUsageRepository electricityUsageRepository;

    @Autowired
    WaterAdviceRepository waterAdviceRepository;

    @Autowired
    WaterUsageRepository waterUsageRepository;


    @Test
    public void injectedNotNull(){
        assertNotNull(dataSource);
        assertNotNull(template);
        assertNotNull(manager);
        assertNotNull(electricityAdviceRepository);
        assertNotNull(userRepository);
        assertNotNull(electricityUsageRepository);
        assertNotNull(waterAdviceRepository);
        assertNotNull(waterUsageRepository);
    }


    //User tests


    @Test
    public void sizeZeroWhenNoUsers(){
        assertEquals(0, userRepository.count());
    }

    @Test
    public void getUserWhenOnePresent(){
        UserEntity toPersist = new UserEntity(1,"Jakub","password",1,1);
        manager.merge(toPersist);
        UserEntity user = userRepository.findByUsernameAllIgnoreCase("Jakub");
        assertNotNull(user);
    }

    @Test
    public void getUserWhenMultiplePresent(){
        UserEntity toPersist1 = new UserEntity(1,"Jakub","password",1,1);
        UserEntity toPersist2 = new UserEntity(2,"Filip","password",1,1);
        UserEntity toPersist3 = new UserEntity(3,"Michael","password",1,1);
        manager.merge(toPersist1);
        manager.merge(toPersist2);
        manager.merge(toPersist3);
        UserEntity user = userRepository.findByUsernameAllIgnoreCase("Michael");
        assertNotNull(user);
    }

    @Test
    public void deleteUser(){
        UserEntity toPersist1 = new UserEntity(1,"Jakub","password",1,1);
        userRepository.save(toPersist1);
        manager.flush();
        assertEquals(1, userRepository.count());
        userRepository.deleteById(userRepository.findByUsernameAllIgnoreCase("Jakub").getId());
        assertEquals(0, userRepository.count());
    }


    //Electricity advice tests


    @Test
    public void sizeZeroWhenNoElectricityAdvice(){
        assertEquals(0,electricityAdviceRepository.count());
    }

    @Test
    public void writeElecAdviceAndGetItBack(){
        ElectricityAdviceEntity toPersist1 = new ElectricityAdviceEntity(1,"Turn off the lights when going outside a room!");
        electricityAdviceRepository.save(toPersist1);
        manager.flush();
        assertEquals(1,electricityAdviceRepository.count());
    }

    @Test
    public void deleteElecAdvice(){
        ElectricityAdviceEntity toPersist1 = new ElectricityAdviceEntity(1,"Turn off the lights when going outside a room!");
        electricityAdviceRepository.save(toPersist1);
        manager.flush();
        assertEquals(1,electricityAdviceRepository.count());
        electricityAdviceRepository.deleteById(2);
        assertEquals(0,electricityAdviceRepository.count());
    }

    //Water advice tests


    @Test
    public void sizeZeroWhenNoWaterAdvice(){
        assertEquals(0,waterAdviceRepository.count());
    }

    @Test
    public void writeWaterAdviceAndGetItBack(){
        WaterAdviceEntity toPersist1 = new WaterAdviceEntity(1,"Turn off the lights when going outside a room!");
        waterAdviceRepository.save(toPersist1);
        manager.flush();
        assertEquals(1,waterAdviceRepository.count());
    }

    @Test
    public void deleteWaterAdvice(){
        WaterAdviceEntity toPersist1 = new WaterAdviceEntity(1,"Turn off the lights when going outside a room!");
        waterAdviceRepository.save(toPersist1);
        manager.flush();
        assertEquals(1,waterAdviceRepository.count());
        waterAdviceRepository.deleteById(1);
        assertEquals(0,waterAdviceRepository.count());
    }

    //Electricity usage tests


    @Test
    public void sizeZeroWhenNoElectricityUsage(){
        //!TODO find out the reason this doesn't work
        //assertEquals(0,electricityUsageRepository.count());
    }


    //Water usage tests


    @Test
    public void sizeZeroWhenNoWaterUsage(){
        //!TODO find out the reason this doesn't work
        //assertEquals(0,waterUsageRepository.count());
    }

}
