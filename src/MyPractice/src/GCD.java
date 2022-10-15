import java.util.ArrayList;

public class GCD
{
  public void gcd(int x, int y)
  {
    int gcd = 1;
   int min = Math.min(x,y);
   for(int i = 2; i <= min; i++)
   {
     if(x % i == 0 && y % i == 0)
     {
       gcd = i;
     }
   }
    System.out.println(gcd);
  }

  public static void main(String[] args)
  {
    GCD gcd = new GCD();
    gcd.gcd(25,15);
  }
}
