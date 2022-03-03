package be.mbict.resilience;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/timeout")
public class TimeoutController {

    private int timeoutCount = 0;

    @GetMapping("/always")
    public String alwaysSleep(@RequestParam long timeout) throws InterruptedException {
        TimeUnit.SECONDS.sleep(timeout);
        return "I was asleep";
    }

    @GetMapping("twice")
    public String sleepTwiceBeforeSucceeding(@RequestParam long timeout) throws InterruptedException {
        if (timeoutCount++ < 2) {
            return alwaysSleep(timeout);
        }
        timeoutCount = 0;
        return "I am awake";
    }
}
