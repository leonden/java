public class OverloadedMethods {
    public static void main(String[] args) {

        // println = print line -> always jumps onto the next line
        System.out.println("Hello World");
        System.out.println(69);
        System.out.println("");

        // print = print -> stays at the same line
        System.out.print("line... ");
        System.out.print("still the same line");
        System.out.println("");

        // printf = print formatted -> uses some formatting abbreviations
        System.out.printf("Hello%nWorld");
        System.out.printf("1+1=2");

        System.out.println("");

        System.out.printf("%d+%d=%d%n", 1, 1, 1+1);

        System.out.printf("%s %s %d", "Hello", "World", 2030);

        System.out.printf("%nHi %s, today it's the %s and %d days until Christmas", "Leon", "20.12.2030", 4);



    }
}
