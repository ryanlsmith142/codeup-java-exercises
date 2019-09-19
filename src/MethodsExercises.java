import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {



//        Basic Arithmetic
//
//        Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition

//                Subtraction

//        Multiplication

//                Division

//        Each function needs to take two parameters/arguments so that the operation can be performed.
//
//                Test your methods and verify the output.
//
//        Add a modulus method that finds the modulus of two numbers.
//
//                Food for thought: What happens if we try to divide by zero? What should happen?
//        System.out.println(addition(1,2));

//        System.out.println(subtraction(1, 2));

//        System.out.println(multiplication(5, 5));

//        System.out.println(division(0, 0));

//        System.out.println(modulus(15, 30));

        System.out.println(factorialNumber());



    }

//    public static int addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int subtraction(int num1, int num2) {
//        return num1 - num2;
//    }

//    public static int multiplication(int num1, int num2) {
//        return num1 * num2;
//    }

//    Multiplication refactor to not use * operator -- Loop

//    public static int multiplication(int num1, int num2) {
//        int total = 0;
//        for(int i = 1; i <= num2; i++) {
//            total += num1;
//        }
//        return total;
//    }

//    Multiplication refactor2 to use recursion

//    public static int multiplication(int num1, int num2) {
//        if((num1 == 0) || (num2 == 0)) {
//            return 0;
//        } else
//            return (num1 + multiplication(num1, num2 - 1));
//    }

//    public static int division(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public static int modulus(int num1, int num2) {
//        return num1 % num2;
//    }


    public static int getInteger(int min, int max) {
        System.out.format("Enter a number between %s and %s", min, max);

        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {

            int userNumberInput = sc.nextInt();

            if((userNumberInput) >= min && (userNumberInput <= max)) {

                System.out.println("Good Job!");

                return userNumberInput;

            } else {

                return getInteger(min, max);

            }

        } else {

            System.out.println("That's not a number");

            return getInteger(min,max);
        }

    } //getInteger


    public static long factorialNumber() {
        Scanner sc = new Scanner(System.in);

            int numberToFactor = getInteger(1, 10);

            long numberToFactorLong = (long) numberToFactor;


            long total = 1;

            for(int i = 1; i <= numberToFactorLong; i++) {
                total = total * i;
            }

            System.out.println("Would you like to continue");

            String userAnswer = sc.nextLine();

            if(userAnswer.equals("y")) {
                factorialNumber();
            } else {
                System.out.println("Okay, Goodbye!");
            }

            return total;

    }


}
