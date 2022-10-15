package TestScoreCustomException;

public class TestScoreTest
{
  public static void main(String[] args)
  {
    int[] scores = new int[5];
    scores[0] = 50;
    scores[1] = -50;
    scores[2] = 30;
    scores[3] = 60;
    scores[4] = 70;

    try
    {
      TestScore marks = new TestScore(scores);
      System.out.println("Average: " + marks.average());
    }
    catch (InvalidTestScore e)
    {
      System.out.println(e.getMessage());
    }

  }
}
