package Point;

import java.util.ArrayList;

public class CircleList
{
  private int capacity;
  private ArrayList<Circle> circles;

  //constructor
  public CircleList(int capacity)
  {
    this.capacity = capacity;
    circles = new ArrayList<>();
  }

  //getNumberOfCircles
  public int getNumberOfCircles()
  {
    return circles.size();
  }

  //addCircle
  public void addCircle(Circle circle)
  {
    if(circles.size() < capacity)
    {
      circles.add(circle);
    }
  }

  //getCircle
  public Circle getCircle(int index)
  {
    return circles.get(index);
  }

  //getTotalArea
  public double getTotalArea()
  {
    double sum = 0;
    for(int i = 0; i < circles.size(); i++)
    {
      sum += circles.get(i).getArea();
    }
    return sum;
  }

  //getAverageArea
  public double getAverageArea()
  {
    return getTotalArea()/circles.size();
  }
}
