using System.Text;
using System.Text.Json;
using Shared.Models;

namespace BlazorWasm.Services.Http;

public class AdviceHttpService : IAdviceHttpService
{
    private readonly HttpClient client = new ();
    public async Task CreateWaterUsageAdvice(WaterUsageAdvice waterUsageAdvice)
    {
        string adviceAsJson = JsonSerializer.Serialize(waterUsageAdvice);
        StringContent content = new(adviceAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync($"http://localhost:8081/api/advice/water", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }

    public async Task CreateElectricityUsageAdvice(ElectricityUsageAdvice electricityUsageAdvice)
    {
        string adviceAsJson = JsonSerializer.Serialize(electricityUsageAdvice);
        StringContent content = new(adviceAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync($"http://localhost:8081/api/advice/electricity", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }

    public async Task<WaterUsageAdvice> GetWaterUsageAdviceById(int id)
    {
        HttpResponseMessage response = await client.GetAsync($"http://localhost:8081/api/advice/water/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        WaterUsageAdvice post = JsonSerializer.Deserialize<WaterUsageAdvice>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return post;
    }

    public async Task<ElectricityUsageAdvice> GetElectricityUsageAdviceById(int id)
    {
        HttpResponseMessage response = await client.GetAsync($"http://localhost:8081/api/advice/electricity/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        ElectricityUsageAdvice post = JsonSerializer.Deserialize<ElectricityUsageAdvice>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return post;
    }

    public async Task UpdateWaterUsageAdvice(WaterUsageAdvice waterUsageAdvice)
    {
        string adviceAsJson = JsonSerializer.Serialize(waterUsageAdvice);
        StringContent content = new(adviceAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync($"http://localhost:8081/api/advice/water/{waterUsageAdvice.id}", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }

    public async Task UpdateElectricityUsageAdvice(ElectricityUsageAdvice electricityUsageAdvice)
    {
        string adviceAsJson = JsonSerializer.Serialize(electricityUsageAdvice);
        StringContent content = new(adviceAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync($"http://localhost:8081/api/advice/electricity/{electricityUsageAdvice.id}", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }

    public async Task DeleteWaterUsageAdvice(int id)
    {
        HttpResponseMessage response = await client.DeleteAsync($"http://localhost:8081/api/advice/water/{id}");
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }

    public async Task DeleteElectricityUsageAdvice(int id)
    {
        HttpResponseMessage response = await client.DeleteAsync($"http://localhost:8081/api/advice/electricity/{id}");
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }

    public async Task<ICollection<WaterUsageAdvice>> GetWaterUsageAdvicesByUserId(int userId)
    {
        HttpResponseMessage response = await client.GetAsync($"http://localhost:8081/api/users/{userId}/wateradvice");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        ICollection<WaterUsageAdvice> post = JsonSerializer.Deserialize<ICollection<WaterUsageAdvice>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return post;
    }

    public async Task<ICollection<ElectricityUsageAdvice>> GetElectricityUsageAdvicesByUserId(int userId)
    {
        HttpResponseMessage response = await client.GetAsync($"http://localhost:8081/api/users/{userId}/electricityadvice");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        ICollection<ElectricityUsageAdvice> post = JsonSerializer.Deserialize<ICollection<ElectricityUsageAdvice>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return post;
    }

    public async Task<ICollection<WaterUsageAdvice>> GetAllWaterUsageAdvices()
    {
        HttpResponseMessage response = await client.GetAsync($"http://localhost:8081/api/advice/water");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        ICollection<WaterUsageAdvice> post = JsonSerializer.Deserialize<ICollection<WaterUsageAdvice>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return post;
    }

    public async Task<ICollection<ElectricityUsageAdvice>> GetAllElectricityUsageAdvices()
    {
        HttpResponseMessage response = await client.GetAsync($"http://localhost:8081/api/advice/electricity");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        ICollection<ElectricityUsageAdvice> post = JsonSerializer.Deserialize<ICollection<ElectricityUsageAdvice>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return post;
    }

    public async Task AddWaterAdviceToUser(int userId, int id)
    {
        HttpResponseMessage response = await client.PostAsync($"http://localhost:8081/api/users/{userId}/wateradvice/{id}", null);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }

    public async Task AddElectricityAdviceToUser(int userId, int id)
    {
        HttpResponseMessage response = await client.PostAsync($"http://localhost:8081/api/users/{userId}/electricityadvice/{id}", null);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }
}