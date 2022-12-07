using System.Text;
using System.Text.Json;
using Shared.Dtos;

namespace BlazorWasm.Services.Http;

public class ElecInsertService : IElecInsert
{
    private readonly HttpClient client = new ();
    // this private variable for simple caching
    //public static string? Jwt { get; private set; } = "";


    public async Task InsertElecAsync(double usage, int year, int month, int userid)
    {
        InsertInfoDto insertWaterDto = new InsertInfoDto
        {
            usage = usage,
            year = year,
            month = month,
            userId = userid
        };
        
        string waterAsJson = JsonSerializer.Serialize(insertWaterDto);
        Console.WriteLine(waterAsJson);
        StringContent content = new(waterAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync("http://localhost:8081/api/users/{userId}/electricity", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }
}