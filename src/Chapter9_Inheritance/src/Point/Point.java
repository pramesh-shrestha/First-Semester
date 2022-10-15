package Point;

public class Point
{
  private double x;
  private double y;

  //constructor
  public Point (double x, double y)
  {
    this.x = x;
    this.y = y;
  }
  //getMethods
  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }

  //move()
  public void move(double dx, double dy)
  {
    x += dx;
    y += dy;
  }

  //copy()
  public Point copy()
  {
    return new Point(x,y);
  }

  //toString

  public String toString()
  {
    return "Point{" + "x=" + x + ", y=" + y + '}';
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Point))
    {
      return false;
    }
    Point other = (Point) obj;
    return x == other.x && y == other.y;
  }
}
