using Microsoft.AspNetCore.Components.Web;
using Microsoft.AspNetCore.Components.WebAssembly.Hosting;
using BlazorWasm;
using BlazorWasm.Auth;
using BlazorWasm.Services;
using BlazorWasm.Services.Http;
using Microsoft.AspNetCore.Components.Authorization;
using Shared.Auth;

var builder = WebAssemblyHostBuilder.CreateDefault(args);
builder.RootComponents.Add<App>("#app");
builder.RootComponents.Add<HeadOutlet>("head::after");

builder.Services.AddScoped<AuthenticationStateProvider, CustomAuthProvider>();
builder.Services.AddScoped<IAuthService, JwtAuthService>();
builder.Services.AddScoped<IWeatherService, HttpWeatherService>();

AuthorizationPolicies.AddPolicies(builder.Services);


builder.Services.AddScoped(sp => new HttpClient());
// builder.Services.AddScoped(sp => new HttpClient() { BaseAddress = new Uri(builder.HostEnvironment.BaseAddress) });

builder.Services.AddAuthorizationCore();

await builder.Build().RunAsync();