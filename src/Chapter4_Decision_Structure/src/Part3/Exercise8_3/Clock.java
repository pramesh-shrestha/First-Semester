package Part3.Exercise8_3;

public class Clock
{
  private int hour;
  private int minute;
  private int second;

  //creating 3 args constructor
  public Clock(int h, int m, int s)
  {
    this.hour = h;
    this.minute = m;
    this.second = s;
  }
  //creating 1 arg constructor
  public Clock(int totalTimeInSeconds)
  {
    hour = totalTimeInSeconds/3600;
    totalTimeInSeconds -= hour * 3600;
    minute = totalTimeInSeconds / 60;
    totalTimeInSeconds -= minute * 60;
    second = totalTimeInSeconds;
  }
  //creating set method to store values in these fields
  public void set(int h, int m, int s)
  {
    this.hour = h;
    this.minute = m;
    this.second = s;
  }
  //creating get method to return the stored values in these fields

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }
  //creating tic method
  public void tic()
  {
    second += 1;
    if(second > 59)
    {
      minute += 1;
      second = 0;
      if (minute > 59)
      {
        hour += 1;
        minute = 0;
        if(hour > 23)
        {
          hour = 0;
        }

      }
    }
  }

  //creating convert to seconds
  public int convertToSeconds()
  {
    return  (hour * 60 *60) + (minute * 60) + second;

  }
  public boolean isBefore(Clock time)
  {
    if(convertToSeconds() < time.convertToSeconds())
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public int timeInSecondsTo(Clock time)
  {
    if(convertToSeconds() < time.convertToSeconds())
    {
      return time.convertToSeconds() - convertToSeconds();
    }
    else
    {
      return convertToSeconds() - time.convertToSeconds();
    }
  }
  public Clock timeTo(Clock time)
  {
    // 0:3:00  - 0:3:30 //30
    Clock timeDifference = new Clock(timeInSecondsTo(time));
    return timeDifference;
  }

  public String toString()
  {
    return hour + ":" + minute + ":" +
        + second;
  }
}
