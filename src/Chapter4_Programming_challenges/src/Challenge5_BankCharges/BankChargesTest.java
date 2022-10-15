package Challenge5_BankCharges;

public class BankChargesTest
{
  public static void main(String[] args)
  {
    //creating BankCharges object
    BankCharges bankCharges = new BankCharges(1000);

    //making check and withdrawing money
    for(int i= 0; i < 8; i++)
    {
      bankCharges.totalChecks(1);
      bankCharges.endBalance(100);
    }
    System.out.println("Total checks: " + bankCharges.getChecks());
    System.out.println("End balance: " + bankCharges.getBalance());
    System.out.println("Service fee: " + bankCharges.serviceFees());


  }
}
