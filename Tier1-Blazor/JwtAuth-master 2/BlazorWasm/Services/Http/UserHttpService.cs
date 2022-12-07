using System.Security.Claims;
using System.Text;
using System.Text.Json;
using Shared.Models;

namespace BlazorWasm.Services.Http;

public class UserHttpService : IUserHttpService
{
    private readonly HttpClient client = new ();
    
    public async Task<User> getUserById(int id)
    {

        HttpResponseMessage response = await client.GetAsync($"http://localhost:8081/api/users/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        User post = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return post;
    }

    public Task<User> getUserByName(string name)
    {
        throw new NotImplementedException();
    }

    public async Task<ICollection<User>> getAllUsers()
    {
        HttpResponseMessage response = await client.GetAsync($"http://localhost:8081/api/users");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        ICollection<User> post = JsonSerializer.Deserialize<ICollection<User>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return post;
    }

    public async Task updateUser(User user)
    {
        string userAsJson = JsonSerializer.Serialize(user);
        StringContent content = new(userAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PutAsync($"http://localhost:8081/api/users/{user.id}", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }
}