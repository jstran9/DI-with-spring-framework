package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"}) // english is the default bean (if no bean is specified).
public class PrimaryGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
//    @Override
//    public String sayGreeting() {
//        return "Hello - Primary Greeting service with the primary bean!";
//    }
}
