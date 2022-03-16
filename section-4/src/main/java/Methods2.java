public class Methods2 {
    public static void main(String[] args) {

        int size = 10;
        char symbol = '-';
        lines(size, symbol);

    }

    static void lines(int len, char c) {
        for (int i = 0; i < len; i++) {
            printChar(c);
        }
    }

    static void printChar(char c) {
        System.out.print(c);
    }

}
