package be.mbict.resilience;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ping", url = "${client.instances.ping.url}")
public interface PingClient {

    @GetMapping
    String ping(@RequestParam String message);
}
