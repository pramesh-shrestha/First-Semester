package TvSeries;

public class Actor
{
  private String name;
  private int numberOfEmmys;
  private int numberOfEpisodes;

  //constructor 1 arg
  public Actor(String name)
  {
    setName(name);
  }
  //getName
  public String getName()
  {
    return name;
  }
  //setName
  public void setName(String name)
  {
    this.name = name;
  }
  //getNumberOfEmmys
  public int getNumberOfEmmys()
  {
    return numberOfEmmys;
  }
  //awardEmmy
  public void awardEmmy()
  {
    numberOfEmmys++;
  }

  //getNumberOfEpisodes
  public int getNumberOfEpisodes()
  {
    return numberOfEpisodes;
  }

  //participateInEpisode
  public void participateInEpisode()
  {
    numberOfEpisodes++;
  }


}
