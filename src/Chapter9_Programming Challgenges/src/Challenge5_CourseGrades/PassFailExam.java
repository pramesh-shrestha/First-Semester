package Challenge5_CourseGrades;

public class PassFailExam extends GradedActivity
{
  private int totalQuestions;
  private int passingScore;
  private int correctAns;

  public PassFailExam(int correctAns)
  {
    super(); //calls default constructor of superclass
    totalQuestions = 10;
    passingScore = 70;
    this.correctAns = correctAns;
    setScore(correctAns);

  }

  public int getCorrectAns()
  {
    return correctAns;
  }

  public void setCorrectAns(int correctAns)
  {
    this.correctAns = correctAns;
  }

  //pass/fail
  public String passFail()
  {
    if(correctAns >= 70)
    {
      return "Pass";
    }
    else
    {
      return "fail";
    }
  }
}
