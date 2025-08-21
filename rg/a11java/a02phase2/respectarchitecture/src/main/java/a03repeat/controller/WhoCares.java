package a03repeat.controller;

import a03repeat.model.Device;
import a03repeat.repository.MockRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/device")
public class WhoCares {


    @Autowired
    private MockRepository devicerepository;


    //hey register for the event..
    @GetMapping("/getdevice")
    //public Device getDevice(@RequestParam  int deviceId)
    public ResponseEntity<Device> getDevice(@RequestParam  int deviceId)
    {
        System.out.println("devcie id " + deviceId);
        Device device = devicerepository.getDevice(deviceId);
        ResponseEntity<Device> responseEntity =
                new ResponseEntity<Device>(HttpStatus.NOT_FOUND);
        if(device.getDeviceId()  != 0)
        {
            responseEntity = new ResponseEntity<Device>(device,HttpStatus.OK);

        }

        return responseEntity;

    }

    @PostMapping("/deviceaddition")
    public ResponseEntity<String>    addDevice(@RequestBody Device device)

    //public String addDevice(@RequestBody Device device)

    {
        //hardest thing in the world starts..
        String status = devicerepository.addDevice(device);//function design is bad
        ResponseEntity<String>  responseEntity=new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        if(status.equalsIgnoreCase("device Added successfully"))
            responseEntity=new ResponseEntity<String>(status,HttpStatus.CREATED);


        return responseEntity;

    }


}
