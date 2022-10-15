/*In Denmark, the sales tax is 25%. Write a program that calculates and prints
the tax and the total price of items that before the added tax cost 80, 140,
and 230 kr., respectively. */

public class Exercise1_5
{
  public static void main(String[] args)
  {
    float salesTax = 0.25f;
    float item1, item2, item3;
    float tax1, tax2, tax3;
    tax1 = salesTax * 80;
    tax2 = salesTax * 140;
    tax3 = salesTax * 230;
    item1 = 80 + tax1;
    item2 = 140 + tax2;
    item3 = 230 + tax3;
    System.out.println("Tax of item 1 is: " + tax1);
    System.out.println("Tax of item 2 is: " + tax2);
    System.out.println("Tax of item 1 is: " + tax3);
    System.out.println("Total price of item 1 is: " + item1);
    System.out.println("Total price of item 1 is: " + item2);
    System.out.println("Total price of item 1 is: " + item3);
  }
}
