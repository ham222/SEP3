using System.Security.Claims;
using Shared.Dtos;
using Shared.Models;

namespace BlazorWasm.Services;

public interface IAuthService
{
    public Task LoginAsync(string username, string password);
    public Task LogoutAsync();
    public Task RegisterAsync(UserRegisterDto userRegisterDto);
    public Task<ClaimsPrincipal> GetAuthAsync();

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }
}