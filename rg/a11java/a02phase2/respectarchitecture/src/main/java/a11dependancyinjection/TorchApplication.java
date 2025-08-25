package a11dependancyinjection;



import a11dependancyinjection.model.Torch;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TorchApplication {

    public static void main(String[] args) {
        SpringApplication.run(TorchApplication.class, args);
    }

    @Bean
    CommandLineRunner run(Torch torch) {
        return args -> {
            torch.turnOn();
            torch.turnOff();
        };
    }
}
