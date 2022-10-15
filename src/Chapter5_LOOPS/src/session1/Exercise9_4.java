package session1;

/*Exercise 09.04
The Fibonacci numbers is a special sequence of numbers. They are defined so that the
first two numbers are 1, and all following numbers are the sum of the two preceding
numbers. E.g.
The 0th Fibonacci number is 1.
The 1st Fibonacci number is also 1.
The 2nd Fibonacci number is 1 + 1 = 2.
The 3rd Fibonacci number is 1 + 2 = 3.
The 4th Fibonacci number is 2 + 3 = 5.
Etc.
Write a program that prints out the first 20 Fibonacci numbers, in the following format:
Output:
Fibonacci(0) = 1
Fibonacci(1) = 1
Fibonacci(2) = 2
Fibonacci(3) = 3
Fibonacci(4) = 5
Fibonacci(5) = 8
Fibonacci(6) = 13 */
public class Exercise9_4
{
  public static void main(String[] args)
  {
    int num1 = 1, num2 = 1, num3;

    for(int i =0; i < 20; i++)
    {
      System.out.println("Fibonacci(" + i + ")" + " = " + num1);
      num3 = num1 + num2;
      num1 = num2;
      num2 = num3;
    }


  }
}
