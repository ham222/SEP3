using System.Text.Json;
using Domain.Models;
using HttpClients.ClientInterface;

namespace HttpClients.Implementations;

public class WaterHttpClient : IWaterService
{
    private readonly HttpClient client;

    public WaterHttpClient(HttpClient client)
    {
        this.client = client;
    }
    public async Task<ICollection<WaterUsage>> GetAsync(int? userId)
    {
        string query = "";

        Console.WriteLine("Base address:" + client.BaseAddress);
        //http://localhost:8081/api/users/{userId}/water
        HttpResponseMessage response = await client.GetAsync($"http://localhost:8081/api/users/1/water");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ICollection<WaterUsage> todos = JsonSerializer.Deserialize<ICollection<WaterUsage>>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return (ICollection<WaterUsage>)todos;
    }
    
    
}