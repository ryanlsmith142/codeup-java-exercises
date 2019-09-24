package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getArea() {

        double area = 3.14 * (radius * radius);

        return area;

    }

    public double getCirumference() {
        double circumference = 2 * 3.14 * radius;
        return circumference;
    }


}
