package a13jwt.controller;

import a13jwt.model.AuthRequest;
import a13jwt.model.AuthResponse;
import a13jwt.security.JwtUtil;
import a13jwt.service.MyUserDetailsService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.web.bind.annotation.*;


//swagger UI ..  http://localhost:8080/swagger-ui/index.html

@SecurityRequirement(name = "bearerAuth")
@RestController
public class SumController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtUtil jwtUtil;

    @SecurityRequirements
    @PostMapping("/authenticate")
    public AuthResponse createAuthToken(@RequestBody AuthRequest authRequest) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
        );
        String token = jwtUtil.generateToken(authRequest.getUsername());
        return new AuthResponse(token);
    }

    @GetMapping("/sum")
    public int getSum(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}
