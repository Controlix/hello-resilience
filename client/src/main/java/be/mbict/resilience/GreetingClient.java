package be.mbict.resilience;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "greeting", url = "http://localhost:8091/greeting")
public interface GreetingClient {

    @GetMapping
    String getGreeting();
}
