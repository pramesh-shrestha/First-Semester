package Challenge1_Rainfall;

/*1. rainfall.Rainfall Class
Write a RainFall class that stores the total rainfall for each of 12 months into an array of
doubles. The program should have methods that return the following:
● total rainfall for the year
● the average monthly rainfall
● the month with the most rain
● the month with the least rain
Demonstrate the class in a complete program.
Input Validation: Do not accept negative numbers for monthly rainfall figures.*/
public class Rainfall
{
  private double[] rainfall;

  public Rainfall(double[] rainfall)
  {
    this.rainfall = rainfall;
  }
   //total rains in a year
  public double totalRainfall()
  {
    double total = 0;
    for(int i = 0; i < rainfall.length; i++)
    {
      total = total + rainfall[i];
    }
    return  total;
  }

  //average rainfall in a month
  public double average()
  {
    double average = totalRainfall()/rainfall.length;
    return average;
  }

  //the month with most rain
  public double mostRain()
  {
    double most = rainfall[0];
    for(int i = 1; i < rainfall.length; i++)
    {
      if(rainfall[i] > most)
      {
        most = rainfall[i];
      }
    }
    return  most;
  }

  //month with least rain
  public double leastRain()
  {
    double least = rainfall[0];
    for(int i = 1; i < rainfall.length; i++)
    {
      if(rainfall[i] < rainfall[0])
      {
        least = rainfall[i];
      }
    }
    return least;
  }

}
