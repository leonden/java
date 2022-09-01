public class Methods4 {
    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(random(10));
        System.out.println(random(100, 200));


    }

    static double random() {
        return Math.random();
    }


    static double random(double max) {
        return Math.random() * max;
    }


    static double random(double min, double max) {
        return min + (Math.random() * (max-min));
    }

    // optional parameters



}
