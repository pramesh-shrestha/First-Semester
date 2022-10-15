package Toy;

public abstract class Ball extends Toy
{
  private int diameter;

  //constructor
  public Ball(int suitableAge, int diameter)
  {
   super(suitableAge);
   this.diameter = diameter;
  }

  public int getDiameter()
  {
    return diameter;
  }

  public void setDiameter(int diameter)
  {
    this.diameter = diameter;
  }

  //toString
  public String toString()
  {
    return super.toString() + "Diameter: " + diameter;
  }

}
