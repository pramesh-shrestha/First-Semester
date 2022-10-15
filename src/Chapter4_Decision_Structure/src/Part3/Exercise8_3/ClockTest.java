package Part3.Exercise8_3;

public class ClockTest
{
  public static void main(String[] args)
  {
    //input seconds and get in the format of h:m:s
    Clock time1 = new Clock(200);
    System.out.println(time1);

    //setting time to convert into seconds
    time1.set(1,1,1);
    System.out.println(time1.convertToSeconds());

    //
    Clock time2 =new Clock(300);
    System.out.println(time2.isBefore(time1));

    //checking the time difference between two clocks in seconds
    Clock time3= new Clock(1,1,1);
    Clock time4 = new Clock(3,3,3);
    System.out.println(time4.timeInSecondsTo(time3));

    //checking the time difference between two clocks
    System.out.println(time4.timeTo(time3));

  }
}
