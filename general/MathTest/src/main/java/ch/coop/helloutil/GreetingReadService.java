package ch.coop.helloutil;

import java.util.Arrays;
import java.util.List;

public class GreetingReadService {

    public static List<Greeting> readGreetings() {
        Greeting greetingDe = new Greeting("Hallo", "de");
        Greeting greetingEn = new Greeting("Hello", "en");
        Greeting greetingFr = new Greeting("Bonjour", "fr");

        return Arrays.asList(greetingDe, greetingEn, greetingFr);
    }

}
