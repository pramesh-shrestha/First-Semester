package circle;

public class CircleTest
{
  public static void main(String[] args)
  {
    Circle circle = new Circle(2);
    System.out.println(circle);
    Circle circle1 = new Circle();
    System.out.println(circle1);
    //checking if area of circle is greater than area of circle1
    System.out.println(circle.Circle(circle1));
    //checking if radius and area of circle and circle1 is equal
    System.out.println(circle.equals(circle1));

  }
}
