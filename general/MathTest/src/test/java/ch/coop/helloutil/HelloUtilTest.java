package ch.coop.helloutil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloUtilTest {

    @Test
    void positiveTest_hello_de() {
        String result = HelloUtil.hello("Andreas", "de");
        Assertions.assertEquals("Hallo Andreas", result);
    }
}