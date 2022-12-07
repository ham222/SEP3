package via.sep3.tier2.rest;

import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import via.generatedprotos.WaterUsageAdvice;
import via.sep3.tier2.logic.interfaces.*;
import via.sep3.tier2.model.ElectricityUsage;
import via.sep3.tier2.model.ElectricityUsageAdvice;
import via.sep3.tier2.model.User;
import via.sep3.tier2.model.WaterUsage;

import java.lang.reflect.Type;

@RestController
@RequestMapping("/api")
public class RestApiController {

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

    @GetMapping(path = "/WaterUsageAdvice", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWaterAdvice() {
        //TODO implement
        return new Gson().toJson("");
    }

    @GetMapping(path = "/users/{id}/water", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllUserWaterUsage(@PathVariable int id) {
        return new Gson().toJson(waterUsageService.getUserWaterUsages(id));
    }

    @GetMapping(path = "/users/{id}/electricity", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllUserElectricityUsage(@PathVariable int id) {
        return new Gson().toJson(electricityUsageService.getUserElectricityUsages(id));
    }

    @PostMapping(path = "/users/{id}/electricity", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String InsertElectricityUsage(@PathVariable String id, @RequestBody String fromPath) {
        ElectricityUsage usage = new Gson().fromJson(fromPath, ElectricityUsage.class);
        try {
            electricityUsageService.insertElectricityUsage(usage);
        } catch (Exception e) {
            return e.getMessage();
        }

        return new Gson().toJson(usage);
    }

    @PostMapping(path = "/users/{id}/water", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String InsertWaterUsage(@PathVariable String id, @RequestBody String fromPath) {
        WaterUsage usage = new Gson().fromJson(fromPath, WaterUsage.class);
        try {
            waterUsageService.insertWaterUsage(usage);
        } catch (Exception e) {
            return e.getMessage();
        }

        return new Gson().toJson(usage);
    }

    @PostMapping(path = "/advice/electricity", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String createElectricityAdvice(@PathVariable String id, @RequestBody String fromPath) {
        ElectricityUsageAdvice usage = new Gson().fromJson(fromPath, ElectricityUsageAdvice.class);
        try {
            electricityAdviceService.createAdvice(usage);
        } catch (Exception e) {
            return e.getMessage();
        }
        return new Gson().toJson(usage);
    }

    @GetMapping(path = "/advice/electricity/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getElectricityAdviceById(@PathVariable int id) {
        return new Gson().toJson(electricityAdviceService.getAdviceById(id));
    }

    @DeleteMapping(path = "/advice/electricity/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteElectricityAdviceById(@PathVariable int id) {
        try {
            electricityAdviceService.deleteAdviceById(id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return new Gson().toJson("");
    }

    @GetMapping(path = "/advice/water/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWaterAdviceById(@PathVariable int id) {
        return new Gson().toJson(waterAdviceService.getWaterAdviceById(id));
    }

    @DeleteMapping(path = "/advice/water/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteWaterAdviceById(@PathVariable int id) {
        try {
            waterAdviceService.DeleteAdviceById(id);
        }catch (Exception e){
            return e.getMessage();
        }
        return new Gson().toJson("");
    }

    @PostMapping(path = "/advice/water", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String createWaterAdvice(@PathVariable String id, @RequestBody String fromPath) {
        via.sep3.tier2.model.WaterUsageAdvice usage = new Gson().fromJson(fromPath, (Type) WaterUsageAdvice.class);
        try {
            waterAdviceService.CreateAdvice(usage);
        } catch (Exception e) {
            return e.getMessage();
        }
        return new Gson().toJson(usage);
    }


<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
//    USER MANAGEMENT

    @GetMapping(path = "/users")
    public String getAllUsers() {
        return new Gson().toJson(userService.getUsers());
    }

    @GetMapping(path = "/users/{id}")
    public String getUserById(@PathVariable int id) {
        return new Gson().toJson(userService.getUserById(id));
    }

    @PutMapping(path = "/users/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User userfromPath) {
<<<<<<< Updated upstream
        userfromPath.setId(id);
=======
>>>>>>> Stashed changes
        userfromPath.setPassword(passwordEncoder.encode(userfromPath.getPassword()));
        try {
            userService.updateUser(userfromPath);
        } catch (Exception e) {
            return e.getMessage();
        }
        return new Gson().toJson(userService.getUserById(userfromPath.getId()));
    }
<<<<<<< Updated upstream

    @DeleteMapping(path = "/users/{id}")
    public String deleteUser(@PathVariable int id) {
        try {
            userService.deleteUser(id);
        } catch (Exception e) {
            return "Not Found";
        }
        return "Deleted user with id: " + id;

    }
//    END USER MANAGEMENT

    @GetMapping(path = "/advice/electricity", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String getAllElectricityAdvice(){
        String toSend;
        try {
            toSend = new Gson().toJson(electricityAdviceService.getAllElectricityAdvice());
        } catch (Exception e){
            return e.getMessage();
        }
        return toSend;
    }

    @PatchMapping(path = "/advice/electricity/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String editElectricityAdvice(@PathVariable int id) {
        return new Gson().toJson(electricityAdviceService.editAdviceById(id));
    }

    @PatchMapping(path = "/users/{id}/electricity", produces = MediaType.APPLICATION_JSON_VALUE)
    public String editElectricityUsage(@PathVariable int id,@RequestBody String fromPath) {
        ElectricityUsage usage = new Gson().fromJson(fromPath,ElectricityUsage.class);
        return new Gson().toJson(electricityUsageService.editElectricityUsage(usage));
    }

=======
//    END USER MANAGEMENT
>>>>>>> Stashed changes
}

// maybe?









