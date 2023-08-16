package TaskLms17;

public abstract class Shape {
    private double high;
    private double width;

    public Shape(double high, double width) {
        this.high = high;
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Shape " +
                "high = " + high +
                ", width = " + width;
    }
    public abstract double getPerimeter();

    public void setWidth(double width) {
        this.width = width;
    }
}
