package Challenge11_geometry_calculator;

import java.util.Scanner;

public class GeometryCalculatorTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("1. Calculate the Area of a Circle");
    System.out.println("2. Calculate the Area of a Rectangle");
    System.out.println("3. Calculate the Area of a Triangle");
    System.out.println("4. Quit");
    System.out.print("Select between 1 and 4:");
    int choice = input.nextInt();

    if(choice == 1)
    {

      System.out.println("Enter radius: ");
      double radius = input.nextDouble();
      if (radius > 0)
      {
        System.out.println(GeometryCalculator.Circle(radius));
      }
      else
      {
        System.out.println("Invalid input, exiting...");
      }

    }

    else if(choice == 2)
    {
      System.out.print("Enter length: ");
      double length = input.nextDouble();
      System.out.print("Enter width: ");
      double width = input.nextDouble();

      if(length > 0 && width > 0)
      {
        System.out.println(GeometryCalculator.Rectangle(length,width));
      }
      else
      {
        System.out.println("Invalid input, exiting...");
      }
    }

    else if(choice == 3)
    {
      System.out.print("Enter base: ");
      double base = input.nextDouble();
      System.out.print("Enter height: ");
      double height = input.nextDouble();

      if(base > 0 && height > 0)
      {
        System.out.println(GeometryCalculator.Triangle(base,height));
      }
      else
      {
        System.out.println("Invalid input, exiting...");
      }
    }
    else if(choice == 4)
    {
      System.out.println("Quiting");
    }
    else
    {
      System.out.println("Choice out of range");
    }


  }
}
