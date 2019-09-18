import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //while

//        int i = 5;
//
//        while(i <= 15) {
//
//            System.out.println(i);
//
//            i++;
//        }


//        //Do While
//        int i = 2;
//
//        do {
//            System.out.println(i);
//
//            i *= Math.pow(i,1);
//
//        } while (i <= 1000000);

//        long z = 2;
//
//        do {
//            System.out.println(z);
//            z = z * z;
//        } while (z <= 1000000);
        //Do While Refactor

//        for(int i = 2; i <= 1000000; i *= Math.pow(i, 1)) {
//            System.out.println(i);
//        }

//        1st Refactor While

//        for(byte i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        2nd Refactor Do While

//        for(byte i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }



//        FizzBuzz Test

//        for(byte i = 1; i <= 100; i++) {
//            if(i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        } //for


        //Table of Powers


//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("Please enter a number");
//
//        long userNumber = userInput.nextInt();
//
////        System.out.println(" number | squared | cubed ");
////
////        System.out.println(" ------ | ------ | ------ ");
//
//        for(long i = 1; i <= userNumber; i++) {
//            long iSquared = i;
//
//            iSquared *= Math.pow(i, 1);
//
//
//            long iCubed = i;
//
//            iCubed *= Math.pow(i, 2);
//
//            System.out.print(i);
//            System.out.print(iSquared);
//            System.out.println(iCubed);
//
//            if(i == userNumber) {
//
//                System.out.println("Would you like to continue?");
//
//                Scanner userString = new Scanner(System.in);
//
//                String userConfirmation = userString.nextLine();
//
//                if(userConfirmation.equals("yes")) {
//                    continue;
//                }
//
//            }
//        } //for

        System.out.println("WHat number would you like to go up to?");
        int answer = Integer.parseInt(input.nextLine());

        for (int counter = 1; counter <= answer; counter++) {
            System.out.println(String.format("%-2d | %-2d | %-2d", counter,(int) Math.pow(counter, 2), (int) Math.pow(counter, 3)));
        }

//        do {
//
//            long i = 0;
//
//            long iSquared = i;
//
//            iSquared *= Math.pow(i, 1);
//
//
//            long iCubed = i;
//
//            iCubed *= Math.pow(i, 2);
//
//            System.out.print(i);
//            System.out.print(iSquared);
//            System.out.println(iCubed);
//
//        } while (userConfirmation == true);

//        Scanner userInput = new Scanner(System.in);
//
//
//        System.out.println("Give me a number between 0 - 100");
//
//
//        int userNumber = userInput.nextInt();
//
//
//        if(userNumber <= 59) {
//            System.out.println("You get an F");
//        } else if(userNumber >= 66) {
//            System.out.println("You get a D");
//        } else if(userNumber <= 79)



    }//main()

} //ControlFlowExercises
