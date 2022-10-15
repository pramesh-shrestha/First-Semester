/*Exercise 12.01
Implement a class Car holding information of a car. The class should have:
a) 5 instance variables: make, model, color, licenseNumber (all of type String) and
year (of type int).
b) A 5-argument constructor setting all instance variables to values passed as arguments.
c) A 4-argument constructor with make, model, color, and year as arguments. The instance
variable licenseNumber should be set to some value indicating that the car has no licence
number.
d) Get-methods for all instance variables.
e) Set methods for color and licenseNumber.
f) A method called copy that returns a reference to a Car-object with the same values for the 5
instance variables.
g) A toString method returning all information in a string.
h) An equals method returning true if the object passed as argument is a car with the same
values of all 5 instance variables.*/

package car;

public class Car
{
  private String make;
  private String model;
  private String color;
  private String licenseNumber;
  private int year;

  //5 args constructor
  public Car(String make, String model, String color, String licenseNumber, int year)
  {
   this.make = make;
   this.model = model;
   this.color = color;
   this.licenseNumber = licenseNumber;
   this.year = year;
  }
  //4 args constructor
  public Car(String make, String model, String color, int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.year = year;
    licenseNumber = null;
  }
  //get methods of all instance variable

  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public String getColor()
  {
    return color;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public int getYear()
  {
    return year;
  }

  //set method for color and license number

  public void setColor(String color)
  {
    this.color = color;
  }
  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  //creating copy method for 5 instance variable
  public Car copy()
  {
    return new Car(make, model, color, licenseNumber, year);
  }
  //creating toString method
  public String toString()
  {
    return "Make: " + make + " Model: " + model + " Color: " + color +
        " Licensenumber " + licenseNumber + "Year: " + year;
  }
  public boolean equals(Car car)
  {
    if(make.equals(car.make) &&
    model.equals(car.model) &&
    color.equals(car.color) &&
    licenseNumber.equals(car.licenseNumber) &&
    year == car.year)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
