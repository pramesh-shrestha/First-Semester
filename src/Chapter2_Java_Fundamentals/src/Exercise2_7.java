/*Stock Transaction Program
Last month Joe purchased some stock in Acme Software, Inc. Here are the details of the
purchase:
-The number of shares that Joe purchased was 1000
-When Joe purchased the stock, he paid $32.87 per share.
-Joe paid his stockbroker a commission that amounted to 2% of the amount he paid for the stock

Two weeks later Joe sold the stock.Here are the details of the sale:
-The number of shares that Joe sold was 1000
-He sold the stock for $33.92 per share
-He paid his stockbroker another commission that amounted to 2% of the amount he received for the stock

Write a program that displays the following information:
-The amount of money Joe paid for the stock
-The amount of commission Joe paid his broker when he bought the stock
-The amount that Joe sold the stock for
-The amount of commission Joe paid his broker when he sold the stock
-Display the amount of profit that Joe made after selling his stock and paying the two commissions to his
broker. (If the amount of profit that your program displays is a negative number, then Joe lost money on
the transaction)

*/

public class Exercise2_7
{
  public static void main(String[] args)
  {
    //assign constant value to variable
    final int stock = 1000;
    final double stockPurchasePrice = 32.87;
    final double stockSalesPrice = 33.92;
    final double commission = 0.02;

    //calculation for stock payment
    double moneyPaid = stock * stockPurchasePrice;
    //commission paid
    double commissionPaid1 = commission * moneyPaid;
    //total cost for Joe
    double totalMoneyPaid = moneyPaid + commissionPaid1;

    //calculation for stock sales
    double moneyEarned = stock * stockSalesPrice;
    //commission paid
    double commissionPaid2 = commission * moneyEarned;
    //total earning
    double totalMoneyReceived = moneyEarned - commissionPaid2;

    //calculating profit or loss
    double total = totalMoneyReceived - totalMoneyPaid;

    if(total > 0) {
      System.out.printf("The profit is $%.2f\n", total);
    } else if(total < 0){
      System.out.printf("The loss is $%.2f\n", total);
    } else {
      System.out.println("Neither profit nor loss");
    }
  }
}
