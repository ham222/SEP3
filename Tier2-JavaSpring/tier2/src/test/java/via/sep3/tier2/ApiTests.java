package via.sep3.tier2;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import via.sep3.tier2.logic.interfaces.ElectricityUsageService;
import via.sep3.tier2.logic.interfaces.UserService;
import via.sep3.tier2.logic.interfaces.WaterAdviceService;
import via.sep3.tier2.logic.interfaces.WaterUsageService;
import via.sep3.tier2.model.ElectricityUsage;
import via.sep3.tier2.model.User;
import via.sep3.tier2.model.WaterUsage;
import via.sep3.tier2.rest.RestApiController;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * This is a test class created to test the API functionality.
 * It tests the API endpoints by using mock services injected by the Spring Framework.
 * The class allows to programmatically test the endpoints without starting
 * the gRPC service, thus making each test isolated from the architecture.
 * @author Jakub Nowak (315252)
 */
@WebMvcTest(RestApiController.class)
public class ApiTests {

    //Setup

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    MockMvc mvc;

    @MockBean
    UserService userService;

    @MockBean
    ElectricityUsageService electricityUsageService;

    @MockBean
    WaterUsageService waterUsageService;

    @MockBean
    WaterAdviceService waterAdviceService;

    //User tests

    @Test
    public void addOneUser_andGetThemBack() throws Exception {
        User u1 = new User(1, "Jakub", "pwd", 1);
        ArrayList<User> users = new ArrayList<>(List.of(u1));
        Mockito.when(userService.getUsers()).thenReturn(users);
        mvc.perform(MockMvcRequestBuilders
                        .get("/api/users")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].username", is("Jakub")));
    }

    @Test
    public void addTwoUsers_andGetThemBack() throws Exception {
        User u1 = new User(1, "Jakub", "pwd", 1);
        User u2 = new User(2, "Iurie", "pwd", 1);
        ArrayList<User> users = new ArrayList<>(List.of(u1,u2));
        Mockito.when(userService.getUsers()).thenReturn(users);
        mvc.perform(MockMvcRequestBuilders
                        .get("/api/users")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].username", is("Jakub")))
                .andExpect(jsonPath("$[1].username",is("Iurie")));
    }

    @Test
    public void addMultipleUsers_andGetThemBack() throws Exception {
        User u1 = new User(1, "Jakub", "pwd", 1);
        User u2 = new User(2, "Iurie", "pwd", 1);
        User u3 = new User(2, "Dragos", "pwd", 1);
        User u4 = new User(2, "Filip", "pwd", 1);
        User u5 = new User(2, "Daniel", "pwd", 1);
        User u6 = new User(2, "Joseph", "pwd", 1);
        ArrayList<User> users = new ArrayList<>(List.of(u1,u2,u3,u4,u5,u6));
        Mockito.when(userService.getUsers()).thenReturn(users);
        mvc.perform(MockMvcRequestBuilders
                        .get("/api/users")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(6)))
                .andExpect(jsonPath("$[0].username", is("Jakub")))
                .andExpect(jsonPath("$[1].username",is("Iurie")))
                .andExpect(jsonPath("$[2].username",is("Dragos")))
                .andExpect(jsonPath("$[3].username",is("Filip")))
                .andExpect(jsonPath("$[4].username",is("Daniel")))
                .andExpect(jsonPath("$[5].username",is("Joseph")))
        ;
    }

    //Water usage tests

    @Test
    public void addOneWaterUsage_andGetItBack() throws Exception {
        WaterUsage waterUsage = new WaterUsage(1,5,2,2022,1);
        ArrayList<WaterUsage> waterUsages = new ArrayList<>(List.of(waterUsage));
        Mockito.when(waterUsageService.getUserWaterUsages(1)).thenReturn(waterUsages);
        mvc.perform(MockMvcRequestBuilders
                .get("/api/users/1/water")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(1)))
                .andExpect(jsonPath("$[0].amount",is(5.0)));
    }

    @Test
    public void addOneWaterUsage_WithDifferentId_andGetItBack() throws Exception {
        WaterUsage waterUsage = new WaterUsage(1,5,2,2022,2);
        ArrayList<WaterUsage> waterUsages = new ArrayList<>(List.of(waterUsage));
        Mockito.when(waterUsageService.getUserWaterUsages(2)).thenReturn(waterUsages);
        mvc.perform(MockMvcRequestBuilders
                        .get("/api/users/2/water")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(1)))
                .andExpect(jsonPath("$[0].amount",is(5.0)));
    }

    //Electricity usage tests

    @Test
    public void addOneElectricityUsage_andGetItBack() throws Exception {
        ElectricityUsage electricityUsage = new ElectricityUsage(1,5,2,2022,1);
        ArrayList<ElectricityUsage> electricityUsages = new ArrayList<>(List.of(electricityUsage));
        Mockito.when(electricityUsageService.getUserElectricityUsages(1)).thenReturn(electricityUsages);
        mvc.perform(MockMvcRequestBuilders
                        .get("/api/users/1/electricity")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(1)))
                .andExpect(jsonPath("$[0].amount",is(5.0)));
    }

    @Test
    public void addOneElectricityUsage_WithDifferentId_andGetItBack() throws Exception {
        ElectricityUsage electricityUsage = new ElectricityUsage(1,5,2,2022,2);
        ArrayList<ElectricityUsage> electricityUsages = new ArrayList<>(List.of(electricityUsage));
        Mockito.when(electricityUsageService.getUserElectricityUsages(2)).thenReturn(electricityUsages);
        mvc.perform(MockMvcRequestBuilders
                        .get("/api/users/2/electricity")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(1)))
                .andExpect(jsonPath("$[0].amount",is(5.0)));
    }


    //Water usage advice tests



    //Electricity usage advice tests


}
