/*A software company sells a package that retails for $99. Quantity discounts are given
according to the following table:
Quantity      Discount
10–19           20%
20–49           30%
50–99           40%
100 or more     50%
Design a class that stores the number of units sold and has a method that returns the total
cost of the purchase.*/
package Challenge4_SoftwareSales;

public class SoftwareSales
{
  private int unitsSold;
  private final int retailPrice = 99;

  public SoftwareSales(int unitsSold)
  {
    this.unitsSold = unitsSold;
  }

  public int getUnits()
  {
    return unitsSold;
  }

  public void setUnits(int unitsSold)
  {
    this.unitsSold = unitsSold;
  }

  //totalCost
  public double totalCost()
  {
    double totalCost = 0;
    double cost = unitsSold * retailPrice;
    if(unitsSold < 10 && unitsSold > 0)
    {
      totalCost = cost;
    }
    else if(unitsSold > 9 && unitsSold < 20)
    {
      totalCost = cost - (0.20 * cost);
    }
    else if(unitsSold > 19 && unitsSold < 50)
    {
      totalCost = cost - (0.30 * cost);
    }
    else if(unitsSold > 49 && unitsSold < 100)
    {
      totalCost = cost - (0.40 * cost);
    }
    else if(unitsSold > 99)
    {
      totalCost = cost - (0.50 * cost);
    }
    else{
      System.out.println("invalid input");
    }
    return totalCost;
  }

}
