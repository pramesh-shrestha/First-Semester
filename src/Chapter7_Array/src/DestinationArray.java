/*Write an application that creates an integer array (sourceArray) using an initialization list,
    to initialize it to some values of your choice. Then create a new array (destinationArray)
    and in a loop copy all elements from sourceArray to destinationArray. Then use a loop to
    print out the (hopefully identical) contents of the two arrays.*/
public class DestinationArray
{
  public static void main(String[] args)
  {
    int[] arr = {1,2,3,4,5};
    int[] destinationArray = new int[arr.length];
    for(int i = 0; i < arr.length; i++)
    {
      destinationArray[i] = arr[i];
    }
    for(int i = 0; i < arr.length; i++)
    {
      System.out.println(destinationArray[i]);
    }

  }
}
