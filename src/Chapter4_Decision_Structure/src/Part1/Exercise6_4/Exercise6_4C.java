
package Part1.Exercise6_4;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise6_4C
/*{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three numbers:");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

    if (num1 < num2 && num2 < num3)
    {
      System.out.println(num1 + " " + num2 + " " + num3);
    }
    else if (num1 < num3 && num3 < num2)
    {
      System.out.println(num1 + " " + num3 + " " + num2);
    }
    else if (num2 < num1 && num1 < num3)
    {
      System.out.println(num2 + " " + num1 + " " + num3);
    }
    else if (num2 < num3 && num3 < num1)
    {
      System.out.println(num2 + " " + num3 + " " + num1);
    }
    else if (num3 < num1 && num1 < num2)
    {
      System.out.println(num3 + " " + num1 + " " + num2);
    }
    else if (num3 < num2 && num2 < num1)
    {
      System.out.println(num3 + " " + num2 + " " + num1);
    }
  }
}
*/

//USING ARRAYS AND FOR LOOP
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three numbers:");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

    //creating array of the inputs
    int[] numbers = {num1,num2,num3};
    Arrays.sort(numbers);

    //using loop to print each element of sorted arrays
    for(int i = 0; i < 3; i++)
    {
      System.out.println(numbers[i]);
    }
  }
}

