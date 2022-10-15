package Challenge10_ParkingTicketSimulator;

public class PoliceOfficer
{
  private String name;
  private int badgeNumber;
  private ParkedCar car;
  private ParkingMeter parkingMeter;

  public PoliceOfficer(String name, int badgeNumber)
  {
    this.name = name;
    this.badgeNumber = badgeNumber;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getBadgeNumber()
  {
    return badgeNumber;
  }

  public void setBadgeNumber(int badgeNumber)
  {
    this.badgeNumber = badgeNumber;
  }

  //examine a ParkedCar object and a ParkingMeter object, and determine whether
  //the car’s time has expired
  public boolean timeExpired()
  {
    if(car.getParkedMinutes() > parkingMeter.getMinutesPurchased())
    {
      return true;
    }
    return false;
  }

  //issue a parking ticket (generate a ParkingTicket object) if the car’s time has
  //expired
  public ParkingTicket ticket()
  {
    ParkingTicket newTicket = null;
    if(timeExpired())
    {
     newTicket = new ParkingTicket(car, parkingMeter);
    }
    return newTicket;
  }

}
