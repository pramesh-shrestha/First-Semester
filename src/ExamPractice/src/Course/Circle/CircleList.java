package Course.Circle;

public class CircleList
{
  private int capacity;
  private Circle[] circles;

  public CircleList(int capacity)
  {
    this.capacity = capacity;
    circles = new Circle[capacity];
  }

  public int getNumberOfCircles()
  {
    return circles.length;
  }

  public void addCircle(Circle circle)
  {
    if(circles.length < capacity)
    {
      for(int i = 0; i < circles.length; i++)
      {
        if(circles[i] == null)
        {
          circles[i] = circle;
        }
      }
    }
  }

  public Circle getCircle(int index)
  {
    return circles[index];
  }

  public double getTotalArea()
  {
    double total = 0;
    for(int i=0; i < circles.length; i++)
    {
      total += circles[i].getArea();
    }
    return total;
  }

  public double getAverageArea()
  {
    return getTotalArea()/circles.length;
  }
}
