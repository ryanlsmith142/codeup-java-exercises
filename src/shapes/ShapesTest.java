package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);

        double box1Area = box1.getArea();

//        System.out.println(box1Area);

        double box1perimeter = box1.getPerimeter();

//        System.out.println(box1perimeter);

        Measurable myShape = new Square(5);

        Measurable myRectangle = new Rectangle(5, 4);


        System.out.println(myShape.getPerimeter());

        System.out.println(myRectangle.getPerimeter());


    }
}
