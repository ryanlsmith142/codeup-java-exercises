package shapes;

public class Square extends Quadrilateral {


    public Square (double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return Math.pow(super.width, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * super.width;
    }


}
