package via.sep3.tier2.rest;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import via.sep3.tier2.logic.GrpcComm.ElectricityUsageServiceImpl;
import via.sep3.tier2.logic.GrpcComm.WaterUsageServiceImpl;
import via.sep3.tier2.logic.Interfaces.ElectricityUsageService;
import via.sep3.tier2.logic.Interfaces.UserService;
import via.sep3.tier2.logic.Interfaces.WaterUsageService;
import via.sep3.tier2.model.ElectricityUsage;

@RestController
@RequestMapping("/api")
public class RestApiController {

    final
    ElectricityUsageService electricityUsageService;

    final
    WaterUsageService waterUsageService;

    final
    UserService userService;

    public RestApiController(ElectricityUsageService electricityUsageService, WaterUsageService waterUsageService, UserService userService) {
        this.electricityUsageService = electricityUsageService;
        this.waterUsageService = waterUsageService;
        this.userService = userService;
    }

    @GetMapping(path = "/users")
    public String getAllUsers() {
        return new Gson().toJson(userService.getUsers());
    }


    @GetMapping(path = "/WaterUsageAdvice", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWaterAdvice() {
        return getWaterAdvice();
    }

    @GetMapping(path = "/users/{id}/water", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllUserWaterUsage(@PathVariable int id){
        return new Gson().toJson(waterUsageService.getUserWaterUsages(id));
    }

    @GetMapping(path =  "/users/{id}/electricity", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllUserElectricityUsage(@PathVariable int id){
        return new Gson().toJson(electricityUsageService.getUserElectricityUsages(id));
    }

    @PostMapping(path = "/users/{id}/electricity",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String InsertElectricityUsage(@PathVariable String id, @RequestBody String fromPath) {
        ElectricityUsage usage = new Gson().fromJson(fromPath, ElectricityUsage.class);
        try {
            electricityUsageService.insertElectricityUsage(usage);
        } catch (Exception e) {
            return e.getMessage();
        }

        return new Gson().toJson(usage);
    }
}








