/*5. BankCharges Class
A bank charges $10 per month plus the following check fees for a commercial checking account:
$.10 for each check if less than 20 checks were written
$.08 for each check if 20 through 39 checks were written
$.06 for each check if 40 through 59 checks were written
$.04 for each check if 60 or more checks were written
The bank also charges an extra $15 if the account balance falls below $400 (before any
check fees are applied). Design a class that stores the ending balance of an account and the
number of checks written. It should also have a method that returns the bank’s service fees
for the month.*/
package Challenge5_BankCharges;

public class BankCharges
{
  private double balance;
  private double charges = 10;
  private int checks;
//  private double withdraw;

  public BankCharges(double balance)
  {
    this.balance = balance;
    checks = 0;
  }

  public double getBalance()
  {
    return balance;
  }

  public void setBalance(double balance)
  {
    this.balance = balance;
  }

  public int getChecks()
  {
    return checks;
  }

  public void setChecks(int checks)
  {
    this.checks = checks;
  }

  //serviceFees
  public double serviceFees()
  {
    double serviceFee = 0;
    if(checks < 20)
    {
      if(balance > 400)
      {
        serviceFee = charges  + (0.10 * checks);
      }
      else
      {
        serviceFee = charges + (0.10 * checks) + 15;
      }
    }
    else  if(checks >= 20 && checks <= 39)
    {
      if(balance > 400)
      {
        serviceFee = charges  + (0.08 * checks);
      }
      else
      {
        serviceFee = charges + (0.08 * checks) + 15;
      }
    }
    else  if(checks >= 40 && checks <= 59)
    {
      if(balance > 400)
      {
        serviceFee = charges  + (0.06 * checks);
      }
      else
      {
        serviceFee = charges + (0.06 * checks) + 15;
      }
    }
    else  if(checks >=60)
    {
      if(balance > 400)
      {
        serviceFee = charges  + (0.04 * checks);
      }
      else
      {
        serviceFee = charges + (0.04 * checks) + 15;
      }
    }
    else
    {
      System.out.println("invalid input");
    }
    return serviceFee;
  }

  //endingBalance
  public void endBalance(double withdraw)
  {
    balance -= withdraw;
  }

  //totalChecks
  public void totalChecks(int numCheck)
  {
    checks = checks + numCheck;
  }

}
