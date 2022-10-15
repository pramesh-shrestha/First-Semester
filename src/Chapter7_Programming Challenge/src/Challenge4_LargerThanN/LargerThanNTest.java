package Challenge4_LargerThanN;

import java.util.Scanner;

public class LargerThanNTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of array you want");
    int length = input.nextInt();

    //initializing array
    int[] arr = new int[length];

    //getting elements of array from the user
    System.out.println("Enter " + arr.length + " numbers");
    for(int i = 0; i < arr.length; i++)
    {
      int num = input.nextInt();
      arr[i] = num;
    }

    //get any number from user
    System.out.println("Enter any number");
    int n = input.nextInt();

    //creating LargerThanN object
    LargerThanN largerThanN = new LargerThanN();
    System.out.println(largerThanN.greaterNumbers(arr, n));
  }
}
