import java.util.Scanner;

/*Write a program that:
a) Reads 4 integers from keyboard and stores them into an array (array1).
b) Reads 4 more integers from keyboard and stores them into another array (array2).
c) Creates a new array with the same length (sumArray).
d) Uses a loop to store the sum of each element pair in the two arrays in sumArray.
Example1: array1={1, 2, 3, 4} and array2{1, 2, 4, 5} makes sumArray={2, 4, 7, 9} */
public class SumArray
{
  public static void main(String[] args)
  {
    boolean identical = true;
    int[] array1 = new int[4];
    int[] array2 = new int[4];
    int[] sumArray = new int[4];

    System.out.println("Enter integers for array1");
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < array1.length; i++)
    {
      array1[i] = input.nextInt();
    }
    System.out.println("Enter integers for array2");
    for(int j = 0; j < array2.length; j++)
    {
      array2[j] = input.nextInt();
    }
    for(int k = 0; k < array1.length; k++)
    {
      sumArray[k] = array1[k] + array2[k];
      System.out.print(sumArray[k] + " ");
    }

  }
}
