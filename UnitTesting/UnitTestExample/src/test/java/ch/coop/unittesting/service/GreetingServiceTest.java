package ch.coop.unittesting.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GreetingServiceTest {

    @Test
    void positiveTest_getGreeting() {
        var greetingService = new GreetingsService();

        Assertions.assertEquals("Hello Pete", greetingService.getGreeting());





    }

}
