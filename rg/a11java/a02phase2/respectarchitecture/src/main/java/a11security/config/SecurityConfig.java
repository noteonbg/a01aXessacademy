package a11security.config;


/*

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/add").authenticated()
                        .requestMatchers("/api/multiply").permitAll()
                )
                .httpBasic(Customizer.withDefaults())  // Enable Basic Auth
                .csrf(AbstractHttpConfigurer::disable); // For simplicity in API testing

        return http.build();
    }
}
*/

