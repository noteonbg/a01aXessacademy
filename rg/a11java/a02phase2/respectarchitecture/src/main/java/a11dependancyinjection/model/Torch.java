package a11dependancyinjection.model;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Torch {

    private Battery battery; // manually created
    @Autowired
    private Bulb bulb; // autowired by Spring

    public Torch() {
        this.battery = new Battery(); // manually instantiated
    }

    public void turnOn() {
        System.out.println("Torch is turning ON...");
        battery.supplyPower();
        bulb.glow();
    }

    public void turnOff() {
        System.out.println("Torch is turning OFF...");
        bulb.stopGlow();
    }
}
