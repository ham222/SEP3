using System.Security.Claims;
using System.Text;
using System.Text.Json;
using Shared.Dtos;
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
        
        User result = JsonSerializer.Deserialize<User>(responseContent);
        
        if(result.id == 0)
        {
            Console.WriteLine("User not found");
            throw new Exception("Username already exists");
        }
    }

    public async Task<int> getUserIdByUserName(string name)
    {
        Username username = new Username{username = name};
        string contentAsJson = JsonSerializer.Serialize(username);
        StringContent content = new(contentAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync($"http://localhost:8081/api/users/username", content);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        User post = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        Console.WriteLine(post.id);
        return post.id;
    }
    
    public async Task<User> getUserByUserName(string name)
    {
        Username username = new Username{username = name};
        string contentAsJson = JsonSerializer.Serialize(username);
        StringContent content = new(contentAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync($"http://localhost:8081/api/users/username", content);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        User post = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        Console.WriteLine(post.id);
        return post;
    }

    public async Task deleteUser(int id)
    {
        HttpResponseMessage response = await client.DeleteAsync($"http://localhost:8081/api/users/{id}");
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }
}