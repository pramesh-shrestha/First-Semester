import java.util.Arrays;

public class RotatingArray
{
  public static void main(String[] args)
  {
    int[] arr1 = {5,9,6,10,12,7,3,5,4,2};

    //left rotation
    int firstElement = arr1[0];
    int[] arr2 = new int[arr1.length];
    for(int i = 1; i < arr1.length; i++)
        arr2[i-1] = arr1[i];
    arr2[arr2.length-1] = firstElement;

    for(int i : arr2)
    System.out.println(i);

  }


}
