package serviceBook;

public class Service
{
  private int mileage;
  private Date date;

  public Service(int mileage, Date date)
  {
    this.mileage = mileage;
    this.date = date.copy();
  }
  public int getMileage()
  {
    return mileage;
  }
  public Date getDate()
  {
    return date.copy();
  }
  //equals() method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Service))
    {
      return false;
    }
    Service other = (Service)obj;
    return mileage == other.mileage && date.equals(other.date);
  }

  //toString() method
  public String toString()
  {
    return "Mileage: " + mileage + "Date: " + date;
  }
}
