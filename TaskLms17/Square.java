package TaskLms17;

public class Square  extends Shape{
    public Square(double high, double width) {
        super(high, width);
    }

    @Override
    public double getPerimeter() {
        return (getHigh()+getWidth())*2;
    }
}
