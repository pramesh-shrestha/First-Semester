/*10. Parking Ticket Simulator
For this assignment you will design a set of classes that work together to simulate a police
officer issuing a parking ticket. The classes you should design are:
● The ParkedCar Class: This class should simulate a parked car. The class’s responsibilities are:
– To know the car’s make, model, color, license number, and the number of minutes
that the car has been parked
● The ParkingMeter Class: This class should simulate a parking meter. The class’s only
responsibility is:
– To know the number of minutes of parking time that has been purchased
● The ParkingTicket Class: This class should simulate a parking ticket. The class’s
responsibilities are:
– To report the make, model, color, and license number of the illegally parked car
– To report the amount of the "ne, which is $25 for the "rst hour or part of an hour
that the car is illegally parked, plus $10 for every additional hour or part of an
hour that the car is illegally parked
– To report the name and badge number of the police of"cer issuing the ticket
● The PoliceOfficer Class: This class should simulate a police officer inspecting parked
cars. The class’s responsibilities are:
– To know the police of"cer’s name and badge number
– To examine a ParkedCar object and a ParkingMeter object, and determine whether
the car’s time has expired
– To issue a parking ticket (generate a ParkingTicket object) if the car’s time has
expired
Write a program that demonstrates how these classes collaborate.*/
package Challenge10_ParkingTicketSimulator;

public class ParkedCar
{
  private String make;
  private String model;
  private String color;
  private int licenseNumber;
  private int parkedMinutes;

  public ParkedCar(String make, String model, String color, int licenseNumber, int parkedMinutes)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.parkedMinutes = parkedMinutes;
  }

  public String getMake()
  {
    return make;
  }

  public void setMake(String make)
  {
    this.make = make;
  }

  public String getModel()
  {
    return model;
  }

  public void setModel(String model)
  {
    this.model = model;
  }

  public String getColor()
  {
    return color;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public int getLicenseNumber()
  {
    return licenseNumber;
  }

  public void setLicenseNumber(int licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  public int getParkedMinutes()
  {
    return parkedMinutes;
  }

  public void setParkedMinutes(int parkedMinutes)
  {
    this.parkedMinutes = parkedMinutes;
  }

  //toString

  @Override public String toString()
  {
    return "ParkedCar{" + "make='" + make + '\'' + ", model='" + model + '\''
        + ", color='" + color + '\'' + ", licenseNumber=" + licenseNumber
        + ", parkedMinutes=" + parkedMinutes + '}';
  }

}
