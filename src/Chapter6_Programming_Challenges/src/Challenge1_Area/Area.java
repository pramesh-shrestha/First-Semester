/*1. Area Class
Write a class that has three overloaded static methods for calculating the areas of the following geometric shapes.
● circles
● rectangles
● cylinders
Here are the formulas for calculating the area of the shapes.
Area of a circle: Area = PI *r *r
where p is Math.PI and r is the circle’s radius
Area of a rectangle: Area = Width * Length
Area of a cylinder: Area = PI*r*r*h
where p is Math.PI, r is the radius of the cylinder’s base, and h is the cylinder’s height
Because the three methods are to be overloaded, they should each have the same name, but
different parameter lists. Demonstrate the class in a complete program*/
package Challenge1_Area;

public class Area
{
  private static double radius;
  private static double length;
  private static double width;
  private static double height;

  public static double area(double radius)
  {
    return Math.PI * radius * radius;
  }
  //method for area of rectangle
  public static double area(int width, int length)
  {
    return length * width;
  }
  //method for area of cylinder
  public static double area(double radius, double height)
  {
    return Math.PI * radius * radius * height;
  }
}
