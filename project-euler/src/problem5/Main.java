package problem5;

public class Main {
    public static void main(String[] args) {
        for (int i = 21; i > 0; i++) {
            boolean divisibleByAll = true;

            for (int j = 1; j <= 20; j++) {
                int s = i % j;

                if (s != 0) {
                    divisibleByAll = false;
                    break;
                }

            }

            if (divisibleByAll) {
                System.out.println(i);
                break;
            }
        }
    }
}
