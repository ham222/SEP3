using System.Text.Json;
using Domain.Models;
using HttpClients.ClientInterface;

namespace HttpClients.Implementations;

public class WaterHttpClient : IWaterService
{
    private HttpClient client = new HttpClient();
    public async Task<ICollection<WaterUsage>> GetAsync(int? userId)
    {
        string query = "";

        HttpResponseMessage response = await client.GetAsync("/api/users/2/water");
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