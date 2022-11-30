package via.sep3.tier3.database.entity;

import javax.persistence.*;

public class ElectricityUsageEntity
{
    @Entity
    @Table(name = "electricity_usage")
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

    }
}
