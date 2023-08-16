package TaskLms17;

public class ShapeMain {
    public static void main(String[] args) {
        System.out.println("Perimeter of triangle with length 4,5 and 6 ");
        Triangle triangle = new Triangle(4,5,6);
        System.out.println(triangle.getPerimeter());
        System.out.println("Perimeter of square with length 8 ");
        Square square = new Square(8,8);
        System.out.println(square.getPerimeter());
        System.out.println("Perimeter of rectangle with length 6,3 ");
        Rectangle rectangle = new Rectangle(6,3);
        System.out.println(rectangle.getPerimeter());
        System.out.println("Perimeter of parallelogram with length 4,5 and 4,5 ");
        Parallelogram parallelogram = new Parallelogram(4.5,4.5);
        System.out.println(parallelogram.getPerimeter());
        System.out.println("Perimeter of rhombus with length 8 and 8 ");
        Rhombus rhombus = new Rhombus(8,8);
        System.out.println(rhombus.getPerimeter());
    }
}
