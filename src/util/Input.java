package util;

import java.util.Scanner;

    public class Input {

        private Scanner scanner;

        public Input() {

            this.scanner = new Scanner(System.in);

        } //Input()

        public String getString() {

            return this.scanner.nextLine();

        } //getString() no parameters

        public String getString(String prompt) {

            if(prompt.isEmpty()) {
                System.out.println("Type and Press Enter");
            } else {
                System.out.println(prompt);
            }

            return getString();

        } //getString(prompt)

        public boolean yesNo() {

            System.out.println("Enter y/n or yes/no");

            String answer = scanner.nextLine();

            return (answer.equalsIgnoreCase("y")) || (answer.equalsIgnoreCase("yes"));

        } // yesNo()

        public int getInt(int min, int max) {

            System.out.println("Please enter a number between " + min + " and " + max);

            try {
                int userNumber = Integer.parseInt(getString());

                if(userNumber >= min && userNumber <= max ) {
                    return userNumber;
                } else {
                    return getInt(min, max);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return getInt(min, max);
            }

        } //getInt(min, max)

        public int getInt() {

            System.out.println("Please enter a number");

            try {
                return Integer.valueOf(getString());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return getInt();
            }


        } //getInt() no parameters

        public double getDouble(double min, double max) {

            System.out.println("Please enter a decimal between " + min + " and " + max);

            try {
                double userNumber = Double.valueOf(getString());

                if(userNumber >= min && userNumber <= max ) {
                    return userNumber;
                } else {
                    return getDouble(min, max);
                }
            } catch(NumberFormatException e) {
                e.printStackTrace();
                return getDouble(min, max);
            }


        } // getDouble(min, max);

        public double getDouble() {
            System.out.println("Please enter a decimal: ");
            try {
                return Double.valueOf(getString());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return getDouble();
            }

        } //getDouble() no parameters

        public int getBinary() {
            System.out.println("Please enter a binary number: ");

            try {
                return Integer.valueOf(getString(), 2);

            } catch(NumberFormatException e) {
                e.printStackTrace();
                return getBinary();
            } //try/catch
        } //getBinary()

        public int getHex() {
            System.out.println("Please enter a hex number");

            try {
                return Integer.valueOf(getString(), 16);
            } catch(NumberFormatException e) {
                e.printStackTrace();
                return getHex();
            }
        }
        public static void main(String[] args) {

            //TEST INPUT CLASS METHODS HERE


        } //main()

    } //Input Class

