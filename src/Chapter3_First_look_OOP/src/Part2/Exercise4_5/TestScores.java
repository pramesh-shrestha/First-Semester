/*8. TestScores Class
Design a TestScores class that has fields to hold three test scores. The class should have
accessor and mutator methods for the test score fields and a method that returns the average
of the test scores. Demonstrate the class by writing a separate program that creates an
instance of the class. The program should ask the user to enter three test scores, which are
stored in the TestScores object. Then the program should display the average of the scores,
as reported by the TestScores object.*/
package Part2.Exercise4_5;

public class TestScores
{
  //declaring 3 fields for class TestScores
  private double testScore1, testScore2, testScores3;

  //initializing fields using set methods and returning values using get methods
  public void setTestScore1(double testScore1) {
    this.testScore1 = testScore1;
  }
  public double getTestScore1() {
    return testScore1;
  }
  public void setTestScore2(double testScore2) {
    this.testScore2 = testScore2;
  }
  public double getTestScore2() {
    return testScore2;
  }
  public void setTestScores3(double testScores3) {
    this.testScores3 = testScores3;
  }
  public double getTestScores3() {
    return  testScores3;
  }
  //creating average() method to calculate the average of 3 test scores
  public double average() {
    return (testScore1 + testScore2 + testScores3)/3;
  }
}
