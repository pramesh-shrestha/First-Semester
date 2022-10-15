package Challenge1_Employee;

public class EmployeeTest
{
  public static void main(String[] args)
  {
    //creating ProductionWorker object
    ProductionWorker worker1 = new ProductionWorker("Pramesh Shrestha","605PS","25/11/2010",1,150);
    ProductionWorker worker2 = new ProductionWorker("Rajiv Paudel", "420RP","01/05/2022",2,150);

    System.out.println("Employee Details");
    System.out.println("------------------");
    System.out.println(worker1);
    System.out.println();//new line
    System.out.println(worker2);
  }
}
