/*4. LandTract Class
Make a LandTract class that has two fields: one for the tract’s length and one for the width.
The class should have a method that returns the tract’s area, as well as an equals method
and a toString method. Demonstrate the class in a program that asks the user to enter the
dimensions for two tracts of land. The program should display the area of each tract of land
and indicate whether the tracts are of equal size.*/
package Challenge4_LandTract;

public class LandTract
{
  private double length;
  private double width;

  public LandTract(double length, double width)
  {
    this.length = length;
    this.width = width;
  }
  //area
  public double getArea()
  {
    return length * width;
  }

  //equals
  public boolean equals(LandTract obj)
  {
    return length == obj.length && width == obj.width;
  }

//  toString
  public String toString()
  {
    return "Length: " + length + " Width: " + width;
  }
}
