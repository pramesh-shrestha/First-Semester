/*Write an application that creates an integer array using an initialization list, to initialize it to
some values of your choice. Then use a loop to double the value of each element. Finally
use another loop to print out all the elements.
Example: if the array contains {1, 2, 3, 4, 5} the program changes the values to {2, 4, 6, 8,
10} and prints them out. */
public class Exercise15_1
{
  public static void main(String[] args)
  {
    int[] arr = {1, 2, 3, 4, 5};

    for(int index= 0; index < arr.length; index++)
    {
      arr[index] = arr[index] * 2;
    }
    for(int index = 0; index < arr.length; index++)
    {
      System.out.println(arr[index]);
    }
  }
}
