package Challenge3_ChargeAccount;

import java.util.Arrays;

public class ChargeAccount
{
  private int[] accountNumber = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
      8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
      1005231, 6545231, 3852085, 7576651, 7881200, 4581002};

  //method that takes in an account number as an argument
  //binary search
  public boolean binarySearch(int key)
  {
    //sorting the array in ascending order
    Arrays.sort(accountNumber);
    int first = 0; //first index
    int last = accountNumber.length - 1; //last index
    int mid = (first + last)/2; //mid index

    while(first <= last)
    {
      if(accountNumber[mid] == key)
      {
//        System.out.println("Element found at index " + mid);
        return true;
      }
      else if(accountNumber[mid] < key)
      {
        first = mid + 1;
      }
      else
      {
        last = mid - 1; //if mid is greater than key
      }
      mid = (first + last)/2;
    }
//    System.out.println("Element not found");
    return false;
  }
}
