/*(Compute the volume of a cylinder) Write a program that reads in the radius and
length of a cylinder and computes the area and volume using the following formulas:
area = radius * radius *
volume = area * length
Here is a sample run:

Enter the radius and length of a cylinder: 5.5 12
The area is 95.0331
The volume is 1140.4
*/

import java.util.Scanner;

public class VolumeOfACylinder
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius and length of a cylinder: ");
    float radius = input.nextFloat();
    float length = input.nextFloat();
    //Casting to float
    float area = (float) (radius * radius * Math.PI);
    float volume = area * length;
    //Setting to 4 and 1 decimal places
    System.out.println("The area is " + String.format("%.4f", area));
    System.out.println("The volume is " + String.format("%.1f", volume));
  }
}

