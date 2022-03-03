package be.mbict.resilience;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fail")
public class FailureController {

    private int failureCount = 0;

    @GetMapping("/always")
    public String alwaysFail() {
        throw new RuntimeException("Should always fail");
    }

    @GetMapping("twice")
    public String failTwiceBeforeSucceeding() {
        if (failureCount++ < 2) {
            throw new RuntimeException("Should still fail");
        }
        failureCount = 0;
        return "Should not fail anymore";
    }
}
