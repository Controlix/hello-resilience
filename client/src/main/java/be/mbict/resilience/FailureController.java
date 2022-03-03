package be.mbict.resilience;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fail")
public class FailureController {

    private final FailureClient failureClient;

    public FailureController(FailureClient failureClient) {
        this.failureClient = failureClient;
    }

    @GetMapping("/always")
    public String alwaysFail() {
        return failureClient.always();
    }

    @GetMapping("/twice")
    public String failTwiceBeforeSucceeding() {
        return failureClient.twice();
    }

}
