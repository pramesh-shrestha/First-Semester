package Part2.Exercise4_4;
import java.util.Scanner;
public class TemperatureTest
{
  public static void main(String[] args)
  {
    //creating Scanner class object
    Scanner input = new Scanner(System.in);
    System.out.print("Enter temperature in Fahrenheit: ");
    double degree = input.nextDouble();

    //creating or instantiating Temperature class object and providing one argument from the user
    Temperature temp = new Temperature(degree);

    //Calling the getCelsius() method and displaying output
    System.out.println("Temperature in Celsius: " + temp.getCelsius() + " °C");

    //Calling the getKelvin() method and displaying output
    System.out.println("Temperature in Kelvin: " + temp.getKelvin() + " °K");
  }
}
