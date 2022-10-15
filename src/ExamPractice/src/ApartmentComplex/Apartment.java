package ApartmentComplex;

public class Apartment extends Residence
{
  private int numberOfRooms;
  public Apartment(int number, double size, int numberOfRooms)
  {
    super(number, size, "Apartment");
    this.numberOfRooms = numberOfRooms;
  }

  public int getNumberOfRooms()
  {
    return numberOfRooms;
  }

  @Override public String toString()
  {
    return super.toString() + "Apartment{" + "numberOfRooms=" + numberOfRooms + '}';
  }
}
