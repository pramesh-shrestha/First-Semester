package Model;

public class CarTest
{
  public static void main(String[] args)
  {
    CarModelManager carModelManager = new CarModelManager("Files2/src/Model/cars.bin");
    System.out.println(carModelManager.getAllCars());
  }
}
