/*11. Geometry Calculator
Design a Geometry class with the following methods:
● A static method that accepts the radius of a circle and returns the area of the circle.
Use the following formula:
Area = PI * r * r
Use Math.PI for p and the radius of the circle for r
 A static method that accepts the length and width of a rectangle and returns the area
of the rectangle. Use the following formula:
Area 5 Length 3 Width
● A static method that accepts the length of a triangle’s base and the triangle’s height.
The method should return the area of the triangle. Use the following formula:
Area = Base * Height * 0.5
The methods should display an error message if negative values are used for the circle’s
radius, the rectangle’s length or width, or the triangle’s base or height.
Next, write a program to test the class, which displays the following menu and responds
to the user’s selection:
Geometry Calculator
1. Calculate the Area of a Circle
2. Calculate the Area of a Rectangle
3. Calculate the Area of a Triangle
4. Quit
Enter your choice (1—4):
Display an error message if the user enters a number outside the range of 1 through 4 when
selecting an item from the menu
*/
package geometry_calculator;

public class GeometryCalculator
{
  private static double length;
  private static double width;
  private static double height;
  private static double base;
  private static double radius;

  //method for area of circle
  public static double Circle(double radius)
  {
    return Math.PI * radius * radius;
  }
  //method for area of rectangle
  public static double Rectangle(double length, double width)
  {
    return length * width;
  }
  //method for area of triangle
  public static double Triangle(double base, double height)
  {
    return 0.5 * base * height;
  }
}
