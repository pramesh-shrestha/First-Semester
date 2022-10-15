public class Prime
{
  boolean bool = true;
  public void prime(int number)
  {
    for(int i = 2; i < number; i++)
    {
      if(number % i == 0)
      {
        bool = false;
        break;
      }
    }
    if(bool)
      System.out.println("Prime number");
    else
      System.out.println("Not a prime number");

  }
  public static void main(String[] args)
  {
    Prime prime = new Prime();
    prime.prime(67);
  }
}
