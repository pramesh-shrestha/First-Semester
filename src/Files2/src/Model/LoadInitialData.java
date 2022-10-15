package Model;

import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoadInitialData
{
  public static void main(String[] args)
  {
    CarList cars = new CarList();
    String[] carArray = null;

    try
    {
      carArray = MyFileHandler.readArrayFromTextFile("Files2/src/Model/cars.txt");
      for(int i = 0; i < carArray.length; i++)
      {
        String temp = carArray[i];
        String[] tempArr = temp.split(",");
        String regNumber = tempArr[0];
        String make = tempArr[1];
        String model = tempArr[2];
        String year = tempArr[3];
        String firstName = tempArr[4];
        String lastName = tempArr[5];

        cars.addCar(new Car(make, model, regNumber,Integer.parseInt(year),new Owner(firstName,lastName)));
      }
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }

    try
    {
      MyFileHandler.writeToBinaryFile("Files2/src/Model/cars.bin", cars);
    }
    catch (FileNotFoundException e)
    {
      System.err.println("Error opening file");
    }
    catch (IOException e)
    {
      System.err.println("IO error writing to file.");
      e.printStackTrace();
    }
    System.out.println("Done writing.");

  }
}
