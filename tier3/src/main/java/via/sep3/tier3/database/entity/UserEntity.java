package via.sep3.tier3.database.entity;


import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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


    @Column(name = "area")
    int area;

    @OneToMany(mappedBy = "user")
    List<WaterUsageEntity> waterUsages;

    @OneToMany(mappedBy = "user")
    List<ElectricityUsageEntity> electricityUsages;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_water_advice",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "water_advice_id")
    )
    Set<WaterAdviceEntity> waterAdvices = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_electricity_advice",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "electricity_advice_id")
    )
    Set<ElectricityAdviceEntity> electricityAdvices = new HashSet<>();

    public UserEntity()
    {
    }

    public UserEntity(int id, String username, String password, int role, int area, List<WaterUsageEntity> waterUsages, List<ElectricityUsageEntity> electricityUsages, Set<WaterAdviceEntity> waterAdvices, Set<ElectricityAdviceEntity> electricityAdvices)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.area = area;
        this.waterUsages = waterUsages;
        this.electricityUsages = electricityUsages;
        this.waterAdvices = waterAdvices;
        this.electricityAdvices = electricityAdvices;
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

    public int getArea()
    {
        return area;
    }

    public void setArea(int area)
    {
        this.area = area;
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

    public Set<WaterAdviceEntity> getWaterAdvices()
    {
        return waterAdvices;
    }

    public void setWaterAdvices(Set<WaterAdviceEntity> waterAdvices)
    {
        this.waterAdvices = waterAdvices;
    }

    public Set<ElectricityAdviceEntity> getElectricityAdvices()
    {
        return electricityAdvices;
    }

    public void setElectricityAdvices(Set<ElectricityAdviceEntity> electricityAdvices)
    {
        this.electricityAdvices = electricityAdvices;
    }

    public void assignWaterAdvice(WaterAdviceEntity advice)
    {
        waterAdvices.add(advice);
    }

    public void assignElectricityAdvice(ElectricityAdviceEntity advice)
    {
        electricityAdvices.add(advice);
    }
}
