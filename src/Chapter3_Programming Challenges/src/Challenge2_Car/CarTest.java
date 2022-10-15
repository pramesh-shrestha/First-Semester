package Challenge2_Car;

public class CarTest
{
  public static void main(String[] args)
  {
    //creating a Car object
    Car car = new Car(2022,"BMW");

    //calling the accelerator method five times
    car.accelerator();
    System.out.println("The current speed is " + car.getSpeed());

    car.accelerator();
    System.out.println("The current speed is " + car.getSpeed());

    car.accelerator();
    System.out.println("The current speed is " + car.getSpeed());

    car.accelerator();
    System.out.println("The current speed is " + car.getSpeed());

    car.accelerator();
    System.out.println("The current speed is " + car.getSpeed());

    //calling the brake method five times
    car.brake();
    System.out.println("The current speed after braking is " + car.getSpeed());

    car.brake();
    System.out.println("The current speed after braking is " + car.getSpeed());

    car.brake();
    System.out.println("The current speed after braking is " + car.getSpeed());

    car.brake();
    System.out.println("The current speed after braking is " + car.getSpeed());

    car.brake();
    System.out.println("The current speed after braking is " + car.getSpeed());

  }
}
