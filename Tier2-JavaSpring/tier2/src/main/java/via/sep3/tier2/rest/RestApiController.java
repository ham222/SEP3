package via.sep3.tier2.rest;

import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import via.sep3.tier2.logic.GrpcComm.ElectricityUsageGrpcImpl;
import via.sep3.tier2.logic.GrpcComm.WaterUsageGrpcImpl;
import via.sep3.tier2.logic.Interfaces.ElectricityUsageGrpc;
import via.sep3.tier2.logic.Interfaces.WaterUsageGrpc;
import via.sep3.tier2.model.ElectricityUsage;

@RestController
@RequestMapping("/api")
public class RestApiController {


    @GetMapping(path = "/users")
    public String getAllUsers() {
        ElectricityUsage u1 = new ElectricityUsage(1,5.0,6,2022,1);
        Gson gson = new Gson();
        System.out.println(gson.toJson(u1));
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

    @PostMapping(path="/users/{id}/electricity"/*,consumes = {MediaType.APPLICATION_JSON_VALUE}*/)
    public String InsertElectricityUsage(@PathVariable String id,@RequestBody ElectricityUsage usage){

        ElectricityUsageGrpc electricityUsageGrpc = ElectricityUsageGrpcImpl.getInstance();
        try {
            electricityUsageGrpc.insertElectricityUsage(usage);
        } catch (Exception e){
            return e.getMessage();
        }
        return usage.toString();
    }
}








