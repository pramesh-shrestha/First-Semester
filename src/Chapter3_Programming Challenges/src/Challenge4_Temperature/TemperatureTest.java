package Challenge4_Temperature;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureTest
{
  public static void main(String[] args)
  {
    //input from a user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any temperature in Fahrenheit: ");
    double fahr = input.nextDouble();

    //creating an instance of Temperature class
    Temperature temperature = new Temperature(fahr);

    //calling getCelsius
    double celsius = temperature.getCelsius();
    //calling getKelvin
    double kelvin = temperature.getKelvin();

    //creating decimal format clas to format double to 2 decimal place
    DecimalFormat formatter = new DecimalFormat("0.00");

    //displaying the temperatures
    System.out.println("The temperature in Celsius is: " + formatter.format(celsius) + "ºC");
    System.out.println("The temperature in Kelvin is: " + formatter.format(kelvin)+ "ºK");
  }
}
