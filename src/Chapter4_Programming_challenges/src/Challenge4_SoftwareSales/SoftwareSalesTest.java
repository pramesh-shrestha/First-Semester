package Challenge4_SoftwareSales;

import java.util.Scanner;

public class SoftwareSalesTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter quantity: ");
    int quantity = input.nextInt();

    //creating SoftwareSales object
    SoftwareSales softwareSales = new SoftwareSales(quantity);
    System.out.println("The total cost is: " + softwareSales.totalCost());
  }
}
