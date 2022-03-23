package ch.course;

public class Varargs {
    public static void main(String[] args) {

        printInts(1, 2, 3);
        System.out.println();
        printInts(1, 2, 3, 4, 5);

    }

    public static void printInts(int... numbers) { // -> (int[] numbers)
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // 1. varargs can only be at the end
    // 2. there is just one vararg possible
}
