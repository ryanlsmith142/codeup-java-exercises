package shapes;

public class Square extends Quadrilateral {

        @Override
        void setLength(double length) {
            super.length = length;
        }

        @Override
        void setWidth(double width) {
            super.width = width;
        }

        public Square(double side) {
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
