package carEqualMethodModify;

import car.Car;

public class CarTest
{
  public static void main(String[] args)
  {
    //creating Car object
    car.Car car1 = new car.Car("VW", "Polo", "Black", "CN61032", 2019);
    car.Car car2 = car1.copy();
    car.Car car3 = new car.Car("BMW", "A7", "Blue", 2022 );
    Car car4 = car3.copy();
    System.out.println(car1);
    //changing color and lisence number of car2
    car2.setColor("Red");
    car2.setLicenseNumber("BA25123");
    System.out.println(car2);
    //setting license number of car3
    car3.setLicenseNumber("JK12369");
    System.out.println(car3);
    //setting license number of car4
    car4.setLicenseNumber("GF35695");
    System.out.println(car4);


  }
}
