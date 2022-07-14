import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        guessNumberGame();

    }

    public static void guessNumberGame() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Scanner input = new Scanner(System.in);
        int tries = 10;

        System.out.println("Hey there! Please choose a number between 1 and 100");

        for (int i = tries; i > 0; i--) {
            System.out.println("You have " + i + " tries left.");
            System.out.println("Guess!");
            int userInput = input.nextInt();

            if (userInput == randomNumber) {
                System.out.println("Congrats you guessed the number right.");
                System.exit(1);
            } else if (i == 1) {
                System.out.println("You ran out of guesses.");
            } else {
                System.out.println("Your guess wasn't right. Try again.");
            }
        }
    }
}
