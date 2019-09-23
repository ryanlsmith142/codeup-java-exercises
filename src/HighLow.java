import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner sc = new Scanner(System.in);

        int randomNumber = rand.nextInt(100);

        System.out.println(randomNumber);

        System.out.println("Guess the random number");

        int userInput = sc.nextInt();

        if(userInput == randomNumber) {
            System.out.println("GOOD GUESS!");
        } else if(userInput < randomNumber) {
            System.out.println("HIGHER!");
        } else if(userInput > randomNumber) {
            System.out.println("LOWER");
        }

    }
}
