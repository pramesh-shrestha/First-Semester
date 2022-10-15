package Vehicle;

public class Car extends Vehicle
{
  private String regNo;

  //constructor
  public Car(String owner, double price, String regNo)
  {
    super(owner, price);
    this.regNo = regNo;
  }
  //getRegistrationNumber
  public String getRegistrationNumber()
  {
    return regNo;
  }
  //setRegistrationNumber
  public void setRegistrationNumber(String regNo)
  {
    this.regNo = regNo;
  }
  //toString
  public String toString()
  {
    return super.toString() + "Registration number: " + regNo;
  }
}
