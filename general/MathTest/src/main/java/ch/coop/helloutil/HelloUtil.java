package ch.coop.helloutil;

import java.util.List;

public class HelloUtil {

    private HelloUtil() {
        // private constructor to prevent instance creation of util-classes
    }

    public static String hello(String name, String language) {
        List<Greeting> allGreetings = GreetingReadService.readGreetings();

        String greeting = "";

        for (Greeting gr : allGreetings) {
            if (gr.getLang().equals(language)) {
                greeting = gr.getText();
                break;
            }
        }
        return greeting + " " + name;
    }
}
