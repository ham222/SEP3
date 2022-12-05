package via.sep3.tier3.database.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import via.generatedprotos.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "electricity_advice")
public class ElectricityAdviceEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "text")
    String text;

    @JsonIgnore
    @ManyToMany(mappedBy = "electricityAdvices")
    Set<UserEntity> users = new HashSet<>();

    public ElectricityAdviceEntity()
    {
    }

    public ElectricityAdviceEntity(int id, String text )
    {
        this.id = id;
        this.text = text;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public Set<UserEntity> getUsers()
    {
        return users;
    }

    public void setUsers(Set<UserEntity> users)
    {
        this.users = users;
    }
}