package rainfall;

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
      double rain = input.nextInt();
      rainfall[i] = rain;
    }

    //creating Rainfall object
    Rainfall rainfall1 = new Rainfall(rainfall);
    //displaying total rainfall
    System.out.println(rainfall1.totalRainfall());
    //displaying least rainfall
    System.out.println(rainfall1.leastRain());
    //displaying most rainfall
    System.out.println(rainfall1.mostRain());
    //displaying average raifall
    System.out.println(rainfall1.average());

  }
}
