package Part2.Exercise4_3;

public class CarTest
{
  public static void main(String[] args)
  {
    //Creating one Car object and initializing two fields
    Car car = new Car(2021, "Tesla");

    //calling accelerator() method and displaying first speed
    car.accelerator();
    System.out.println("Speed 1: " + car.getSpeed());

    //calling accelerator() method and displaying second speed.
    car.accelerator();
    System.out.println("Speed 2: " +  car.getSpeed());

    //calling accelerator() method and displaying third speed
    car.accelerator();
    System.out.println("Speed 3: " +  car.getSpeed());

    //calling accelerator() method and displaying fourth speed
    car.accelerator();
    System.out.println("Speed 4: " +  car.getSpeed());

    //calling accelerator() method and displaying fifth speed
    car.accelerator();
    System.out.println("Speed 5: " +  car.getSpeed());

    //calling brake() method and displaying first speed
    car.brake();
    System.out.println("First speed after brake1: " + car.getSpeed());

    //calling brake() method and displaying second speed
    car.brake();
    System.out.println("First speed after brake2: " + car.getSpeed());

    //calling brake() method and displaying third speed
    car.brake();
    System.out.println("First speed after brake3: " + car.getSpeed());

    //calling brake() method and displaying fourth speed
    car.brake();
    System.out.println("First speed after brake4: " + car.getSpeed());

    //calling brake() method and displaying fifth speed
    car.brake();
    System.out.println("First speed after brake5: " + car.getSpeed());


  }
}
