/*2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
Here is a sample run:

Enter a degree in Celsius:
43 Celsius is 109.4 Fahrenheit
*/

import java.util.Scanner;
public class CelsiusToFahrenheit
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a degree in Celsius: ");
    float celsius = input.nextFloat();
    float fahrenheit = (9.0f / 5) * celsius + 32;
    System.out.println(celsius + "° Celsius is " + fahrenheit + "° Fahrenheit");
  }
}