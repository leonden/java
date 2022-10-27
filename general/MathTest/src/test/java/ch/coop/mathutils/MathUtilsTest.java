package ch.coop.mathutils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void positiveTest_sum() {
        double result = MathUtils.sum(10, 15);

        Assertions.assertEquals(25, result);
    }

    @Test
    void subtract() {
        // TODO test substraction
    }

    @Test
    void multiply() {
        // TODO test multiplication
    }

    @Test
    void positiveTest_divide() {
        Assertions.assertEquals(3, MathUtils.divide(9, 3));
    }
}