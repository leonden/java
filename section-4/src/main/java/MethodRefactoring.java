public class MethodRefactoring {
    public static void main(String[] args) {
//        int age = 12;
//        System.out.println(square(12));

        int stars = 12;
        printStars(stars);
        printStars(34);

    }

    private static void printStars(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print('★');
        }
    }

//    public static int square(int value) {
//        return value * value;
//    }



}
