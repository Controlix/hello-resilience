package be.mbict.resilience;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "greeting", url = "${client.instances.greeting.url}", fallback = FallbackGreetingClient.class)
public interface GreetingClient {

    @GetMapping
    String getGreeting();
}
