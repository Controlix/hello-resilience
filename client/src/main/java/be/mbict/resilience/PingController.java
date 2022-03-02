package be.mbict.resilience;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

    private final PingClient pingClient;

    public PingController(PingClient pingClient) {
        this.pingClient = pingClient;
    }

    @GetMapping
    public String ping(@RequestParam(defaultValue = "ok") String message) {
        return pingClient.ping(message);
    }
}
