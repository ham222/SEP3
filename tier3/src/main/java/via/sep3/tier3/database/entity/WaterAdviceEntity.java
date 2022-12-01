package via.sep3.tier3.database.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "water_advice")
public class WaterAdviceEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "text")
    String text;

    @JsonIgnore
    @ManyToMany(mappedBy = "waterAdvices")
    Set<UserEntity> users = new HashSet<>();

    public WaterAdviceEntity()
    {
    }

    public WaterAdviceEntity(int id, String text)
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
