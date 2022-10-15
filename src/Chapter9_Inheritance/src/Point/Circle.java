package Point;

public class Circle
{
  private double radius;
  private Point center;

  //constructor
  public Circle(double x, double y, double radius)
  {
    center = new Point(x,y); //instantiating by creating new Point object
    this.radius = radius;
  }
  //getCenter
  public Point getCenter()
  {
    return center.copy();
  }
  //getRadius
  public double getRadius()
  {
    return radius;
  }

  //moveCircle()
  public void moveCircle(double dx, double dy)
  {
    center.move(dx,dy);
  }

  //getArea()
  public double getArea()
  {
    return Math.PI * radius *radius;
  }

  //toString
  public String toString()
  {
    return "Circle{" + "radius=" + radius + ", center=" + center + '}';
  }
  //equals
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
