import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomNumber = rand.nextInt(100);

        guessNumber(randomNumber);

        int numberOfGuesses = 0;

    }

    public static void guessNumber(int randomNumber) {
        Scanner sc = new Scanner(System.in);

        System.out.println(randomNumber);

        System.out.println("Guess the random number");

        int userInput = sc.nextInt();

        if(userInput == randomNumber) {

            System.out.println("GOOD GUESS!");

        } else if(userInput < randomNumber) {

            System.out.println("HIGHER!");

            guessNumber(randomNumber);

        } else if(userInput > randomNumber) {

            System.out.println("LOWER");

            guessNumber(randomNumber);
        }

    }
}
