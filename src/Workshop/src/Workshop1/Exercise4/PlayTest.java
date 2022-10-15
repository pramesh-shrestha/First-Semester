package Workshop1.Exercise4;

public class PlayTest
{
  public static void main(String[] args)
  {
    //creating the Game object first because Playstation class uses the Game object
    Game game1 = new Game("Fifa22","Sports", 4);
    Game game2 = new Game("God of War","Action",8);
    //crating one Playstation object and one Player object
    Playstation playstation = new Playstation(game1, "PS5");
    Player player = new Player("bestGamer12", playstation);

    //comparing two games
    System.out.println(game1.equals(game2));
    //printing player information
    System.out.println(player);

    //calling changeGame() method to change the game
    player.changeGame(game2);
    System.out.println(player);

  }
}

