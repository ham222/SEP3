package via.sep3.tier3.database.entity;


import javax.persistence.*;

@Entity
@Table(name = "water_usage")
public class WaterUsageEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;


    @Column(name = "amount")
    double amount;

    @Column(name = "month")
    int month;

    @Column(name = "year")
    int year;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    UserEntity user;

    public WaterUsageEntity()
    {
    }

    public WaterUsageEntity(int id, double amount, int month, int year, UserEntity user)
    {
        this.id = id;
        this.amount = amount;
        this.month = month;
        this.year = year;
        this.user = user;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public UserEntity getUser()
    {
        return user;
    }

    public void setUser(UserEntity user)
    {
        this.user = user;
    }

    public int getUserId()
    {
        return user.getId();
    }
}
