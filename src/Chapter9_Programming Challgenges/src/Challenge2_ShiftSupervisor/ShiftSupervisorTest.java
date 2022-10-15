package Challenge2_ShiftSupervisor;

public class ShiftSupervisorTest
{
  public static void main(String[] args)
  {
    //creating ShiftSupervisor object
    ShiftSupervisor supervisor = new ShiftSupervisor("Pramesh Shrestha",
        "605PS", "25/25/2010",600000,100000);

    System.out.println("Supervisor's Details");
    System.out.println("--------------------");
    System.out.println(supervisor);
  }
}
