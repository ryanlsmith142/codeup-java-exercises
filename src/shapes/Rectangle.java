package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }


}
