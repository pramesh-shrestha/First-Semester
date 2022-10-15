package Challenge3_TeamLeader;
public class TeamLeader extends Employee
{
  private double monthlyBonus;
  private int trainingHoursRequired;
  private int trainingHoursAttended;

  //constructor

  public TeamLeader(String name, String number, String date,
      double monthlyBonus, int trainingHoursRequired, int trainingHoursAttended)
  {
    super(name, number, date);
    this.monthlyBonus = monthlyBonus;
    this.trainingHoursRequired = trainingHoursRequired;
    this.trainingHoursAttended = trainingHoursAttended;
  }

  public double getMonthlyBonus()
  {
    return monthlyBonus;
  }

  public void setMonthlyBonus(double monthlyBonus)
  {
    this.monthlyBonus = monthlyBonus;
  }

  public int getTrainingHoursRequired()
  {
    return trainingHoursRequired;
  }

  public void setTrainingHoursRequired(int trainingHoursRequired)
  {
    this.trainingHoursRequired = trainingHoursRequired;
  }

  public int getTrainingHoursAttended()
  {
    return trainingHoursAttended;
  }

  public void setTrainingHoursAttended(int trainingHoursAttended)
  {
    this.trainingHoursAttended = trainingHoursAttended;
  }

  //toString
  public String toString()
  {
    return super.toString() + "\n" + "Training hours required: " + trainingHoursRequired + "\n" +
        "Training hours attended: " + trainingHoursAttended;
  }
}

