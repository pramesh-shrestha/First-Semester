package TestScore;

public class TestScore
{
  private int[] testScores;

  public TestScore(int[] testScores)
  {
    for(int i =0; i < testScores.length; i++)
    {
      if(testScores[i] > 100 || testScores[i] < 0)
      {
        throw new IllegalArgumentException("Invalid score");
      }
      else
      {
        this.testScores = testScores;
      }
    }
  }

  public int getTestScores(int index)
  {
    return testScores[index];
  }

  public double average()
  {
    double sum = 0;
    double average = 0;
    for(int i = 0; i < testScores.length; i++)
    {
      sum += testScores[i];
    }
    average = sum/testScores.length;
    return average;
  }

  public String toString()
  {
    String temp ="";
    for(int i =  0; i < testScores.length; i++)
    {
      temp += "\n" + testScores[i];
    }
    return "The marks: " + temp + "\nAverage: " + average();
  }
}
