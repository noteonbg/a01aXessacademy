package a00basicpoc;

// MultiplicationController.java

import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*") //2nd step
@RestController  //1st step
@RequestMapping("/api/multiply")  // nice to have..
public class MultiplicationController {

    // registering for get event...
    @GetMapping("/fifth")
    public int getFifthMultiple(@RequestParam int number) {
        System.out.println("freak freak freak");
        return  47;
    }

    // registering for post event
    @PostMapping("/eighth")
    public int getEighthMultiple(@RequestBody NumberRequest request) {

        System.out.println("junk junk junk");
        return request.getNumber() * 8;
    }

    // DTO for the POST body
    public static class NumberRequest {
        private int number;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}

