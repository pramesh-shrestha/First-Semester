package Challenge7_QuarterlySalesStatistics;

import java.util.Scanner;

public class QuarterlySalesStatisticsTest
{
  public static void main(String[] args)
  {
    final int division = 6;
    final int quarter = 4;
    double[][] sales = new double[division][quarter];

    Scanner input  = new Scanner(System.in);
    System.out.println("Enter quarterly sales: ");

    //getting sales figures from user and entering to the 2D array
    for(int i = 0; i < division; i++)
    {
      for(int j = 0; j < quarter; j++)
      {
        double sale = input.nextDouble();
        sales[i][j] = sale;
      }
    }

    //Displaying list of sales figures by division
    for(int i = 0; i < division; i++)
    {
      if(i == 0)
      {
        System.out.println("Quarterly sales of Food Division");
      }
      else if(i == 1)
      {
        System.out.println("Quarterly sales of Electronic Division");
      }
      else if(i == 2)
      {
        System.out.println("Quarterly sales of Automobile Division");
      }
      else if(i == 3)
      {
        System.out.println("Quarterly sales of Furniture Division");
      }
      else if(i == 4)
      {
        System.out.println("Quarterly sales of Paper Division");
      }
      else
      {
        System.out.println("Quarterly sales of Pet Division");
      }
      for(int j = 0; j < quarter; j++)
      {
        System.out.print(sales[i][j] + " ");
      }
      System.out.println();
    }
  }
}
