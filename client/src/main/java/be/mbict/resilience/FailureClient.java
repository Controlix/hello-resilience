package be.mbict.resilience;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "fail", url = "${client.instances.fail.url}")
public interface FailureClient {

    @GetMapping("/always")
    String always();

    @GetMapping("/twice")
    String twice();
}
