package Course.Circle;

public class Circle
{
  private double radius;
  private Point center;

  public Circle(double x, double y, double radius)
  {
    center = new Point(x,y);
    this.radius = radius;
  }

  public double getRadius()
  {
    return radius;
  }

  public Point getCenter()
  {
    return center.copy();
  }

  public void moveCircle(double dx, double dy)
  {
    center.move(dx,dy);
  }
  public double getArea()
  {
    return Math.PI * radius * radius;
  }

  public String toString()
  {
    return radius + " " + center;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Circle))
    {
      return false;
    }
    Circle other = (Circle) obj;
    return radius == other.radius && center.equals(other.center);
  }


}
