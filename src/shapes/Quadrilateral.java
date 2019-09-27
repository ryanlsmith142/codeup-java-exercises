package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    abstract void setLength(double length);

    public double getLength() {
        return this.length;
    }

    abstract void setWidth(double width);

    public double getWidth() {
        return this.width;
    }


    public void Measurable(double length, double width) {
        setLength(length);
        setWidth(width);
    }
}
