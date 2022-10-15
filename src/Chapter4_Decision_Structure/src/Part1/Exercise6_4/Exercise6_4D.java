package Part1.Exercise6_4;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise6_4D
/*{
  public static void main(String[] args)
  {
    int largest1, largest2, second_largest, third_largest, smallest1, smallest2, largest, smallest;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter four numbers:");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    int num4 = input.nextInt();

    if (num1 > num2)
    {
      largest1 = num1;
      smallest1 = num2;
    }
    else
    {
      largest1 = num2;
      smallest1 = num1;
    }
    if (num3 > num4)
    {
      largest2 = num3;
      smallest2 = num4;
    }
    else
    {
      largest2 = num4;
      smallest2 = num3;
    }
    if (largest1 > largest2)
    {
      largest = largest1;
      second_largest = largest2;
    }
    else
    {
      largest = largest2;
      second_largest = largest1;
    }
    if (smallest1 < smallest2)
    {
      smallest = smallest1;
      third_largest = smallest2;
    }
    else
    {
      smallest = smallest2;
      third_largest = smallest1;
    }
    if (second_largest > third_largest)
    {
      System.out.println(
          largest + " " + second_largest + " " + third_largest + " " + smallest);
    }
    else
    {
      System.out.println(
          largest + " " + third_largest + " " + second_largest + " " + smallest);
    }
  }
}*/

{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter four numbers:");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    int num4 = input.nextInt();

    //creating array for the inputs
    int[] numbers = {num1,num2,num3,num4};
    Arrays.sort(numbers);

    //printing each element of array in descending order
    for(int i = 3; i >= 0; i--)
    {
      System.out.println(numbers[i]);
    }
  }
}
