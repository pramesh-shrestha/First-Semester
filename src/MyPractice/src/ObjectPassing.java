public class ObjectPassing
{
  public void update(int[] a)
  {
    a[0] = 25;
  }
  public static void main(String[] args)
  {
    int[] arr1 = {1,2,3};
    ObjectPassing arr = new ObjectPassing();
    arr.update(arr1);
    for(int i : arr1)
      System.out.println(i);
  }
}
