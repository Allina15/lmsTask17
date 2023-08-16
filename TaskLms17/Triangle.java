package TaskLms17;

public class Triangle extends Shape{
    private double c;
    public Triangle(double high, double width, double c) {
        super(high, width);
        this.c=c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return getHigh()+getWidth()+getC();
    }
}
