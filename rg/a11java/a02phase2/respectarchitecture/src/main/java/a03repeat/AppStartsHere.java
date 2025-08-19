package a03repeat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppStartsHere {

    public static void main(String[] args) {
        SpringApplication.run(AppStartsHere.class,args);
        // AppStartHere class is using the annotation
        //called SpringBootApplication
    }
}
