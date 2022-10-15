package Challenge12_CarInstrumentSimulator;

public class CarInstrumentalTest
{
  public static void main(String[] args)
  {
    //creating FuelGauge object
    FuelGauge fuelGauge = new FuelGauge(0); //let us start with no fuel
    //creating Odometer object
    Odometer odometer = new Odometer(0,fuelGauge); // lets us start with no mile driven

    //adding fuel to the max level
    for(int i = 0; i < 15; i++)
    {
      fuelGauge.addFuel();
    }

    //driving car until car runs out of fuel
    while(fuelGauge.getFuel() > 0)
    {
      odometer.addMileage();

      // Display the mileage.
      System.out.println("Mileage: " + odometer.getMileage());

      // Display the amount of fuel.
      System.out.println("Fuel level: " + fuelGauge.getFuel() +
          " gallons");
    }

  }
}
