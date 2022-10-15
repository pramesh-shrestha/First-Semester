package Challenge12_CarInstrumentSimulator;

public class FuelGauge
{
  private double fuel;
  private double maxFuel = 15;

  public FuelGauge(double fuel)
  {
    // Set fuel to maximum, but no more than
    // the maximum amount.
    if(fuel < maxFuel)
    {
      this.fuel = fuel;
    }
    else
    {
      this.fuel = maxFuel;
    }

  }
  public double getFuel()
  {
    return fuel;
  }

  public void setFuel(double fuel)
  {
    this.fuel = fuel;
  }
  //to increment the amount of fuel by 1 gallon
  public void addFuel()
  {
    if(fuel < 15)
    {
      fuel++;
    }
  }
  //to decrement the amount of fuel by 1 gallon, if the amount of fuel is
  //greater than 0 gallons
  public void useFuel()
  {
    if(fuel > 0)
    {
      fuel--;
    }
  }
}
