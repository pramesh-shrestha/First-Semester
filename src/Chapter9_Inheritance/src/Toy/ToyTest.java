package Toy;

public class ToyTest
{
  public static void main(String[] args)
  {
    Toy[] toys = new Toy[3];
    toys[0] = new Lego(5,100);
    toys[1] = new Football(14,5);
    toys[2] = new Handball(15, 4);

    //running through the array calling the play method for each toy
    for(int i = 0; i < toys.length; i++)
    {
      System.out.println(toys[i].play());
    }
  }
}
