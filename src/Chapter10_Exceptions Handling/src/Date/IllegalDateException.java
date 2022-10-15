package Date;

 //Create an exception class IllegalDateException.
public class IllegalDateException extends RuntimeException
{
  public IllegalDateException(String message)
  {
    super(message);
  }
}
