using HttpClients.ClientInterface;
using HttpClients.Implementations;
using Microsoft.AspNetCore.Components.Web;
using Microsoft.AspNetCore.Components.WebAssembly.Hosting;
using Tier1;

var builder = WebAssemblyHostBuilder.CreateDefault(args);
builder.RootComponents.Add<App>("#app");
builder.RootComponents.Add<HeadOutlet>("head::after");

builder.Services.AddScoped(sp => new HttpClient { BaseAddress = new Uri("http://10.154.210.86:8080") });;
builder.Services.AddScoped<IWaterService, WaterHttpClient>();




await builder.Build().RunAsync();