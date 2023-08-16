package TaskLms17;

public class Parallelogram extends Shape{
    public Parallelogram(double high, double width) {
        super(high, width);
    }

    @Override
    public double getPerimeter() {
        return (getHigh()+getWidth())*2;
    }
}
