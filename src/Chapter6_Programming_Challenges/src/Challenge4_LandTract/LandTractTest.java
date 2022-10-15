package Challenge4_LandTract;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LandTractTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter length and width for tract 1");
    double length1 = input.nextDouble();
    double width1 = input.nextDouble();
    System.out.println("Enter length and width for tract 2");
    double length2 = input.nextDouble();
    double width2 = input.nextDouble();

    //Creating two LandTract objects
    LandTract tract1 = new LandTract(length1, width1);
    LandTract tract2 =  new LandTract(length2, width2);

    //printing areas of two tracts
    System.out.println("Area of tract1: " + tract1.getArea());
    System.out.println("Area of tract2: " + tract2.getArea());

    //comparing if the tracts are of equal size
    System.out.println("Equal area? " + tract1.equals(tract2));
  }
}
