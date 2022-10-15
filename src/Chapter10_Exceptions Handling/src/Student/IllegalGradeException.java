package Student;

//Implement a runtime exception class called Student.IllegalGradeException
public class IllegalGradeException extends RuntimeException
{
  public IllegalGradeException(String message)
  {
    super(message);
  }
}

