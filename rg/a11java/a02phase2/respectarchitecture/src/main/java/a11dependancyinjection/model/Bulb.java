package a11dependancyinjection.model;



import org.springframework.stereotype.Component;

@Component
public class Bulb {

    public void glow() {
        System.out.println("Bulb is glowing.");
    }

    public void stopGlow() {
        System.out.println("Bulb has stopped glowing.");
    }
}

