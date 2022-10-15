package Workshop1.Exercise4;

public class Game
{
  private String game;
  private String gameGenre;
  private int numberOfPlayers;

  //creating 2 args constructor
  public Game(String game, String gameGenre, int numberOfPlayers)
  {
    this.game = game;
    this.numberOfPlayers = numberOfPlayers;
    this.gameGenre = gameGenre;
  }
  //creating get methods for all three fields
  public String getGame()
  {
    return game;
  }
  public String getGameGenre()
  {
    return gameGenre;
  }
  public int getNumberOfPlayers()
  {
    return numberOfPlayers;
  }

  //creating toString method

  public String toString()
  {
    return "Game{" + "game='" + game + '\'' + ", gameGenre='" + gameGenre + '\''
        + ", numberOfPlayers=" + numberOfPlayers + '}';
  }
}
