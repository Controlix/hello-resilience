package be.mbict.resilience;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final GreetingClient greetingClient;

    public MyController(GreetingClient greetingClient) {
        this.greetingClient = greetingClient;
    }

    @GetMapping
    public String hello(@RequestParam(defaultValue = "World") String name) {
        return greetingClient.getGreeting() + name;
    }
}
