/*Write an application that creates an integer array (sourceArray) using an initialization list,
to initialize it to some values of your choice. Then create a new array (destinationArray)
with a size of twice the length as sourceArray and in a loop copy all elements from
sourceArray to the first half of destinationArray. The remaining elements in
destinationArray should be 0.
Example: sourceArray: {2, 3, 4, 5} so destinationArray should be: {2, 3, 4, 5, 0, 0, 0, 0}. */
public class DestinationArrayDoubleSize
{
  public static void main(String[] args)
  {
    int[] arr = {2,3,4,5};
    //creating new array
    int[] destinationArray = new int[arr.length * 2];

    for(int i = 0; i < arr.length; i++)
    {
      destinationArray[i] = arr[i];
    }

    for(int i = 0; i < destinationArray.length; i++)
    {
      System.out.println(destinationArray[i]);
    }


  }
}
