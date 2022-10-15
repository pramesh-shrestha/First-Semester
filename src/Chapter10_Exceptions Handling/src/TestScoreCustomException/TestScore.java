/*Write an exception class named InvalidTestScore. Modify the TestScores class you wrote
in Programming Challenge 1 so it throws an InvalidTestScore exception if any of the test
scores in the array are invalid.*/
package TestScoreCustomException;

public class TestScore
{
  private int[] scores;

  public TestScore(int[] scores)
  {
    for(int i = 0; i < scores.length; i++)
    {
      if (scores[i] < 0 || scores[i] > 100)
      {
        throw new InvalidTestScore(
            "The score must be in between 0 and 100");
      }
    }
    this.scores = scores;
  }
  public double average()
  {
    double sum = 0;
    for(int i = 0; i < scores.length; i++)
    {
      sum += scores[i];
    }
    double average = sum/ scores.length;
    return average;
  }
}
