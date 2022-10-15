package Inheritance;

class Rectangle1
{
  private int length;
  private int breadth;
  int x = 10;

  Rectangle1(int length, int breadth)
  {
    this.length = length;
    this.breadth = breadth;
  }

  public int getLength()
  {
    return length;
  }

  public int getBreadth()
  {
    return breadth;
  }
}

class Cuboid extends Rectangle1
{
  private int height;
  int x = 20;

  Cuboid(int length, int breadth, int height)
  {
    super(length, breadth);
    this.height = height;
  }

  public void Volume()
  {
    int area = getLength() * getBreadth() * height;
    System.out.println(area);
    System.out.println(x);
    System.out.println(super.x);

  }
}

public class Inheritance
{
  public static void main(String[] args)
  {
    Cuboid cuboid = new Cuboid(10,10,10);
    cuboid.Volume();
  }
}
