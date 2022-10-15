/* Modify the program you made last time in Exercise 1.05 so that it now
asks the user to input the sales tax, and the prices for the three items.
Then calculate and print out the tax and total prices like before.*/
import java.util.Scanner;
public class Exercise2_3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter sales tax: ");
    double  salesTax = input.nextDouble();
    System.out.print("Enter price of first item: ");
    double firstItem = input.nextDouble();
    System.out.print("Enter price of second item: ");
    double secondItem = input.nextDouble();
    System.out.print("Enter price of third item: ");
    double thirdItem = input.nextDouble();
    double firstItemTax = salesTax/100 * firstItem;
    double secondItemTax = salesTax/100 * secondItem;
    double thirdItemTax = salesTax/100 * thirdItem;
    double firstItemPrice = firstItemTax + firstItem;
    double secondItemPrice = secondItemTax + secondItem;
    double thirdItemPrice = thirdItemTax + thirdItem;
    System.out.printf("The tax of first item is %.2f\n", firstItemTax);
    System.out.printf("The tax of second item is %.2f\n", secondItemTax);
    System.out.printf("The tax of third item is %.2f\n", thirdItemTax);
    System.out.printf("The price of first item is %.2f\n", firstItemPrice);
    System.out.printf("The price of second item is %.2f\n", secondItemPrice);
    System.out.printf("The price of third item is %.2f\n", thirdItemPrice);
  }
}
