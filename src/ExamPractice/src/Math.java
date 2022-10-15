import java.util.InputMismatchException;
import java.util.Scanner;

public class Math
{

    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);

        try {
          int x = 0;
          int y=0;
          System.out.println("Enter x: ");
          x = scanner.nextInt();
          System.out.println("Enter y: ");
          y = scanner.nextInt();
          System.out.println("x + y = " + (x + y));
          System.out.println("x - y = " + (x - y));
          try {
            System.out.println("x / y = " + (x / y));
          }
          catch (ArithmeticException e)
          {
            System.out.println("cannot divide by 0");
          }

          System.out.println("x * y = " + (x * y));
        }
        catch (InputMismatchException e)
        {
          System.out.println("please enter a number");
        }
        catch (Exception e)
        {
          System.out.println("Something went wrong");
        }


    }

}
