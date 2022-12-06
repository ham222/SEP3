using Domain.Models;

namespace HttpClients.ClientInterface;

public interface IWaterService
{
    Task<ICollection<WaterUsage>> GetAsync(int? userId);
}