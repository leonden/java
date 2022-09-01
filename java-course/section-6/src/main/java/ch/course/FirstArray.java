package ch.course;

public class FirstArray {
    public static void main(String[] args) {

        int[] primes = new int[5];
        System.out.println(primes.length);
//        primes = new int[10];
        System.out.println(primes[0]);

        primes[0] = 2;
        primes[1] = 3;
        primes[2] = 5;
        primes[3] = 7;
        primes[4] = 11;

        System.out.println(primes[primes.length / 2]);


    }
}
