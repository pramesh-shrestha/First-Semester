/*(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
Enter a value for feet: 16.5
16.5 feet is 5.0325 meters */

import java.util.Scanner;

public class FeetIntoMeters
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a value for feet: ");
    float feet = input.nextFloat();
    float meters = feet * 0.305f;
    // Setting to 4 decimal place
    System.out.println(feet + " is " + String.format("%.4f", meters) + " meters");
  }
}
