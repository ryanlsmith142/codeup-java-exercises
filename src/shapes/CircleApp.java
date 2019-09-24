package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input userInput = new Input();

        double userDouble = userInput.getDouble();

        Circle circleProblem = new Circle(userDouble);

        double circleArea = circleProblem.getArea();

        System.out.println("The area is " + circleArea);

        double circleCircumference = circleProblem.getCirumference();

        System.out.println("The circumference is " + circleCircumference);

    }
}
