using Shared.Models;

namespace BlazorWasm.Services;

public interface IAdviceHttpService
{
    Task CreateWaterUsageAdvice(WaterUsageAdvice waterUsageAdvice);
    Task CreateElectricityUsageAdvice(ElectricityUsageAdvice electricityUsageAdvice);
    
    Task<WaterUsageAdvice> GetWaterUsageAdviceById(int id);
    Task<ElectricityUsageAdvice> GetElectricityUsageAdviceById(int id);
    
    Task UpdateWaterUsageAdvice(WaterUsageAdvice waterUsageAdvice);
    Task UpdateElectricityUsageAdvice(ElectricityUsageAdvice electricityUsageAdvice);
    
    Task DeleteWaterUsageAdvice(int id);
    Task DeleteElectricityUsageAdvice(int id);
    
    Task<ICollection<WaterUsageAdvice>> GetWaterUsageAdvicesByUserId(int userId);
    Task<ICollection<ElectricityUsageAdvice>> GetElectricityUsageAdvicesByUserId(int userId);
    
    Task<ICollection<WaterUsageAdvice>> GetAllWaterUsageAdvices();
    
    Task<ICollection<ElectricityUsageAdvice>> GetAllElectricityUsageAdvices();

    Task AddWaterAdviceToUser(int userId, int id);
    
    Task AddElectricityAdviceToUser(int userId, int id);
    
    
}