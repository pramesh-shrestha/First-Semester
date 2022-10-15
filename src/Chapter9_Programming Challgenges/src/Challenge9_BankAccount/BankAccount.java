package Challenge9_BankAccount;

public abstract class BankAccount
{
  private double balance;
  private double numOfDepositThisMonth;
  private double numOfWithdrawals;
  private double annualInterestRate;
  private double monthlyServiceCharge;

  /**constructor*/
  public BankAccount(double balance, double annualInterestRate)
  {
    this.balance = balance;
    this.annualInterestRate = annualInterestRate;
  }

  /**deposit*/
  public void deposit(double deposit)
  {
    balance += deposit;
    numOfDepositThisMonth++;
  }

  /**withdraw*/
  public void withdraw(double amount)
  {
    balance -= amount;
    numOfWithdrawals++;
  }

  /**calcInterest*/
  public void calcInterest()
  {
    double monthlyInterestRate =  (annualInterestRate/12);
    double monthlyInterest = balance * monthlyInterestRate;
    balance += monthlyInterest;
  }

  /**monthlyProcess*/
  public void monthlyProcess()
  {
    balance -= monthlyServiceCharge;
    calcInterest();
    setNumOfDepositThisMonth(0);
    setNumOfWithdrawals(0);
    setMonthlyServiceCharge(0);
  }

  public double getBalance()
  {
    return balance;
  }

  public void setBalance(double balance)
  {
    this.balance = balance;
  }

  public double getNumOfDepositThisMonth()
  {
    return numOfDepositThisMonth;
  }

  public void setNumOfDepositThisMonth(double numOfDepositThisMonth)
  {
    this.numOfDepositThisMonth = numOfDepositThisMonth;
  }

  public double getNumOfWithdrawals()
  {
    return numOfWithdrawals;
  }

  public void setNumOfWithdrawals(double numOfWithdrawals)
  {
    this.numOfWithdrawals = numOfWithdrawals;
  }

  public double getAnnualInterestRate()
  {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(double annualInterestRate)
  {
    this.annualInterestRate = annualInterestRate;
  }

  public double getMonthlyServiceCharge()
  {
    return monthlyServiceCharge;
  }

  public void setMonthlyServiceCharge(double monthlyServiceCharge)
  {
    this.monthlyServiceCharge = monthlyServiceCharge;
  }
}
