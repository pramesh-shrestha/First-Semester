package TvSeries;

import java.util.ArrayList;

public class TvSeries
{
  private String title;
  private int numberOfEpisodes;
  private ArrayList<Actor> actors;

  //1 arg constructor
  public TvSeries(String title)
  {
    this.title = title;
    numberOfEpisodes = 0;
    actors = new ArrayList<>();
  }
  //hireActor
  public void hireActor(Actor actor)
  {
    actors.add(actor);
  }
  //getNumberOfActors
  public int getNumberOfActor()
  {
    return actors.size();
  }
  //getActor
  public Actor getActor(int index)
  {
    return actors.get(index);
  }
  //awardEmmy
  public void awardEmmy(String name)
  {
    Actor actor = new Actor(name);
    if(actors.contains(name))
    {
      actor.awardEmmy();
    }
  }
  //makeNextEpisode
  public void makeNextEpisode()
  {
    numberOfEpisodes++;
  }

  //getEmmyWinners

  //toString

}
