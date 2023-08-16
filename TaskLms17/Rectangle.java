package TaskLms17;

public class Rectangle extends  Shape{
    public Rectangle(double high, double width) {
        super(high, width);
    }

    @Override
    public double getPerimeter() {
        return (getHigh()+getWidth())*2;
    }
}
