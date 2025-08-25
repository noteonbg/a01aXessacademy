package respectarchitecture.config;

import org.springframework.context.annotation.Configuration;


//http://localhost:8080/swagger-ui/index.html

@Configuration
public class OpenAPIConfiguration {
/*
    @Bean
    public OpenAPI defineOpenApi() {
        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("Development");

        Contact myContact = new Contact();
        myContact.setName("Code");
        myContact.setEmail("reviewer@developer.com");

        Info information = new Info()
                .title("drowned in opinions API")
                .version("1.0")
                .description("This API exposes endpoints to manage Patients.")
                .contact(myContact);
        return new OpenAPI().info(information).servers(List.of(server));
    }
    */

}
