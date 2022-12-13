using System.Security.Claims;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace WebApi.Controllers;

[ApiController]
[Route("[controller]")]
[Authorize]
public class TestController : ControllerBase
{
    [HttpGet("allowanon"), AllowAnonymous]
    public ActionResult GetAsAnon()
    {
        return Ok("This was accepted as anonymous");
    }

    // role
    [HttpGet("authorized")]
    public ActionResult GetAsAuthorized()
    {
        return Ok("This was accepted as authorized");
    }

    // policy MustBeVia
    [HttpGet("mustbevia"), Authorize("MustBeVia")]
    public ActionResult GetAsVia()
    {
        return Ok("This was accepted as via domain");
    }

    // manual checking
    [HttpGet("manualcheck")]
    public ActionResult GetWithManualCheck()
    {
        Claim? claim = User.Claims.FirstOrDefault(claim => claim.Type.Equals(ClaimTypes.Role));
        if (claim == null)
        {
            return StatusCode(403, "You have no role");
        }

        if (!claim.Value.Equals("Teacher"))
        {
            return StatusCode(403, "You are not a teacher");
        }

        return Ok("You are a teacher, you may proceed");
    }
}