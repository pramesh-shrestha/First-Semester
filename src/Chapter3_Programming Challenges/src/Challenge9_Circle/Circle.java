package Challenge9_Circle;

public class Circle
{
  private double radius;
  private final double PI = 3.14159;

  public Circle(double radius)
  {
    this.radius = radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }

  public double getRadius()
  {
    return radius;
  }

  //area
  public double getArea()
  {
    double area = PI * radius * radius;
    return area;
  }

  //getDiameter
  public double getDiameter()
  {
    double diameter = radius * 2;
    return diameter;
  }

  //getCircumference
  public double getCircumference()
  {
    double circumference = 2 * PI * radius;
    return circumference;
  }

  //toString
  public String toString()
  {
    return "For given radius,\nThe area of circle is " + getArea() + ".\nThe diameter is " +
        getDiameter() + ".\nThe circumference is " + getCircumference() + ".";
  }
}
