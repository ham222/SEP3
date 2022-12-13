using System.Security.Claims;
using Microsoft.Extensions.DependencyInjection;

namespace Shared.Auth;

public static class AuthorizationPolicies
{
    public static void AddPolicies(IServiceCollection services)
    {
        services.AddAuthorizationCore(options =>
        {
            options.AddPolicy("MustBeUser", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "1"));
    
            options.AddPolicy("MustBeManager", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "2"));
    
            options.AddPolicy("MustBeAdmin", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "3"));
            options.AddPolicy("MustBeAdminOrManager", a =>
                a.RequireAuthenticatedUser().RequireAssertion(context =>
                    context.User.HasClaim("Role", "2") || context.User.HasClaim("Role", "3")));
        });
    }
}