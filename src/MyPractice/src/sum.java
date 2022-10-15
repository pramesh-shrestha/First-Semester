import java.util.Random;
import java.util.Scanner;

public class sum
{
  public static void main(String[] args)
  {
    Scanner input =  new Scanner(System.in);
    System.out.println("Enter first number");
    double num1 =  input.nextDouble();
    System.out.println("Enter second number");
    int num2 = input.nextInt();

    System.out.printf("The sum is %.2f", num1 + num2);

  }
}
