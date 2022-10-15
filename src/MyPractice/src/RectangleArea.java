 public class RectangleArea
{
  private int length;
  private int breadth;

  public RectangleArea(int length, int breadth)
  {
    this.length = length;
    this.breadth = breadth;
  }

  //area of rectangle
  public int areaOfRectangle()
  {
    return length * breadth;
  }

  public int getLength()
  {
    return length;
  }

  public int getBreadth()
  {
    return breadth;
  }

  public void setLength(int length)
  {
    this.length = length;
  }

  public void setBreadth(int breadth)
  {
    this.breadth = breadth;
  }

  public String toString()
  {
    return "The area of the rectangle is " + areaOfRectangle();
  }
}



