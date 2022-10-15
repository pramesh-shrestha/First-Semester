package Challenge4_LargerThanN;

import java.util.Arrays;

public class LargerThanN
{
  private int[] arr;
  private int num;

  public String greaterNumbers(int[] arr, int n)
  {
    String largerNum = "";
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] > n)
      {
        largerNum =  largerNum + arr[i] + " ";
      }
    }
    return largerNum;
  }
}