package Workshop2.pricepermonth;

public class PricePerMonthTest
{
  public static void main(String[] args)
  {
    PricePerMonth pricePerMonth = new PricePerMonth(500, 20);
    Car car = new Car("VW", 2022, pricePerMonth);
    Apartment apartment = new Apartment(20, 78, "Hestehaven", "Kolding",
        pricePerMonth);
    House house = new House(3, 2, "Koldiing","Hestehaven", pricePerMonth);
    Person person = new Person("Pramesh", "Shrestha", car, apartment, house);

    System.out.println(pricePerMonth);
    System.out.println(car);
    System.out.println(apartment);
    System.out.println(house);
    System.out.println(person);
  }


}