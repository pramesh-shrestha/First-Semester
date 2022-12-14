package Course.Circle;

public class Point
{
  private double x;
  private double y;

  public Point(double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }
  public void move(double dx, double dy)
  {
    x += dx;
    y += dy;
  }

  public Point copy()
  {
    return new Point(x,y);
  }
  public String toString()
  {
    return x + " " + y;
  }

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
