//Write a java program to reverse an array
public class ReverseArray
{
  public static void main(String[] args)
  {
    int[] element = {1,2,3,4,5};
    for(int i = element.length - 1; i >= 0; i--) {
      System.out.print(element[i] + " ");
    }
  }
}
