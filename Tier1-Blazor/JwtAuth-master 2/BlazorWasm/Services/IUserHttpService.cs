using Shared.Models;

namespace BlazorWasm.Services;

public interface IUserHttpService
{
    public Task<User> getUserById(int id);
    public Task<User> getUserByName(string name);
    public Task<ICollection<User>> getAllUsers();
    public Task updateUser(User user);
}