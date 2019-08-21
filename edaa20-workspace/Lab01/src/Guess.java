import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        Random rand = new Random();
        int nbrToGuess = rand.nextInt(100);
        int nbrTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean isWin = false;

        while (!isWin) {
            System.out.println("Guess a number between 1 and 100");
            guess = input.nextInt();
            nbrTries++;

            if (guess == nbrToGuess) {
                isWin = true;
            } else if (guess < nbrToGuess) {
                System.out.println("Your number is low!");
            } else
                System.out.println("Your guess is high");
        }
        System.out.println("You win!!!");
        System.out.println("The number was: " + nbrToGuess);
        System.out.println("It took you " + nbrTries + " tries for you to guess it.");
    }
}
