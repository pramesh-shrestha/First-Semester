package Person;

public class FullDegreeStudent extends Student
{
  private int semester;

  public FullDegreeStudent(String name, int id, char grade, int semester)
  {
    super(name, id, grade);
    this.semester = semester;
  }

  public int getSemester()
  {
    return semester;
  }

  public void setSemester(int semester)
  {
    this.semester = semester;
  }

  //toString
  public String toString()
  {
    return super.toString() + "Semester: " + semester;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof FullDegreeStudent))
    {
      return false;
    }
    FullDegreeStudent other = (FullDegreeStudent) obj;
    return super.equals(other) && semester == other.semester;
  }
}
