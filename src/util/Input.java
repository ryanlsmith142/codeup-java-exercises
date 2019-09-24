package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    } //getString()

    public boolean yesNo() {
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    } // yesNo()

    public void getInt(int min, int max) {
        int userNumber = scanner.nextInt();

        if(userNumber >= min && userNumber <= max ) {
            System.out.println("Good Job!");
        } else {
            getInt(min, max);
        }

    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userNumber = scanner.nextDouble();

        if(userNumber >= min && userNumber <= max ) {
            return userNumber;
        } else {
            getDouble(min, max);
        }

        return userNumber;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
    public static void main(String[] args) {
        Input userInput = new Input();

//        System.out.println(userInput.getString());

//        System.out.println(userInput.yesNo());

//        userInput.getInt(1, 10);

//        System.out.println(userInput.getInt());

//        userInput.getDouble(1.567, 10.56);

    } //main()

} //Input Class


