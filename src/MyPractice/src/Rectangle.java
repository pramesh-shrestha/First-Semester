public class Rectangle
{
  //hiding data so that it is not available outside the class
  private double length;
  private double width;
  //creating setLength() method and making it public so that it can be accessed outside the class
  public double setLength(double len)
  {
    //assigning the parameter len to new variable length
    length = len;
    //returns the value assigned to length
    return length;
  }
  //creating setWidth() method and making it public so that it can be accessed outside the class
  public double setWidth(double w)
  {
    //assigning the parameter w to new variable width
    width = w;
    //returns the value assigned to width
    return width;
  }
  //creating area() method and making it public so that it can be accessed outside the class
  public double area ()
  {
    return length * width;
  }
}

