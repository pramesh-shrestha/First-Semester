package Die;

public class DiceGame
{
  private Die die1;
  private Die die2;

  public DiceGame(Die die1, Die die2)
  {
    this.die1 = die1;
    this.die2 = die2;
  }

  public void play()
  {
   die1.roll();
   die2.roll();
  }

  public Die getDie1()
  {
    return die1;
  }

  public Die getDie2()
  {
    return die2;
  }
}
