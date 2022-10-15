package Challenge1_Area;

import java.util.Scanner;

public class AreaTeest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.printf("Area of the circle is: %.2f ", Area.area(2));
    System.out.print("\nArea of the rectangle is: " + Area.area(2,2));
    System.out.print("\nArea of the cylinder is: " + Area.area(1,5));
  }
}
