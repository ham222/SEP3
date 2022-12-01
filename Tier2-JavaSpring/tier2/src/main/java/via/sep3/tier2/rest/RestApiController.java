package via.sep3.tier2.rest;

import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import via.sep3.tier2.logic.interfaces.ElectricityUsageService;
import via.sep3.tier2.logic.interfaces.UserService;
import via.sep3.tier2.logic.interfaces.WaterUsageService;

@RestController
@RequestMapping("/api")
public class RestApiController {

    final
    ElectricityUsageService electricityUsageService;

    final
    UserService userService;

    final
    WaterUsageService waterUsageService;

    public RestApiController(ElectricityUsageService electricityUsageService, UserService userService, WaterUsageService waterUsageService) {
        this.electricityUsageService = electricityUsageService;
        this.userService = userService;
        this.waterUsageService = waterUsageService;
    }

    @GetMapping(path = "/users")
    public String getAllUsers() {
        return new Gson().toJson(userService.getUsers());
    }


    @GetMapping(path = "/WaterUsageAdvice", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWaterAdvice() {
        //TODO
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
}








