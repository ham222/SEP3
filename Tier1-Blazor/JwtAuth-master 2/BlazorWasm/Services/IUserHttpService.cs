using Shared.Models;

namespace BlazorWasm.Services;

public interface IUserHttpService
{
    public Task<User> getUserById(int id);
    public Task<ICollection<User>> getAllUsers();
    public Task updateUser(User user);
    
    public Task<int> getUserIdByUserName(string name);

    Task deleteUser(int id);

    Task<User> getUserByUserName(string name);
}




