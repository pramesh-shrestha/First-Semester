package Challenge2_ShiftSupervisor;

public class ShiftSupervisor extends Employee
{
  private double annualSalary;
  private double bonus;

  //constructor
  public ShiftSupervisor(String name, String number, String date, double annualSalary, double bonus)
  {
    super(name, number, date);
    this.annualSalary = annualSalary;
    this.bonus = bonus;
  }

  public double getAnnualSalary()
  {
    return annualSalary;
  }

  public void setAnnualSalary(double annualSalary)
  {
    this.annualSalary = annualSalary;
  }

  public double getBonus()
  {
    return bonus;
  }

  public void setBonus(double bonus)
  {
    this.bonus = bonus;
  }

  //toString
  public String toString()
  {
    return super.toString() + "\n" + "Annual Salary  : " + annualSalary +
        "\n" + "Annual bonus   : " + bonus;
  }
}
