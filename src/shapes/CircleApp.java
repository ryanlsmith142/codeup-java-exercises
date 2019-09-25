package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        //INPUT CLASS INSTANCE

        Input userInput = new Input();


        //CIRCLE CLASS INSTANCE

        System.out.println("Please enter the radius of the circle");

        Circle radius = new Circle(userInput.getDouble());


        System.out.println("The area is " + radius.getArea());


        System.out.println("The circumference is " + radius.getCirumference());


        System.out.println("Would you like to conitnue?");


        userInput.yesNo();




    }
}
