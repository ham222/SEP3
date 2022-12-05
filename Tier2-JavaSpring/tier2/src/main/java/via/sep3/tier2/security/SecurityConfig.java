package via.sep3.tier2.security;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import via.sep3.tier2.logic.interfaces.UserService;

import javax.servlet.http.HttpServletResponse;

@Configuration// Marks this as a configuration file
@EnableAutoConfiguration
@ComponentScan
@EnableWebSecurity // Enables security for this application
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // Injecting Dependencies

     JWTFilter filter;
     MyUserDetailsService uds;
    JWTUtil jwtUtil;
    UserService userService;

    public SecurityConfig(JWTFilter filter, MyUserDetailsService uds, JWTUtil jwtUtil, UserService userService)
    {
        this.filter = filter;
        this.uds = uds;
        this.jwtUtil = jwtUtil;
        this.userService = userService;
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception { // Method to configure your app security
        http.csrf().disable() // Disabling csrf
                .httpBasic().disable() // Disabling http basic
                .cors() // Enabling cors
                .and()
                .authorizeHttpRequests() // Authorizing incoming requests
                .antMatchers("/api/auth/**").permitAll() // Allows auth requests to be made without authentication of any sort
                .antMatchers("/api/user/**").hasRole("USER") // Allows only users with the "USER" role to make requests to the user routes
                .and()
                .userDetailsService(uds) // Setting the user details service to the custom implementation
                .exceptionHandling()
                    .authenticationEntryPoint(
                            // Rejecting request as unauthorized when entry point is reached
                            // If this point is reached it means that the current request requires authentication
                            // and no JWT token was found attached to the Authorization header of the current request.
                            (request, response, authException) ->
                                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized")
                    )
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS); // Setting Session to be stateless

        // Adding the JWT filter
        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
    }

    // Creating a bean for the password encoder
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Exposing the bean of the authentication manager which will be used to run the authentication process
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
