package a00basicpoc;

// MultiplicationController.java

import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/multiply")
public class MultiplicationController {

    // GET method: returns 5th multiple
    @GetMapping("/fifth")
    public int getFifthMultiple(@RequestParam int number) {
        return number * 5;
    }

    // POST method: returns 8th multiple
    @PostMapping("/eighth")
    public int getEighthMultiple(@RequestBody NumberRequest request) {
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

