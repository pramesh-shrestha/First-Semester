package Part3.Exercise5_3;

public class PointTest
{
  public static void main(String[] args)
  {
    //creating two Point objects
    Point point1 = new Point(3,4);
    Point point2 = new Point(5,6);
    System.out.println(point1);
    System.out.println(point2);

    //Calculating the distance between two points in a coordinate system
    double points = Math.pow((point2.getX() - point1.getX()),2)  +
        Math.pow((point2.getY() - point1.getY()),2);

    double distance= Math.sqrt(points);
    System.out.printf("The distance is %.2f", distance);
  }
}
