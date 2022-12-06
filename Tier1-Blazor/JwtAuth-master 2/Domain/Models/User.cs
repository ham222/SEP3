namespace Domain.Models;

public class User
{
    private int id { get; }
    private string username { get; }
    private string password { get; }
    private int role { get; }

    public User(int id, string username, string password, int role)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }
}