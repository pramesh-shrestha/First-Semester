package Challenge10_ParkingTicketSimulator;

public class ParkingTicket
{
  private ParkedCar car;
  private double fine;
  private PoliceOfficer policeOfficer;
  private ParkingMeter meter;

  // Constant for the base fine.
  public final double BASE_FINE = 25.0;

  // Constant for the additional hourly fine.
  public final double HOURLY_FINE = 10.0;

  public ParkingTicket(ParkedCar car, double fine,
      PoliceOfficer policeOfficer, ParkingMeter meter)
  {
    this.car = car;
    this.fine = fine;
    this.policeOfficer = policeOfficer;
    this.meter = meter;
  }
  public ParkingTicket(ParkedCar car, ParkingMeter meter)
  {
    this.car = car;
    this.meter = meter;
  }
  //report the information of illegally parked car
  public ParkedCar illegalParking()
  {
    return car;
  }
  //amount of fine
  public double totalFine()
  {
    int totalMinutes = 0;
    if(car.getParkedMinutes() > meter.getMinutesPurchased())
    {
      totalMinutes = car.getParkedMinutes() - meter.getMinutesPurchased();
      fine = 25;

      while(true)
      {
        totalMinutes -= 60;
        if(totalMinutes > 0)
        {
          fine += 10;
        }
      }
    }
    return fine;
  }
  //report name and badge of policeOfficer
  public PoliceOfficer getPoliceOfficer()
  {
    return policeOfficer;
  }

}
