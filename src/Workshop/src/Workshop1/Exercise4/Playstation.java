package Workshop1.Exercise4;

public class Playstation
{
  private String model;
  private Game game;

  //creating two args construction
  public Playstation(Game game, String model)
  {
    this.game = game;
    this.model = model;
  }
  //creating get methods
  public Game getGame()
  {
    return game;
  }
  public String getModel()
  {
    return model;
  }

  //set method for game
  public void setGame(Game game)
  {
    this.game = game;
  }

  //string method

  public String toString()
  {
    return "Playstation{" + "model='" + model + '\'' + ", game=" + game + '}';
  }
}
