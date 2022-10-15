package DAte;

import java.util.Scanner;

public class Test
{
  public static void main(String[] args)
  {
    boolean flag = false;
    Scanner input = new Scanner(System.in);
    do {
      System.out.println("Enter a day");
      int day = input.nextInt();
      System.out.println("Enter a month");
      int month = input.nextInt();
      System.out.println("Enter a year");
      int year = input.nextInt();
      try {
        Date date = new Date(day,month,year);
        System.out.println(date);
        flag = true;
      }
      catch (IllegalDateException e)
      {
        System.out.println(e.getMessage());
      }
    }while(!flag);



  }
}
