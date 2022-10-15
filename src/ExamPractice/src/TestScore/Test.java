package TestScore;

import java.util.Scanner;

public class Test
{
  public static void main(String[] args)
  {
    int[] arr = {1,2,3,102,5};


      try
      {
        TestScore testScore = new TestScore(arr);
        System.out.println(testScore);
      }
      catch (IllegalArgumentException e)
      {
        System.out.println(e.getMessage());
      }

  }
}
