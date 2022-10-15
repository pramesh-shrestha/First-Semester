/*Exercise 1:
Write an application that creates an integer array using an initialization list, to initialize it to
some values of your choice. The program should print out:
 -the initial array
 -an array with odd numbers from initial array
 -an array with even numbers from initial array
Example of an output:
All the numbers are: 2 6 3 5 8 9 7
 Odd nr are: 3 5 7 9
 Even nr are: 2 6 8*/
package Workshop4;

public class OddEven
{
  public static void main(String[] args)
  {
    String even = "";
    String odd= "";
    String element = "";
    int[] number = {1,2,3,4,5};

    for(int i = 0; i < number.length; i++)
    {
      element += number[i] + " ";
    }
    for(int i = 0; i < number.length; i++)
    {
      if(number[i] % 2 == 0)
      {
        even += number[i] + " ";

      }
      else
      {
        odd += number[i] + " ";
      }

    }
    System.out.println("Elements:" + element);
    System.out.println("Even: " + even);
    System.out.println("Odd: " + odd);

  }
}
