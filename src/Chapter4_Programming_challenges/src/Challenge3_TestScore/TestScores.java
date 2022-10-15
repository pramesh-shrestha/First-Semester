/*3. TestScores Class
Design a TestScores class that has fields to hold three test scores. (If you have already
written the TestScores class for Programming Challenge 8 of Chapter 3, you can modify
it.) The class constructor should accept three test scores as arguments and assign these
arguments to the test score fields. The class should also have accessor methods for the test
score fields, a method that returns the average of the test scores, and a method that returns
the letter grade that is assigned for the test score average. Use the grading scheme in the
following table.*/
package Challenge3_TestScore;

public class TestScores
{
  private double score1, score2, score3;

  //constructor
  public TestScores(double score1, double score2, double score3)
  {
    this.score1 = score1;
    this.score2 = score2;
    this.score3 = score3;
  }

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
