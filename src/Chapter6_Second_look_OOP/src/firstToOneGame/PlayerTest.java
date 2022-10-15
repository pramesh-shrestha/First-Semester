package firstToOneGame;

public class PlayerTest
{
  public static void main(String[] args)
  {
    //creating Die object
    Die die = new Die(6);
    //creating 2 Player objects
    Player player1 = new Player("John", die);
    Player player2 = new Player("Pramesh", die);

    while(true)
    {
      player1.roll();
      if(player1.getPoint() == 1) {
        System.out.println("Winner: " + player1.getName());
        break;
      }
      player2.roll();
      if(player2.getPoint() == 1)
      {
        System.out.println("Winner: " + player2.getName());
        break;
      }
    }

  /*  if(player1.getPoint() == 1) {
      System.out.println("Winner: " + player1.getName());
    }
    else
    {
      System.out.println("Winner: " + player2.getName());
    }

   */
  }
}
