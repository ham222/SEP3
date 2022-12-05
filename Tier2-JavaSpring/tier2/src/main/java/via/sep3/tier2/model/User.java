package via.sep3.tier2.model;

public class User {

    int id;
    String username;
    String password;
    int role;
    int area;

    public User(int id, String username, String password, int role, int area) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.area=area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getArea(){return area;}

    public void setArea(int area) {this.area = area;}
}
