/*2. Car Class
Write a class named Car that has the following fields:
● yearModel. The yearModel field is an int that holds the car’s year model.
● make. The make field is a String object that holds the make of the car.
● speed. The speed field is an int that holds the car’s current speed.
In addition, the class should have the following methods.
● Constructor. The constructor should accept the car’s year model and make as arguments.
These values should be assigned to the object’s yearModel and make fields. The
constructor should also assign 0 to the speed field.
● Accessor. The appropriate accessor methods get the values stored in an object’s
yearModel, make, and speed fields.
● accelerate. The accelerate method should add 5 to the speed field each time it is
called.
● brake. The brake method should subtract 5 from the speed field each time it is called.
Demonstrate the class in a program that creates a Car object, and then calls the accelerate
method five times. After each call to the accelerate method, get the current speed of the car
and display it. Then, call the brake method five times. After each call to the brake method,
get the current speed of the car and display it.*/
package Challenge2_Car;

public class Car
{
  //declaring fields of Car class
  private int yearModel;
  private String make;
  private int speed;

  //creating constructor two argument constructor
  public Car(int yearModel,String make)
  {
    this.yearModel = yearModel;
    this.make = make;
    speed = 0;
  }

  //creating get methods that return the values stored in the fields
  public int getYearModel()
  {
    return yearModel;
  }
  public String getMake()
  {
    return make;
  }
  public int getSpeed()
  {
    return speed;
  }

  //creating accelerator method that adds 5 to the speed each time it is called
  public void accelerator()
  {
    speed += 5;
  }

  //creating brake method that subtract 5 from the speed each time it is called
  public void brake()
  {
    speed -= 5;
  }

}
