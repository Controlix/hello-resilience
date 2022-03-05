package be.mbict.resilience;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "fail", url = "${client.instances.fail.url}")
public interface FailureClient {

    @CircuitBreaker(name = "always", fallbackMethod = "fallback")
    @GetMapping("/always")
    String always();

    @Retry(name = "twiice", fallbackMethod = "fallback")
    @GetMapping("/twice")
    String twice();

    default String fallback(Exception e) {
        return "Fail fallback";
    }
}
