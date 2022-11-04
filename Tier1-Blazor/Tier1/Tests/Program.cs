// See https://aka.ms/new-console-template for more information


using Domain.Models;
using HttpClients.ClientInterface;
using HttpClients.Implementations;

Console.WriteLine("Hello, World!");

IWaterService service = new WaterHttpClient(new HttpClient());

ICollection<WaterUsage> waterUsages = await service.GetAsync(1);

Console.WriteLine(waterUsages);

Console.WriteLine("Finish");
