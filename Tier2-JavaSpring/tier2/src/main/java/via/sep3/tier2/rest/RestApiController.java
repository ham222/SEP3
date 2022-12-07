package via.sep3.tier2.rest;

import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import via.sep3.tier2.logic.interfaces.*;
import via.sep3.tier2.model.ElectricityUsage;
import via.sep3.tier2.model.ElectricityUsageAdvice;
import via.sep3.tier2.model.WaterUsage;
import via.sep3.tier2.model.WaterUsageAdvice;

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

    final
    WaterAdviceService waterAdviceService;

    final ElectricityAdviceService electricityAdviceService;

    public RestApiController(ElectricityUsageService electricityUsageService, UserService userService, WaterUsageService waterUsageService, WaterAdviceService waterAdviceService, ElectricityAdviceService electricityAdviceService) {
        this.electricityUsageService = electricityUsageService;
        this.userService = userService;
        this.waterUsageService = waterUsageService;
        this.waterAdviceService = waterAdviceService;
        this.electricityAdviceService = electricityAdviceService;
    }


    @GetMapping(path = "/users")
    public String getAllUsers() {
        return new Gson().toJson(userService.getUsers());
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
    public String createElectricityAdvice(@RequestBody String fromPath) {
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
    public String createWaterAdvice(@RequestBody String fromPath) {
        via.sep3.tier2.model.WaterUsageAdvice usage = new Gson().fromJson(fromPath, (Type) WaterUsageAdvice.class);
        try {
            waterAdviceService.CreateAdvice(usage);
        } catch (Exception e) {
            return e.getMessage();
        }
        return new Gson().toJson(usage);
    }
// maybe?
}








