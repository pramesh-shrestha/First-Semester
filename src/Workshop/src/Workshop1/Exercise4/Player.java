package Workshop1.Exercise4;

public class Player
{
  private String userName;
  private Playstation playstation;

  //creating two args constructor
  public Player(String userName, Playstation playstation)
  {
    this.userName = userName;
    this.playstation = playstation;
  }
  //get methods
  public String getUserName()
  {
    return userName;
  }
  public Playstation getPlaystation()
  {
    return playstation;
  }
  public Game getGame()
  {
    return playstation.getGame();
  }
  //change game method
  public void changeGame(Game game2)
  {
    playstation.setGame(game2);
  }

  public String toString()
  {
    return "Player{" + "userName='" + userName + '\'' + ", playstation="
        + playstation + '}';
  }
}
