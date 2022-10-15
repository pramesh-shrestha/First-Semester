package Challenge9_Circle;

import java.util.Scanner;

public class CircleTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter radius: ");
    double radius = input.nextDouble();

    //creating Circle object
    Circle circle = new Circle(radius);
    //printing area
    System.out.println("Area: " + circle.getArea());
    //printing diameter
    System.out.println("Diameter: " + circle.getDiameter());
    //printing circumference
    System.out.println("Circumference: " + circle.getCircumference());
    System.out.println();
    //printing out everything
    System.out.println("Printing out all the information.");
    System.out.println("---------------------------------");
    System.out.println(circle);
  }
}
