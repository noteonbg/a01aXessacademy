package a03repeat.controller;

import a03repeat.model.Device;
import a03repeat.repository.MockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/device")
public class WhoCares {


    @Autowired
    private MockRepository devicerepository;


    //hey register for the event..
    @GetMapping("/getdevice")
    public Device getDevice(@RequestParam  int deviceId)
    {
        System.out.println("devcie id " + deviceId);
        Device device = devicerepository.getDevice(deviceId);
        return device;

    }

    @PostMapping("/deviceaddition")
    public String addDevice(@RequestBody Device device)

    {
        //hardest thing in the world starts..
        String status = devicerepository.addDevice(device);
        System.out.println(device);
        return status;

    }


}
