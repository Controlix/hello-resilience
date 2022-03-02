package be.mbict.resilience;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, ";
    }

    @GetMapping("/ping")
    public String ping(@RequestParam String message) {
        return message;
    }
}