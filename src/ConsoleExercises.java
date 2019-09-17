import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %s\n", pi);
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("What is your favorite number?");
//
//        int favoriteNumber = input.nextInt();
//
//        System.out.println(favoriteNumber);

//        Scanner input1 = new Scanner(System.in);
//
//        Scanner input2 = new Scanner(System.in);
//
//        Scanner input3 = new Scanner(System.in);
//
//        System.out.println("Enter a word");
//
//        String word1 = input1.nextLine();
//
//        System.out.println("Enter another word");
//
//        String word2 = input2.nextLine();
//
//        System.out.println("Enter one last word");
//
//        String word3 = input3.nextLine();
//
//        System.out.println(word1);
//
//        System.out.println(word2);
//
//        System.out.println(word3);


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Give me a sentence");
//
//        String userSentence = input.nextLine();
//
//        System.out.println(userSentence);


//        Calculate the perimeter and area of Codeup's classrooms




        System.out.println("What is the length of a CodeUp classroom?");

        Scanner input1 = new Scanner(System.in);
        input1.useDelimiter("\n");

        String classroomLength = input1.nextLine();


        System.out.println("What is the width of a CodeUp classroom?");

        Scanner input2 = new Scanner(System.in);
        input2.useDelimiter("\n");

        String classroomWidth = input2.nextLine();


        double x = Double.parseDouble(classroomLength);

        double y = Double.parseDouble(classroomWidth);


        double totalArea = (x * y);

        double totalPerimeter = (x * 2) + (y * 2);


        System.out.format("The total area of a codeup classroom is: %s\n", totalArea);

        System.out.format("The total perimeter of a codeup classroom is: %s", totalPerimeter);











    }
}
