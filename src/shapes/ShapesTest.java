package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);

        double box1Area = box1.getArea();

        System.out.println(box1Area);

        double box1perimeter = box1.getPerimeter();

        System.out.println(box1perimeter);

        Rectangle box2 = new Square(5);

        System.out.println(box2.getArea());

        System.out.println(box2.getPerimeter());


    }
}
