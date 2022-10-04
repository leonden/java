package ch.coop.unittesting.models;

import ch.coop.unittesting.enums.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PenguinTest {

    @Test
    void positiveTest_createNewInstance() {
        var penguin = new Penguin("Pete", Gender.MALE);

        Assertions.assertEquals("Pete", penguin.getName());
        Assertions.assertEquals(Gender.MALE, penguin.getGender());
    }

    @Test
    void positiveTest_sing() {
        var penguin = new Penguin("Pete", Gender.MALE);

        Assertions.assertEquals("I'm a penguin and my name is Pete", penguin.sing());
    }

}
