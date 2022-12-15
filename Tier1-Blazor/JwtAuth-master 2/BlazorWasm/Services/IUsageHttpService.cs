using Shared.Models;

namespace BlazorWasm.Services;

public interface IUsageHttpService
{
    public Task LogWaterUsageAsync(WaterUsage waterUsage, int userId);
    Task LogElectricityUsageAsync(ElectricityUsage lectricityUsage, int userId);
    Task<ICollection<WaterUsage>> GetWaterUsagesByUserId(int userId);
    Task<ICollection<ElectricityUsage>> GetElectricityUsagesByUserId(int userId);

    Task UpdateWaterUsage(WaterUsage waterUsage);
    Task UpdateElectricityUsage(ElectricityUsage electricityUsage);
    Task<double> GetWaterAverage(int area);
    Task<double> GetElectricityAverage(int area);
    
    Task DeteteWaterUsage(int id);
    Task DeteteElectricityUsage(int id);
}