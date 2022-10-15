import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigDecimal
{
  public static void main(String[] args)
  {
    //to divide two numbers and get rounded value
    //Divide 20 by 3

    BigDecimal dividend = BigDecimal.valueOf(20).setScale(2);
    BigDecimal divisor = BigDecimal.valueOf(3);
    BigDecimal division = dividend.divide(divisor, RoundingMode.HALF_UP);
    System.out.println(division);

    //Subtracting floating number
    BigDecimal num1 = BigDecimal.valueOf(3.1).setScale(2);
    BigDecimal num2 = BigDecimal.valueOf(1.21).setScale(2);
    System.out.println(num1.subtract(num2));
  }
}
