using System.Text;
using System.Text.Json;
using Shared.Dtos;
using Shared.Models;

namespace BlazorWasm.Services.Http;

public class CreateAdviceService : ICreateAdvice
{
    private readonly HttpClient client = new ();
    // this private variable for simple caching
    //public static string? Jwt { get; private set; } = "";


    public async Task CreateWaterAdviceAsync(string desc)
    {
        WaterAdvice waterAdvice = new()
        {
            body = desc
        };
       string waterAdviceAsJson = JsonSerializer.Serialize(waterAdvice);
       StringContent content = new(waterAdviceAsJson, Encoding.UTF8, "application/json");
       HttpResponseMessage response = await client.PostAsync("http://localhost:8081/api/advice/water", content);
       string responseAsString = await response.Content.ReadAsStringAsync();
       
       if(!response.IsSuccessStatusCode)
       {
           throw new Exception(responseAsString);
       }
    }
    
    public async Task CreateElectricityAdviceAsync(string desc)
    {
        ElectricityAdvice electricityAdvice = new()
        {
            text = desc
        };
        string electricityAdviceAsJson = JsonSerializer.Serialize(electricityAdvice);
        StringContent content = new(electricityAdviceAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync("http://localhost:8081/api/advice/electricity", content);
        string responseAsString = await response.Content.ReadAsStringAsync();
       
        if(!response.IsSuccessStatusCode)
        {
            throw new Exception(responseAsString);
        }
    }
}