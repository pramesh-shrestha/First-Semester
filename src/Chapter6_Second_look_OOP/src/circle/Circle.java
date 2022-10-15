/*Algorithm Workbench 1, p. 461-462 (start by finding and fixing the errors in the code)
1. Consider the following class declaration:
public class Circle
{
 private double radius;
 private void getArea()
 {
 return Math.PI * radius * radius;
 }
 private double getRadius()
 {
 return radius;
 }
}
a. Write a no-arg constructor for this class. It should assign the radius field the value 0.
b. Write an overloaded constructor for this class. It should accept an argument copied
into the radius member variable.
c. Write a toString method for this class. The method should return a string containing the radius and area of the circle.
d. Write an equals method for this class. The method should accept a Circle object
as an argument. It should return true if the argument object contains the same data
as the calling object, or false otherwise.
e. Write a greaterThan method for this class. The method should accept a Circle
object as an argument. It should return true if the argument object has an area
greater than the area of the calling object, or false otherwise.*/
package circle;

public class Circle
{
  private double radius;
  public double getArea()
  {
    return Math.PI * radius * radius;
  }
  public double getRadius()
  {
    return radius;
  }

  //no args constructor
  public Circle()
  {
    radius = 0;
  }

  //1 arg constructor
  public Circle(double radius)
  {
    this.radius = radius;
  }

  //toString method

  public String toString()
  {
    return "Radius= " + radius + "\nArea= " + String.format("%.2f",getArea());
  }
  //equals method
  public boolean equals(Circle circle)
  {
    if(radius == circle.radius &&
    getArea() == circle.getArea())
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  //greaterThan method
  public boolean Circle(Circle circle)
  {
    if(getArea() > circle.getArea())
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
