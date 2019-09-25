package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {

        this.scanner = new Scanner(System.in);

    } //Input()

    public String getString() {

        return this.scanner.nextLine();

    } //getString()

    public boolean yesNo() {

        System.out.println("Enter y/n or yes/no");

        String answer = scanner.nextLine();

        return (answer.equalsIgnoreCase("y")) || (answer.equalsIgnoreCase("yes"));

    } // yesNo()

    public int getInt(int min, int max) {

        System.out.println("Please enter a number between " + min + " and " + max);

        int userNumber = Integer.parseInt(this.scanner.nextLine());

        if(userNumber >= min && userNumber <= max ) {
            return userNumber;
        } else {
            return getInt(min, max);
        }

    } //getInt(min, max)

    public int getInt() {

        System.out.println("Please enter a number");

        return Integer.parseInt(this.scanner.nextLine());

    } //getInt() no parameters

    public double getDouble(double min, double max) {

        System.out.println("Please enter a number between " + min + " and " + max);

        double userNumber = Double.parseDouble(this.scanner.nextLine());

        if(userNumber >= min && userNumber <= max ) {
            return userNumber;
        } else {
            return getDouble(min, max);
        }

    } // getDouble(min, max);

    public double getDouble() {

        return Double.parseDouble(this.scanner.nextLine());

    } //getDouble() no parameters

    public static void main(String[] args) {

        //TEST INPUT CLASS METHODS HERE

    } //main()

} //Input Class


