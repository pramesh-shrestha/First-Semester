import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber
{
  public static void main(String[] args)
  {
    int[] arr = {3,9,7,8,12,6,15,5,4,10};


    //Sum of all elements
    int sum = 0;
    for(int i : arr)
      sum += i;
    System.out.println("Sum is:" + sum);

    //Searching an element
    Scanner input = new Scanner(System.in);
    System.out.println("Enter any number");
    int num  = input.nextInt();
    boolean bool = false;
    for(int x : arr)
    {
      if(x == num){
        bool =  true;
        break;
      }
    }
    System.out.println("Presence of entered number in the array: " + bool);

    //Largest element of the array
    int largest = 0;
    int secondLargest = 0;
    for (int i: arr)
    {
      largest = i > largest? i : largest;
    }
    System.out.println("The largest number is: " + largest);

    //Second largest
    for (int i: arr)
    {
      if(i ==  largest) continue;
      else secondLargest = (i > secondLargest && secondLargest < largest)? i : secondLargest;
    }
    System.out.println("The second largest number is: " + secondLargest);

    Arrays.sort(arr);
    System.out.println("Largest:" + arr[arr.length - 1]);
    System.out.println("Second Largest:" + arr[arr.length - 2]);


  }
}
