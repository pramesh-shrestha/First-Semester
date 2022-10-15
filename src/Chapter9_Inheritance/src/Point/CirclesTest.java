package Point;

import java.util.ArrayList;

public class CirclesTest
{
  public static void main(String[] args)
  {
    //creating Circle object
    Circle circle1 = new Circle(2.5,3.5,1.3);
    //Get the center of the Circle object and store it as a Point object
    circle1.getCenter();
    //Move the Circle object 150 to the right
    circle1.moveCircle(150,0);
    //Second Circle object with a center located at the coordinates of the Point object.
    Point point = new Point(1,2);
    Circle circle2 = new Circle(point.getX(), point.getY(), 1.5);
    //create a CircleList object with a capacity for storing a maximum of 3 Circle objects
    CircleList circleList = new CircleList(3);
    //Add the two Circle objects to the CircleList.
    circleList.addCircle(circle1);
    circleList.addCircle(circle2);
    //Print out the total area and the average area of the Circle objects in the CircleList.
    System.out.println("Total area: " + circleList.getTotalArea());
    System.out.println("Average area: " + circleList.getAverageArea());

    //Run through the CircleList and print out all information of each of the stored Circle objects
    for(int i = 0; i < circleList.getNumberOfCircles(); i++)
    {
      System.out.println(circleList.getCircle(i));
    }
  }
}
