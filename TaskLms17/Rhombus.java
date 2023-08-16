package TaskLms17;

public class Rhombus extends Shape{
    public Rhombus(double high, double width) {
        super(high, width);
    }

    @Override
    public double getPerimeter() {
        return getHigh()*4;
    }
}
