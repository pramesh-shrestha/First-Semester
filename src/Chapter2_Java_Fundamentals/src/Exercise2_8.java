/*Modify the program you made in Exercise 2.07 so that all values can
be input from the keyboard, rather than being created as literals in the
program. The user should be able to input:
- The number of purchased shares
- The price per share of the purchased stock
- The number of sold shares
- The price per share of the sold stock
- The commission for the stockbroker*/

import java.util.Scanner;
public class Exercise2_8
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of purchased shares: ");
    double purchasedStock = input.nextDouble();
    System.out.print("Enter purchase price per share: ");
    double stockPurchasePrice = input.nextDouble();
    System.out.print("Enter sold shares: ");
    double soldStock = input.nextDouble();
    System.out.print("Enter selling price per share: ");
    double stockSalesPrice = input.nextDouble();
    System.out.print("Enter commission rate: ");
    double commission = input.nextDouble();
    //calculation for stock payment
    double moneyPaid = purchasedStock * stockPurchasePrice;
    //commission paid
    double commissionPaid1 = commission/100 * moneyPaid;
    //total cost for Joe
    double totalMoneyPaid = moneyPaid + commissionPaid1;

    //calculation for stock sales
    double moneyEarned = soldStock * stockSalesPrice;
    //commission paid
    double commissionPaid2 = commission/100 * moneyEarned;
    //total earning
    double totalMoneyReceived = moneyEarned - commissionPaid2;

    //calculating profit or loss
    double total = totalMoneyReceived - totalMoneyPaid;

    if(total > 0)
    {
      System.out.printf("The profit is $%.2f\n", total);
    }
    else if(total < 0)
    {
      System.out.printf("The loss is $%.2f\n", total);
    }
    else
    {
      System.out.println("Neither profit nor loss");
    }
  }
}
