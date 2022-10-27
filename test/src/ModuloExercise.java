public class ModuloExercise {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int numberToCheck = i;
            int count = 0;

            for (int j = 1; j <= numberToCheck; j++) {
                if (numberToCheck % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(numberToCheck + " ist eine Primzahl");
            } else {
                System.out.println(numberToCheck + " ist keine Primzahl");
            }
        }
    }
}
