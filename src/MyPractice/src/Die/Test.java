package Die;

public class Test
{
  public static void main(String[] args)
  {
    Die die1 = new Die();
    Die die2= new Die();
    DiceGame diceGame = new DiceGame(die1,die2);
    diceGame.play();

    int value1 = die1.getFaceValue();
    int value2 = die2.getFaceValue();
    if(value1 + value2 == 7)
    {
      System.out.println("you win");
    }
    else
    {
      System.out.println("you lose");
    }
    System.out.println(value1 + value2);

  }
}
