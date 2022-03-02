package be.mbict.resilience;

import org.springframework.stereotype.Component;

@Component
public class FallbackGreetingClient implements GreetingClient {

    @Override
    public String getGreeting() {
        return "Hi there, ";
    }
}
