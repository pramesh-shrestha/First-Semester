package WorkshopTest;

import java.util.Random;

public class Exercise2
{
  public static void main(String[] args)
  {
    //creating Random object
    Random rand = new Random();
    int number1 = rand.nextInt(100) + 1;
    int number2 = rand.nextInt(100) + 1;
    int number3 = rand.nextInt(100) + 1;
    int number4 = rand.nextInt(100) + 1;
    int number5 = rand.nextInt(100) + 1;
    int number6 = rand.nextInt(100) + 1;

    //displaying all random numbers
    System.out.println(number1);
    System.out.println(number2);
    System.out.println(number3);
    System.out.println(number4);
    System.out.println(number5);
    System.out.println(number6);

    int sumOdd = 0;
    int sumEven = 0;

    if(number1 % 2 == 0)
    {
      sumEven = sumEven + number1;
    }
    else
    {
      sumOdd = sumOdd + number1;
    }
    if(number2 % 2 == 0)
    {
      sumEven = sumEven + number1;
    }
    else
    {
      sumOdd = sumOdd + number1;
    }
    if(number3 % 2 == 0)
    {
      sumEven = sumEven + number1;
    }
    else
    {
      sumOdd = sumOdd + number1;
    }
    if(number4 % 2 == 0)
    {
      sumEven = sumEven + number1;
    }
    else
    {
      sumOdd = sumOdd + number1;
    }
    if(number5 % 2 == 0)
    {
      sumEven = sumEven + number1;
    }
    else
    {
      sumOdd = sumOdd + number1;
    }
    if(number6 % 2 == 0)
    {
      sumEven = sumEven + number1;
    }
    else
    {
      sumOdd = sumOdd + number1;
    }

    System.out.printf("Sum of even is %d\n", sumEven);
    System.out.printf("Sum of odd is %d", sumOdd);





  }
}
