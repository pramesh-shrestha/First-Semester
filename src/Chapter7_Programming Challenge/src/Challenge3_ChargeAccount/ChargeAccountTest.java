package Challenge3_ChargeAccount;

import java.awt.*;
import java.util.Scanner;

public class ChargeAccountTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an account number");
    int account = input.nextInt();

    //creating ChargeAccount object
    ChargeAccount chargeAccount = new ChargeAccount();
    //checking for valid account number
    if(chargeAccount.binarySearch(account))
    {
      System.out.println("Valid");
    }
    else
    {
      System.out.println("Invalid");
    }

  }
}
