public class PlayerTest
{
  public static void main(String[] args)
  {
    Die die = new Die(6);
    Player player1 = new Player("Pramesh", die);
    Player player2 = new Player("Priyanka", die);

    while (true)
    {
      player1.roll();
      if (player1.getPoint() == 1)
      {
        System.out.println("Winner: " + player1);
        break;
      }
      player2.roll();
      if(player2.getPoint() == 1)
      {
        System.out.println("Winner: " + player2);
      }
    }


  }
}

