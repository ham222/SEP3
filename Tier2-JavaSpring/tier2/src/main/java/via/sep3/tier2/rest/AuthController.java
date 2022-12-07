package via.sep3.tier2.rest;

<<<<<<< Updated upstream
import com.google.gson.Gson;
=======
>>>>>>> Stashed changes
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import via.sep3.tier2.logic.interfaces.UserService;
import via.sep3.tier2.model.dto.RegisterCredentials;
import via.sep3.tier2.security.*;
import via.sep3.tier2.model.User;
import via.sep3.tier2.model.dto.LoginCredentials;

@RestController // Marks the class a rest controller
@RequestMapping("/auth") // Requests made to /api/auth/anything will be handles by this class
public class AuthController
{

    // Injecting Dependencies

     final JWTUtil jwtUtil;

     final AuthenticationManager authManager;

     final PasswordEncoder passwordEncoder;

     final UserService userService;

    public AuthController(JWTUtil jwtUtil, AuthenticationManager authManager, PasswordEncoder passwordEncoder, UserService userService)
    {
        this.jwtUtil = jwtUtil;
        this.authManager = authManager;
        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
    }

    // Defining the function to handle the POST route for registering a user
    @PostMapping("/register")
<<<<<<< Updated upstream
    public String registerHandler(@RequestBody RegisterCredentials registerCredentials){
=======
    public void registerHandler(@RequestBody RegisterCredentials registerCredentials){
>>>>>>> Stashed changes
        // Encoding Password using Bcrypt
        String encodedPass = passwordEncoder.encode(registerCredentials.getPassword());

        // Setting the encoded password
        registerCredentials.setPassword(encodedPass);

        // Persisting the User Entity to H2 Database
        User user = userService.createUser(registerCredentials);

        User repoUser = userService.findUserByUsername(user.getUsername());
        return new Gson().toJson(repoUser);

<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    }

    // Defining the function to handle the POST route for logging in a user
    @PostMapping("/login")
    public String loginHandler(@RequestBody LoginCredentials body){
        try {
            // Creating the Authentication Token which will contain the credentials for authenticating
            // This token is used as input to the authentication process
            UsernamePasswordAuthenticationToken authInputToken =
                    new UsernamePasswordAuthenticationToken(body.getUsername(), body.getPassword());

            // Authenticating the Login Credentials
            authManager.authenticate(authInputToken);

            User user = userService.findUserByUsername(body.getUsername());

            // If this point is reached it means Authentication was successful
            // Generate the JWT
            String token = jwtUtil.generateToken(user);

            // Respond with the JWT
            System.out.println("Sent token: " + token);
            return token;
        }catch (AuthenticationException authExc){
            // Auhentication Failed
            //throw new RuntimeException("Invalid Login Credentials");
            return "Invalid Login Credentials";

        }
    }


}
