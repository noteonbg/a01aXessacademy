package a03repeat.repository;

import a03repeat.model.Device;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class MockRepository {

    ArrayList<Device> devices = new ArrayList<>();

    public MockRepository()
    {
        System.out.println("object created");
    }

    public String addDevice(Device device) {

            for(Device x: devices)
            {
                    //int fans will cry , keep bucket near by
                if(x.getDeviceId() == device.getDeviceId())
                {
                        return "Device already exists";

                }

            }
            devices.add(device);
            return "device Added successfully";// kids program.

    }

    public Device getDevice(int deviceId) {

        Device d=new Device();
        for(Device x:devices)
        {
                if(x.getDeviceId() == deviceId)
                {
                    return x;

                }

        }
        return d;
    }
}
