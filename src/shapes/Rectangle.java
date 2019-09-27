package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public void setLength(double length) {
        super.length = length;
    }

    public void setWidth(double width) {
        super.width = width;
    }
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getArea() {
        return super.length * super.width;
    }

    public double getPerimeter() {
        return (2 * super.length) + (2 * super.width);
    }


}
