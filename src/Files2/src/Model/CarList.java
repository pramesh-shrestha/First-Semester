package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class CarList implements Serializable
{
  ArrayList<Car> cars;

  //constructor
  public CarList()
  {
    cars = new ArrayList<>();
  }

  //size
  public int size()
  {
    return cars.size();
  }

  //indexOfRegNumber
  public int indexOfRegNumber(String regNum)
  {
    for(int index = 0; index < cars.size(); index++)
    {
      if(cars.get(index).getRegNumber().equals(regNum))
      {
        return index;
      }
    }
    return -1;
  }

  //getCar
  public Car getCar(int index)
  {
    return cars.get(index);
  }

  //getCar overloaded
  public Car getCar(String regNum)
  {
    for(int i = 0; i < cars.size(); i++)
    {
      if(cars.get(i).getRegNumber().equals(regNum))
      {
        return cars.get(i);
      }
    }
    return null;
  }

  //addCar
  public void addCar(Car newCar)
  {
   if(indexOfRegNumber(newCar.getRegNumber()) == -1)
   {
     cars.add(newCar);
   }
  }

  //toString
  public String toString()
  {
    String str = "";
    for(int i = 0; i < cars.size(); i++)
    {
      str += cars.get(i) + "\n";
    }
    return str;
  }
}
