import java.util.Scanner;

/*Write a program that:
a) Reads 4 integers from keyboard and stores them into an array (array1).
b) Reads 4 more integers from keyboard and stores them into another array (array2).
c) Uses a loop to check if the two arrays are identical, i.e. all elements at the same
position in the two arrays must be the same.
Example1: array1={1, 2, 3, 4} and array2{1, 2, 4, 5} are NOT identical.
Example2: array1={10, 20, 30, 40} and array2{10, 20, 30, 40} are identical.*/
public class Identical
{
  public static void main(String[] args)
  {
    boolean identical = true;
    int[] array1 = new int[4];
    int[] array2 = new int[4];

    System.out.println("Enter integers for array1");
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < array1.length; i++)
    {
      array1[i] = input.nextInt();
    }
    System.out.println("Enter integers for array2");
    for(int i = 0; i < array2.length; i++)
    {
      array2[i] = input.nextInt();
    }

    for(int i = 0; i < array1.length; i++)
    {
      if(array1[i] != array2[i])
      {
        identical = false;
        break;
      }
    }
    if(identical)
    {
      System.out.println("They are identical");
    }
    else
    {
      System.out.println("They are not identical");
    }

  }
}
