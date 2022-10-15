package TestScoreCustomException;

public class InvalidTestScore extends RuntimeException
{
  public InvalidTestScore(String message)
  {
    super(message);
  }
}
