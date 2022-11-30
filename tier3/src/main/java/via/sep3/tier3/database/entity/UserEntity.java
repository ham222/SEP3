package via.sep3.tier3.database.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    @Column(name = "role")
    int role;

    @OneToMany(mappedBy = "user")
    List<WaterUsageEntity> waterUsages;

    @OneToMany(mappedBy = "user")
    List<ElectricityUsageEntity> electricityUsages;

    public UserEntity()
    {
    }

    public UserEntity(int id, String username, String password, int role, List<WaterUsageEntity> waterUsages, List<ElectricityUsageEntity> electricityUsages)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.waterUsages = waterUsages;
        this.electricityUsages = electricityUsages;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getRole()
    {
        return role;
    }

    public void setRole(int role)
    {
        this.role = role;
    }

    public List<WaterUsageEntity> getWaterUsages()
    {
        return waterUsages;
    }

    public void setWaterUsages(List<WaterUsageEntity> waterUsages)
    {
        this.waterUsages = waterUsages;
    }

    public List<ElectricityUsageEntity> getElectricityUsages()
    {
        return electricityUsages;
    }

    public void setElectricityUsages(List<ElectricityUsageEntity> electricityUsages)
    {
        this.electricityUsages = electricityUsages;
    }
}
