/*8. TestScores Class
Design a TestScores class that has fields to hold three test scores. The class should have
accessor and mutator methods for the test score fields and a method that returns the average of the test scores.
Demonstrate the class by writing a separate program that creates an
instance of the class. The program should ask the user to enter three test scores, which are
stored in the TestScores object. Then the program should display the average of the scores,
as reported by the TestScores object.*/
package Challenge8_Testscores;

public class TestScores
{
  private double score1, score2, score3;

  //accessor methods that return the value stored in the fields
  public double getScore1()
  {
    return score1;
  }
  public double getScore2()
  {
    return score2;
  }
  public double getScore3()
  {
    return score3;
  }
  //accessor method to store value in the fields
  public void setScore1(double score1)
  {
    this.score1 = score1;
  }
  public void setScore2(double score2)
  {
    this.score2 = score2;
  }
  public void setScore3(double score3)
  {
    this.score3 = score3;
  }
  public double average()
  {
    return (score1 + score2 + score3)/3.0;
  }
}
