package via.sep3.tier2.rest;

import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import via.sep3.tier2.logic.GrpcComm.ElectricityUsageGrpcImpl;
import via.sep3.tier2.logic.GrpcComm.WaterUsageGrpcImpl;
import via.sep3.tier2.logic.Interfaces.ElectricityUsageGrpc;
import via.sep3.tier2.logic.Interfaces.WaterUsageGrpc;

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
        WaterUsageGrpc waterUsageGrpc = WaterUsageGrpcImpl.getInstance();
        return new Gson().toJson(waterUsageGrpc.getUserWaterUsages(id));
    }

    @GetMapping(path =  "/users/{id}/electricity", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllUserElectricityUsage(@PathVariable int id){
        ElectricityUsageGrpc electricityUsageGrpc = ElectricityUsageGrpcImpl.getInstance();
        return new Gson().toJson(electricityUsageGrpc.getUserElectricityUsages(id));
    }
}








