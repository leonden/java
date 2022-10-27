package ch.coop.mathutils;

public class MathUtils {

    private MathUtils() {
        // private constructor to prevent instance creation of util-classes
    }

    public static double sum(double summand1, double summand2) {
        return summand1 + summand2;
    }

    public static double subtract(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    public static double multiply(double factor1, double factor2) {
        return factor1 * factor2;
    }

    public static double divide(double dividend, double divisor) {
        return dividend / divisor;
    }
}
