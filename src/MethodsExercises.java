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
        System.out.println(addition(1,2));

        System.out.println(subtraction(1, 2));

        System.out.println(multiplication(1, 2));

        System.out.println(division(15, 5));


    }

    public static int addition(int num1, int num2) {

        return num1 + num2;

    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }
}
