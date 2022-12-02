package via.sep3.tier2.rest;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import via.sep3.tier2.logic.interfaces.ElectricityUsageService;
import via.sep3.tier2.logic.interfaces.UserService;
import via.sep3.tier2.logic.interfaces.WaterAdviceService;
import via.sep3.tier2.logic.interfaces.WaterUsageService;
import via.sep3.tier2.model.ElectricityUsage;
import via.sep3.tier2.model.WaterUsage;

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

    public RestApiController(ElectricityUsageService electricityUsageService, UserService userService, WaterUsageService waterUsageService, WaterAdviceService waterAdviceService) {
        this.electricityUsageService = electricityUsageService;
        this.userService = userService;
        this.waterUsageService = waterUsageService;
        this.waterAdviceService = waterAdviceService;
    }


    @GetMapping(path = "/users")
    public String getAllUsers() {
        return new Gson().toJson(userService.getUsers());
    }


    @GetMapping(path = "/WaterUsageAdvice", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWaterAdvice() {
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
}








