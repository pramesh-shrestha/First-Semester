package Challenge5_CourseGrades;

public class FinalExam extends GradedActivity
{
  private int totalQuestions;
  private int missedQuestions;

  public FinalExam(int totalQuestions, int missedQuestions)
  {
    this.totalQuestions = totalQuestions;
    this.missedQuestions = missedQuestions;

    int pointsPerQuestion = 100 / totalQuestions;
    double score = 100 - (missedQuestions * pointsPerQuestion);
    //setting score in the superclass

    super.setScore(score);
  }

  public int getTotalQuestions()
  {
    return totalQuestions;
  }

  public void setTotalQuestions(int totalQuestions)
  {
    this.totalQuestions = totalQuestions;
  }

  public int getMissedQuestions()
  {
    return missedQuestions;
  }

  public void setMissedQuestions(int missedQuestions)
  {
    this.missedQuestions = missedQuestions;
  }
}
