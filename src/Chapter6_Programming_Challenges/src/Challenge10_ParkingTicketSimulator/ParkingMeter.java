package Challenge10_ParkingTicketSimulator;

public class ParkingMeter
{
  private int minutesPurchased;

  public ParkingMeter(int minutesPurchased)
  {
    this.minutesPurchased = minutesPurchased;
  }

  public int getMinutesPurchased()
  {
    return minutesPurchased;
  }

  public void setMinutesPurchased(int minutesPurchased)
  {
    this.minutesPurchased = minutesPurchased;
  }

  //toString

  @Override public String toString()
  {
    return "ParkingMeter{" + "minutesPurchased=" + minutesPurchased + '}';
  }
}
