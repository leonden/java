package ch.coop.mathutils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    void positiveTest_sum() {
        double result = MathUtils.sum(10, 15);
        Assertions.assertEquals(25, result);
    }

    @Test
    void subtract() {
        double result = MathUtils.subtract(1, 500);
        Assertions.assertEquals(-499, result);
    }

    @Test
    void multiply() {
        double result = MathUtils.multiply(0, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void positiveTest_divide() {
        Assertions.assertEquals(3, MathUtils.divide(9, 3));
    }
}