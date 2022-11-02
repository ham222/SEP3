package via.sep3.tier2.rest;

import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import via.sep3.tier2.logic.DAOs.ElectricityUsageDaoImpl;
import via.sep3.tier2.logic.DAOs.WaterUsageDAOImpl;
import via.sep3.tier2.logic.Interfaces.ElectricityUsageDAO;
import via.sep3.tier2.logic.Interfaces.WaterUsageDAO;

import java.util.Arrays;

@RestController
@RequestMapping("/api")
public class RestApiController {


    @GetMapping(path = "/users")
    public String getAllUsers() {
        return new Gson().toJson("okay");
    }


    @GetMapping(path = "/WaterUsageAdvice", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWaterAdvice() {
        return getWaterAdvice();
    }

    @GetMapping(path = "/users/{id}/water", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllUserWaterUsage(@PathVariable int id){
        WaterUsageDAO waterUsageDAO = WaterUsageDAOImpl.getInstance();
        return new Gson().toJson(waterUsageDAO.getUserWaterUsages(id));
    }

    @GetMapping(path =  "/users/{id}/electricity", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllUserElectricityUsage(@PathVariable int id){
        ElectricityUsageDAO electricityUsageDAO = ElectricityUsageDaoImpl.getInstance();
        return new Gson().toJson(electricityUsageDAO.getUserElectricityUsages(id));
    }
}








