package Model;

import javax.lang.model.util.SimpleElementVisitor7;
import java.io.Serializable;

public class Car implements Serializable
{
  private String make;
  private String model;
  private String regNumber;
  private int year;
  private Owner owner;

  //constructor

  public Car(String make, String model, String regNumber, int year, Owner owner)
  {
    this.make = make;
    this.model = model;
    this.regNumber = regNumber;
    this.year = year;
    this.owner = owner;
  }

  //get methods
  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public String getRegNumber()
  {
    return regNumber;
  }

  public int getYear()
  {
    return year;
  }

  public Owner getOwner()
  {
    return owner;
  }

  //toString
  public String toString()
  {
    return "Make: " + make +
        "\nModel: " + model +
        "\nReg Number: " + regNumber +
        "\nYear: " + year +
        "\nCar.Owner: " + owner;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Car))
    {
      return false;
    }
    Car other = (Car) obj;
    return make.equals(other.make) &&
        model.equals(other.model) &&
        regNumber.equals(other.regNumber) &&
        year == other.year &&
        owner.equals(other.owner);
  }
}
