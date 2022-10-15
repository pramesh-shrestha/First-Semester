package Challenge5_CourseGrades;

public class Essay extends GradedActivity
{
  private int grammar;
  private int spelling;
  private int correctLength;
  private int content;

  //constructor

  public Essay(int grammar, int spelling, int correctLength, int content)
  {
    super(); //calls the default constructor of superclass
    this.grammar = grammar;
    this.spelling = spelling;
    this.correctLength = correctLength;
    this.content = content;

    //setting score in the superclass
    super.setScore(grammar + spelling + correctLength + content);
  }

  public int getGrammar()
  {
    return grammar;
  }

  public void setGrammar(int grammar)
  {
    this.grammar = grammar;
  }

  public int getSpelling()
  {
    return spelling;
  }

  public void setSpelling(int spelling)
  {
    this.spelling = spelling;
  }

  public int getCorrectLength()
  {
    return correctLength;
  }

  public void setCorrectLength(int correctLength)
  {
    this.correctLength = correctLength;
  }

  public int getContent()
  {
    return content;
  }

  public void setContent(int content)
  {
    this.content = content;
  }

  //toString
  public String toString()
  {
    return (double)(grammar + spelling + correctLength + content) + " ";
  }
}
