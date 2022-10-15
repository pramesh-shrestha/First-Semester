public class IncreaseSizeOfAnArray
{
  public static void main(String[] args)
  {
    int[] arr1 = {1,2,3,4};
    int[] arr2 =  new int[10];

    System.out.println("Old size of arr1: " + arr1.length);
    System.out.println("Old size of arr2: " + arr2.length);

    //copy arr1 to arr2
    for(int i=0; i < arr1.length; i++)
      arr2[i] = arr1[i];

    //changing reference of arr1 to arr2
    arr1 = arr2;
    System.out.println("New size of arr1: " + arr1.length);

    //setting arr2 to null
    arr2 = null;
    if(arr2 == null)
    System.out.println("New size of arr2: " + 0);
  }
}
