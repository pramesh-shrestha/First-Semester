/*12. Car-Instrument Simulator
For this assignment you will design a set of classes that work together to simulate a car’s
fuel gauge and odometer. The classes you will design are as follows:
● The FuelGauge Class: This class simulate a fuel gauge. It’s responsibilities are
– To know the car’s current amount of fuel, in gallons.
– To report the car’s current amount of fuel, in gallons.
– To be able to increment the amount of fuel by 1 gallon. This simulates putting fuel
in the car. (The car can hold a maximum of 15 gallons.)
– To be able to decrement the amount of fuel by 1 gallon, if the amount of fuel is
greater than 0 gallons. This simulates burning fuel as the car runs.
● The Odometer Class: This class simulates the car’s odometer. It’s responsibilities are
– To know the car’s current mileage.
– To report the car’s current mileage.
– To be able to increment the current mileage by 1 mile. The maximum mileage the
odometer can store is 999,999 miles. When this amount is exceeded, the odometer
resets the current mileage to 0.
– To be able to work with a FuelGuage object. It should decrease the FuelGauge
object’s current amount of fuel by 1 gallon for every 24 miles traveled. (The car’s
fuel economy is 24 miles per gallon.)
Demonstrate the classes by creating instances of each. Simulate filling the car up with fuel,
and then run a loop that increments the odometer until the car runs out of fuel. During each
loop iteration, print the car’s current mileage and amount of fuel.*/
package Challenge12_CarInstrumentSimulator;

public class Odometer
{
  private FuelGauge fuelGauge;
  private int mileage;
  private final int maxMileage = 999999;

  public Odometer(int mileage, FuelGauge fuelGauge)
  {
    if (mileage < maxMileage)
    {
      this.mileage = mileage;
    }
    else
    {
      this.mileage = 0;
    }
    this.fuelGauge = fuelGauge;
  }

  public double getMileage()
  {
    return mileage;
  }

  public void setMileage(int mileage)
  {
    this.mileage = mileage;
  }
  int newMileage = mileage; //setting the point to read the mile driven
  //to increment the current mileage by 1 mile
  public void addMileage()
  {
    if (mileage < maxMileage)
    {
      mileage++;
    }
    else
    {
      mileage = 0;
    }
    //To be able to work with a FuelGuage object. It should decrease the FuelGauge
    //object’s current amount of fuel by 1 gallon for every 24 miles traveled. (The car’s
    //fuel economy is 24 miles per gallon.)

     //to know how many miles the car has driven
    if((mileage - newMileage) >= 24)
    {
      fuelGauge.useFuel();
      newMileage = mileage;
    }
  }
}

