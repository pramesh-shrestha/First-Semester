package Challenge9_BankAccount;

public class SavingAccount extends BankAccount
{
  private boolean status;

  /**constructor*/
  public SavingAccount(double balance, double annualInterestRate)
  {
    super(balance, annualInterestRate);

    /**status of account, where false means inactive and true means active*/
    boolean status;
    if(super.getBalance() < 25)
    {
      status = false; /**inactive*/
    }
    else
    {
      status = true; /**active*/
    }
    this.status = status;
  }

  /**The withdraw method withdraws an amount
   from the account if the account is active.
   If the account is inactive, no withdrawal
   is made.(Overrides the super
   class method.)*/

  public void withdraw(double amount)
  {
    if(status)
    {
      /**calling method of superclass*/
      super.withdraw(amount);
      if(getBalance() < 25)
      {
        status = false;
      }
    }
  }

  /** The deposit method makes a deposit
   into the account. If the account is
   inactive and the deposit raises the
   balance to $25 or more, the account
   is made active. (Overrides the super
   class method.)*/
  public void deposit(double amount)
  {
    super.deposit(amount);
    if(!status)
    {
      /**calling method of superclass*/
      if(getBalance() > 25)
      {
        status = true;
      }
    }
    /**checking if balance is above 25 after deposit, if it is, change the status to active*/
  }

  /**
   The monthlyProcess method calls the super
   class's monthlyProcess method. If the number
   of withdrawals is greater tha n 4, the
   monthly service charges are increased.
   */
  public void monthlyProcess()
  {
    double extraWithdrawals = 0;
    if(getNumOfWithdrawals() > 4)
    {
      /**This gives the extra withdrawals made in a month*/
      extraWithdrawals = getNumOfWithdrawals() - 4;
      /**adds extra cost  to the service charge*/
      double extraCharge = getMonthlyServiceCharge() + extraWithdrawals;
      setMonthlyServiceCharge(extraCharge);
      /**deduct from the balance and check if the balance is less than 25, and if it is make account inactive */
      double balance = getBalance() - extraCharge;
      setBalance(balance);
      if(balance < 25)
      {
        status = false;
      }
    }
    super.monthlyProcess();
  }

}
