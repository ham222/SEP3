using System.Text;
using System.Text.Json;
using Shared.Models;

namespace BlazorWasm.Services.Http;

public class UsageHttpService : IUsageHttpService
{
    private readonly HttpClient client = new ();
    
    public async Task LogWaterUsageAsync(WaterUsage waterUsage, int userId)
    {
        string waterAsJson = JsonSerializer.Serialize(waterUsage);
        StringContent content = new(waterAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync($"http://localhost:8081/api/users/{userId}/water", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }

    public async Task LogElectricityUsageAsync(ElectricityUsage ectricityUsage, int userId)
    {
        string ectricityAsJson = JsonSerializer.Serialize(ectricityUsage);
        StringContent content = new(ectricityAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync($"http://localhost:8081/api/users/{userId}/electricity", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }

    public async Task<ICollection<WaterUsage>> GetWaterUsagesByUserId(int userId)
    {
        HttpResponseMessage response = await client.GetAsync($"http://localhost:8081/api/users/{userId}/water");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        ICollection<WaterUsage> posts = (ICollection<WaterUsage>)JsonSerializer.Deserialize<IEnumerable<WaterUsage>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return await Task.FromResult(posts);
    }

    public async Task<ICollection<ElectricityUsage>> GetElectricityUsagesByUserId(int userId)
    {
        HttpResponseMessage response = await client.GetAsync($"http://localhost:8081/api/users/{userId}/electricity");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        ICollection<ElectricityUsage> posts = (ICollection<ElectricityUsage>)JsonSerializer.Deserialize<IEnumerable<ElectricityUsage>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return posts;
    }

    public async Task UpdateWaterUsage(WaterUsage waterUsage)
    {
        string waterAsJson = JsonSerializer.Serialize(waterUsage);
        StringContent content = new(waterAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync($"http://localhost:8081/api/users/{waterUsage.userId}/water/edit", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }

    public async Task UpdateElectricityUsage(ElectricityUsage electricityUsage)
    {
        string electricityAsJson = JsonSerializer.Serialize(electricityUsage);
        StringContent content = new(electricityAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync($"http://localhost:8081/api/users/{electricityUsage.userId}/electricity/edit", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }

    public async Task<double> GetWaterAverage(int area)
    {
        HttpResponseMessage response = await client.GetAsync($"http://localhost:8081/api/area/{area}/water");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        try
        {
            double posts = JsonSerializer.Deserialize<double>(result, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
            return posts;
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return 0;
        }
        
    }

    public async Task<double> GetElectricityAverage(int area)
    {
        HttpResponseMessage response = await client.GetAsync($"http://localhost:8081/api/area/{area}/electricity");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        try
        {
            double posts = JsonSerializer.Deserialize<double>(result, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
            return posts;
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return 0;
        }
    }
}