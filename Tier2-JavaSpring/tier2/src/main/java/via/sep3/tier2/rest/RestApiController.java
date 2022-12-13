package via.sep3.tier2.rest;

import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import via.sep3.tier2.logic.interfaces.*;
import via.sep3.tier2.model.*;
import via.sep3.tier2.model.dto.Username;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class RestApiController
{

    final
    ElectricityUsageService electricityUsageService;

    final
    UserService userService;

    final
    WaterUsageService waterUsageService;

    final PasswordEncoder passwordEncoder;

    final
    WaterAdviceService waterAdviceService;

    final ElectricityAdviceService electricityAdviceService;

    public RestApiController(ElectricityUsageService electricityUsageService, UserService userService, WaterUsageService waterUsageService, PasswordEncoder passwordEncoder, WaterAdviceService waterAdviceService, ElectricityAdviceService electricityAdviceService)
    {
        this.electricityUsageService = electricityUsageService;
        this.userService = userService;
        this.waterUsageService = waterUsageService;
        this.passwordEncoder = passwordEncoder;
        this.waterAdviceService = waterAdviceService;
        this.electricityAdviceService = electricityAdviceService;
    }


    // Water Usage Management

    @GetMapping(path = "/WaterUsageAdvice", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWaterAdvice()
    {
        //TODO implement
        return new Gson().toJson("");
    }

    @GetMapping(path = "/users/{id}/water", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllUserWaterUsage(@PathVariable int id)
    {
        return new Gson().toJson(waterUsageService.getUserWaterUsages(id));
    }

    // Electricity Usage Management
    @GetMapping(path = "/users/{id}/electricity", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllUserElectricityUsage(@PathVariable int id)
    {
        return new Gson().toJson(electricityUsageService.getUserElectricityUsages(id));
    }

    @PostMapping(path = "/users/{id}/electricity", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String InsertElectricityUsage(@PathVariable String id, @RequestBody ElectricityUsage fromPath)
    {
        fromPath.setId(Integer.parseInt(id));
        ElectricityUsage result = null;
        try
        {
            result = electricityUsageService.insertElectricityUsage(fromPath);
        } catch (Exception e)
        {
            return e.getMessage();
        }
        if (result == null)
            return "Error";
        return new Gson().toJson(result);
    }

    // should be PUT but it is not supported
    @PostMapping(path = "/users/{id}/electricity/edit", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String updateElectricityUsage(@PathVariable String id, @RequestBody ElectricityUsage fromPath)
    {

        fromPath.setUserId(Integer.parseInt(id));
        ElectricityUsage result = null;
        try
        {
            result = electricityUsageService.editElectricityUsage(fromPath);
        } catch (Exception e)
        {
            return e.getMessage();
        }
        if (result == null) return "No such usage found";


        return new Gson().toJson(result);
    }

    @DeleteMapping(path = "/waterusage/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteWaterUsage(@PathVariable int id)
    {
        try
        {
            waterUsageService.deleteWaterUsage(id);
        } catch (Exception e)
        {
            return e.getMessage();
        }
        return "Deleted";
    }


    @DeleteMapping(path = "/electricityusage/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteElectricityUsage(@PathVariable int id)
    {
        try
        {
            electricityUsageService.deleteElectricityUsage(id);
        } catch (Exception e)
        {
            return e.getMessage();
        }
        return "Deleted";
    }

    @PostMapping(path = "/users/{id}/water", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String InsertWaterUsage(@PathVariable String id, @RequestBody WaterUsage fromPath)
    {
        fromPath.setId(Integer.parseInt(id));

        WaterUsage result = null;
        try
        {
            result = waterUsageService.insertWaterUsage(fromPath);
        } catch (Exception e)
        {
            return e.getMessage();
        }

        return new Gson().toJson(result);
    }

    @PostMapping(path = "/users/{id}/water/edit", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String updateWaterUsage(@PathVariable String id, @RequestBody WaterUsage fromPath)
    {

        fromPath.setUserId(Integer.parseInt(id));
        WaterUsage result = null;
        try
        {
            result = waterUsageService.editWaterUsage(fromPath);
        } catch (Exception e)
        {
            return e.getMessage();
        }
        if (result == null) return "No such usage found";


        return new Gson().toJson(result);
    }

    @PostMapping(path = "/advice/electricity", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String createElectricityAdvice(@RequestBody ElectricityUsageAdvice fromPath)
    {
        ElectricityUsageAdvice result = null;
        try
        {
            result = electricityAdviceService.createAdvice(fromPath);
        } catch (Exception e)
        {
            return e.getMessage();
        }
        return new Gson().toJson(result);
    }

    @GetMapping(path = "/advice/electricity/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getElectricityAdviceById(@PathVariable int id)
    {
        return new Gson().toJson(electricityAdviceService.getAdviceById(id));
    }

    @DeleteMapping(path = "/advice/electricity/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteElectricityAdviceById(@PathVariable int id)
    {
        try
        {
            electricityAdviceService.deleteAdviceById(id);
        } catch (Exception e)
        {
            return e.getMessage();
        }
        return "Deleted";
    }

    @GetMapping(path = "/advice/water/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWaterAdviceById(@PathVariable int id)
    {
        return new Gson().toJson(waterAdviceService.getWaterAdviceById(id));
    }

    @DeleteMapping(path = "/advice/water/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteWaterAdviceById(@PathVariable int id)
    {
        try
        {
            waterAdviceService.DeleteAdviceById(id);
        } catch (Exception e)
        {
            return e.getMessage();
        }
        return "Deleted";
    }

    @PostMapping(path = "/advice/water", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String createWaterAdvice(@RequestBody via.sep3.tier2.model.WaterUsageAdvice fromPath)
    {
        WaterUsageAdvice result = null;
        try
        {
            result = waterAdviceService.createAdvice(fromPath);
        } catch (Exception e)
        {
            return e.getMessage();
        }
        if (result == null) return "Error";
        return new Gson().toJson(result);
    }


//    USER MANAGEMENT

    @GetMapping(path = "/users")
    public String getAllUsers()
    {
        return new Gson().toJson(userService.getUsers());
    }

    @GetMapping(path = "/users/{id}")
    public String getUserById(@PathVariable int id)
    {
        return new Gson().toJson(userService.getUserById(id));
    }

    @PutMapping(path = "/users/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User userfromPath)
    {
        userfromPath.setId(id);
        System.out.println(userfromPath.getPassword());
        if (userfromPath.getPassword() == null || userfromPath.getPassword().equals(""))
        {
            userfromPath.setPassword(userService.getUserById(userfromPath.getId()).getPassword());
        }else {

        }


        System.out.println("Update User");

        userfromPath.setPassword(passwordEncoder.encode(userfromPath.getPassword()));
        User result = null;
        try
        {
            result = userService.updateUser(userfromPath);
        } catch (Exception e)
        {
            return e.getMessage();
        }
        return new Gson().toJson(result);
    }

    @DeleteMapping(path = "/users/{id}")
    public String deleteUser(@PathVariable int id)
    {
        try
        {
            userService.deleteUser(id);
        } catch (Exception e)
        {
            return "Not Found";
        }
        return "Deleted user with id: " + id;

    }
    //    END USER MANAGEMENT


    @GetMapping(path = "/advice/electricity", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllElectricityAdvice()
    {
        ArrayList<ElectricityUsageAdvice> toSend;
        try
        {
            toSend = electricityAdviceService.getAllElectricityAdvice();
        } catch (Exception e)
        {
            return e.getMessage();
        }
        return new Gson().toJson(toSend);
    }

    @GetMapping(path = "/advice/water", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllWaterAdvice()
    {
        ArrayList<WaterUsageAdvice> toSend;
        try
        {
            toSend = waterAdviceService.getAllWaterAdvice();
        } catch (Exception e)
        {
            return e.getMessage();
        }
        return new Gson().toJson(toSend);
    }

    @PatchMapping(path = "/advice/electricity/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String editElectricityAdvice(@PathVariable int id, @RequestBody ElectricityUsageAdvice fromPath)
    {
        fromPath.setId(id);
        return new Gson().toJson(electricityAdviceService.editAdviceById(fromPath));
    }

    @PatchMapping(path = "/advice/water/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String editWaterAdvice(@PathVariable int id, @RequestBody WaterUsageAdvice fromPath)
    {
        fromPath.setId(id);
        return new Gson().toJson(waterAdviceService.editAdviceById(fromPath));
    }

    @PostMapping(path = "/users/{id}/electricityadvice/{adviceId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String assignElectricityAdvice(@PathVariable int id, @PathVariable int adviceId)
    {
        try
        {
            electricityAdviceService.assignElectricityAdvice(id, adviceId);
        } catch (Exception e)
        {
            return e.getMessage();
        }
        return "Assigned";
    }

    @PostMapping(path = "/users/{id}/wateradvice/{adviceId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String assignWaterAdvice(@PathVariable int id, @PathVariable int adviceId)
    {
        try
        {
            waterAdviceService.assignWaterAdvice(id, adviceId);
        } catch (Exception e)
        {
            return e.getMessage();
        }
        return "Assigned";
    }

    @PostMapping(path = "/users/username", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUserByUsername(@RequestBody Username username)
    {
        return new Gson().toJson(userService.getUserByUsername(username.getUsername()));
    }

    @PostMapping(path = "/advice/electricity/{adviceId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateElectricityAdvice(@PathVariable int adviceId, @RequestBody ElectricityUsageAdvice fromPath)
    {
        fromPath.setId(adviceId);
        return new Gson().toJson(electricityAdviceService.updateAdvice(fromPath));
    }

    @PostMapping(path = "/advice/water/{adviceId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateWaterAdvice(@PathVariable int adviceId, @RequestBody WaterUsageAdvice fromPath)
    {
        fromPath.setId(adviceId);
        return new Gson().toJson(waterAdviceService.updateAdvice(fromPath));
    }

    @GetMapping(path = "/users/{id}/electricityadvice", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getElectricityAdviceByUserId(@PathVariable int id)
    {
        return new Gson().toJson(electricityAdviceService.getElectricityAdviceByUserId(id));
    }

    @GetMapping(path = "/users/{id}/wateradvice", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWaterAdviceByUserId(@PathVariable int id)
    {
        return new Gson().toJson(waterAdviceService.getWaterAdviceByUserId(id));
    }

    @GetMapping(path = "/area/{id}/electricity", produces = MediaType.APPLICATION_JSON_VALUE)
    public double getElectricityUsageByAreaId(@PathVariable int id)
    {
        return electricityUsageService.getAverageElectricityUsageByArea(id);
    }

    @GetMapping(path = "/area/{id}/water", produces = MediaType.APPLICATION_JSON_VALUE)
    public double getWaterUsageByAreaId(@PathVariable int id)
    {
        return waterUsageService.getAverageWaterUsageByArea(id);
    }

}

// maybe?









