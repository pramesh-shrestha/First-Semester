package Workshop5_ArrayList.FootballlClub;

public class FootballPlayer
{
  private String name;
  private int skill;
  private int number;
  private String fieldPosition;
  private boolean isCaptain;

  //constructor
  public FootballPlayer(String name, int skill)
  {
    this.name = name;
    this.skill = skill;
  }

  //getName
  public String getName()
  {
    return name;
  }
  //getNumber
  public int getNumber()
  {
    return number;
  }

  //assignNumber
  public void assignNumber(int number)
  {
    this.number = number;
  }

  //getSkill
  public int getSkill()
  {
    return skill;
  }

  //train
  public void train()
  {
    skill++;
  }

  //getFieldPosition
  public String getFieldPosition()
  {
    return fieldPosition;
  }

  //setFieldPosition
  public void setFieldPosition(String position)
  {
    fieldPosition = position;
  }

  //getIsCaptain
  public boolean getIsCaptain()
  {
    return isCaptain;
  }

  //setIsCaptain
  public void setIsCaptain(boolean isCaptain)
  {
    this.isCaptain = isCaptain;
  }
  //toString

  public String toString()
  {
    return "FootballPlayer{" + "name='" + name + '\'' + ", skill=" + skill
        + ", number=" + number + ", fieldPosition='" + fieldPosition + '\''
        + ", isCaptain=" + isCaptain + '}';
  }
}
