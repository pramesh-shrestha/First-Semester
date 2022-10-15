package Challenge9_TheSpeedOfSound;

import java.util.Scanner;

public class TheSpeedOfSoundTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println(("Select a medium"));
    System.out.println("------------------");
    System.out.println("1. Air\n2. Water\n3. Steel");
    int choice = input.nextInt();
    System.out.println("Enter a distance");
    double distance = input.nextDouble();

    //creating TheSpeedOfSound object
    TheSpeedOfSound speedOfSound = new TheSpeedOfSound(distance);

    if(choice == 1)
    {
      System.out.println("The time taken in air is: " + speedOfSound.getSpeedInAir());
    }
    else if(choice == 2)
    {
      System.out.println("The time taken in water is: " + speedOfSound.getSpeedInWater());
    }
    else if(choice == 3)
    {
      System.out.println("The time taken in steel is: " + speedOfSound.getSpeedInSteel());
    }
    else
    {
      System.out.println("Select between 1 ,2 and  3.");
    }
  }
}
