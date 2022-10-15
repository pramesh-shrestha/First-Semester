package Workshop2.pricepermonth;

public class PricePerMonth
{
  private double totalPrice;
  private int taxes;

  public PricePerMonth(double totalPrice, int taxes)
  {
    this.totalPrice = totalPrice;
    this.taxes = taxes;
  }
  public void setTaxes(int taxes)
  {
    this.taxes = taxes;
  }
  public double taxesInMoney()
  {
   return (taxes/100.0) * totalPrice;
  }
  public String toString()
  {
    return "Total price: " + totalPrice + " Taxes: " + taxesInMoney();
  }
}
