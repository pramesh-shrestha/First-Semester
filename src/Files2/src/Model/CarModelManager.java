package Model;

import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public class CarModelManager implements Serializable
{
  private String fileName;

  //constructors
  public CarModelManager(String fileName)
  {
    this.fileName = fileName;
  }

  //getAllCars
  public CarList getAllCars()
  {
    CarList cars = new CarList();
    try
    {
      cars = (CarList) MyFileHandler.readFromBinaryFile(fileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }
    return cars;
  }

  //addCar
  public void addCar(Car car)
  {
    CarList cars = getAllCars();
    cars.addCar(car);
    try
    {
     MyFileHandler.writeToBinaryFile(fileName,cars);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
  }

  //addCars
  public void addCars(CarList cars)
  {
    CarList newCars = getAllCars();
    for(int i = 0; i < cars.size(); i++)
    {
      newCars.addCar(cars.getCar(i));
    }
    try
    {
      MyFileHandler.writeToBinaryFile(fileName,newCars);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
  }

  //deleteCar
  public void deleteCar(Car car)
  {
    CarList cars = new CarList();
    CarList all = getAllCars();
    try
    {
      for(int i = 0; i < all.size(); i++)
      {
        if(!all.getCar(i).equals(car))
        {
          cars.addCar(all.getCar(i));
        }
      }
      MyFileHandler.writeToBinaryFile(fileName,cars);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
  }

  //deleteCarByRegNumber
  public void deleteCarsByRegNumber(String regNumber)
  {
    CarList cars = new CarList();
    CarList all = getAllCars();
    try
    {
      for(int i = 0; i < all.size(); i++)
      {
        if(!all.getCar(i).getRegNumber().equals(regNumber))
        {
          cars.addCar(all.getCar(i));
        }
      }
      MyFileHandler.writeToBinaryFile(fileName,cars);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }

  }
}
