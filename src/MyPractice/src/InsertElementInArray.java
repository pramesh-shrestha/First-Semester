public class InsertElementInArray
{
  public static void main(String[] args)
  {
    int[] arr = new int[10];
    arr[0] = 5;
    arr[1] = 9;
    arr[2] = 6;
    arr[3] = 10;
    arr[4] = 12;
    arr[5] = 7;

    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] == 0)
      {
        arr[i] = 8;
        break;
      }
    }
    for(int i : arr)
      System.out.println(i);
  }
}
