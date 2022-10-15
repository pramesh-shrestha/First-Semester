package Challenge1_Employee;

public class ProductionWorker extends Employee
{
  private int shift;
  private double hourlyPayRate;

  //constructor
  public ProductionWorker(String name, String number, String date, int shift,
      double hourlyPayRate)
  {
    super(name, number, date);
    this.shift = shift;
    this.hourlyPayRate = hourlyPayRate;
  }

  public int getShift()
  {
    return shift;
  }

  public void setShift(int shift)
  {
    this.shift = shift;
  }

  public double getHourlyPayRate()
  {
    return hourlyPayRate;
  }

  public void setHourlyPayRate(double hourlyPayRate)
  {
    this.hourlyPayRate = hourlyPayRate;
  }

  //toString
  public String toString()
  {
    return super.toString() + "\n" + "Shift          : " + shift + "\n" + "Hourly Rate    : " + hourlyPayRate;
  }
}
