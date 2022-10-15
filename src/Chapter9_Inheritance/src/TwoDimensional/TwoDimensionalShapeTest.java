package TwoDimensional;

public class TwoDimensionalShapeTest
{
  public static void main(String[] args)
  {
    TwoDimensionalShape circle = new Circle(1,2,2);
    TwoDimensionalShape rectangle = new Rectangle(2,2,3,4);

    System.out.println(circle.getArea());
    System.out.println(rectangle.getArea());

    //casting before getLength of Rectangle can be called
    Circle c = (Circle) circle;
    System.out.println(c.getRadius());

    //casting before getLength of Rectangle can be called
    Rectangle r = (Rectangle) rectangle;
    System.out.println(r.getLength());
  }
}
