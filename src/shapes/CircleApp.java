package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input userInput = new Input();

        System.out.println("Please enter in a number");

        double userDouble = userInput.getDouble();

        Circle circleProblem = new Circle(userDouble);

        double circleArea = circleProblem.getArea();

        System.out.println("The area is " + circleArea);

        double circleCircumference = circleProblem.getCirumference();

        System.out.println("The circumference is " + circleCircumference);

//        Input isUserContinue = new Input();

        System.out.println("Would you like to conitnue?");
        boolean userContinue = userInput.yesNo();

        System.out.println(userContinue);

    }
}
