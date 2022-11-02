package via.sep3.tier2.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import via.sep3.tier2.grpc.GrpcClient;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "/users",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllUsers(){
        return "";
    }
}
