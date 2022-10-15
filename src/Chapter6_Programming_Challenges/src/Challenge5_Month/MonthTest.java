package Challenge5_Month;

public class MonthTest
{
  public static void main(String[] args)
  {
    //creating Month object
    Month month1 = new Month(2);
    System.out.println(month1.getMonthName());
    System.out.println(month1);
    //creating another Month object
    Month month2 = new Month("December");
    System.out.println(month2.getMonthNumber());
    System.out.println(month2);

    //comparing two months
    System.out.println("Same month? " + month1.equals(month2));
    System.out.println("Month1 greater than month2? " + month1.greaterThan(month2));
    System.out.println("Month1 smaller than month2? " + month1.lessThan(month2));


  }
}
