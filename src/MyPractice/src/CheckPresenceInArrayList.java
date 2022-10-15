//Write a program to find out whether a given integer is present in an array of not.
import java.util.Scanner;
public class CheckPresenceInArrayList
{
  public static void main(String[] args)
  {
    int[] elements = {2,8,9,10,16,20};
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int userInput = input.nextInt();
    boolean presence = false;
    for(int i = 0; i < elements.length; i++)
    {
      if(userInput == elements[i])
      {
        presence = true;
        System.out.println("The given integer is present at index " + i);
        break;
      }
      else
      {
        presence = false;
      }
    }
    if(!presence)
    {
      System.out.println("The given integer is not present int the array");
    }

  }
}
