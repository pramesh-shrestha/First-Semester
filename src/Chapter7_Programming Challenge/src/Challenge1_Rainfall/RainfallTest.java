package Challenge1_Rainfall;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RainfallTest
{
  public static void main(String[] args)
  {
    double[] rainfall = new double[12];
    Scanner input = new Scanner(System.in);
    System.out.println("Enter rainfall for 12 months:");
    for(int i = 0; i < rainfall.length; i++)
    {
      boolean flag = true;
      do{
        try
        {
          double rain = input.nextInt();
          rainfall[i] = rain;
          if(rainfall[i] < 0)
          {
            throw new NegativeNumberException("Invalid number, please enter positive number");
          }
          flag = false;
        }
        catch (NegativeNumberException e)
        {
          System.out.println(e.getMessage());
        }
      }while (flag);
    }

    //creating Rainfall object
    Rainfall rainfall1 = new Rainfall(rainfall);
    //displaying total rainfall
    System.out.println("Total rainfall: " + rainfall1.totalRainfall());
    //displaying least rainfall
    System.out.println("Least rainfall" + rainfall1.leastRain());
    //displaying most rainfall
    System.out.println("Most rainfall" +rainfall1.mostRain());
    //displaying average raifall
    System.out.printf("Average rainfall %.2f", rainfall1.average());

  }
}
