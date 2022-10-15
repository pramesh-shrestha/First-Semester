package ApartmentComplex;

public abstract class Residence
{
  private int number;
  private double size;
  private String type;
  private Tenant rentedTo;

  public Residence(int number,double size, String type)
  {
    this.number = number;
    this.size = size;
    if( !(type.equalsIgnoreCase("Room") || type.equals("Apartment")))
    {
      throw new IllegalTypeException("Invalid type");
    }
    else{
      this.type = type;
    }
    rentedTo = null;
  }

  public int getNumber()
  {
    return number;
  }

  public double getSize()
  {
    return size;
  }

  public String getType()
  {
    return type;
  }

  public boolean isAvailable()
  {
    if(rentedTo == null)
    {
      return true;
    }
    return false;
  }

  public void rentTo(Tenant tenant, MyDate rentedFrom)
  {
    rentedTo = tenant;
    rentedTo.setRentedFrom(rentedFrom);
  }

  public Tenant getTenant()
  {
    return rentedTo;
  }

  public abstract int getNumberOfRooms();

  @Override public String toString()
  {
    return "Residence{" + "number=" + number + ", size=" + size + ", type='"
        + type + '\'' + ", rentedTo=" + rentedTo + '}';
  }
}
