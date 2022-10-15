package Part2.Exercise4_5;

import java.util.Scanner;

public class TestScoresTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 3 test scores:");

    //Creating or instantiating one TestScore object
    TestScores test = new TestScores();
    //Getting input from user and passing them as arguments to set methods
    test.setTestScore1(input.nextDouble());
    test.setTestScore2(input.nextDouble());
    test.setTestScores3(input.nextDouble());
    System.out.printf("The averages is %.2f", test.average());
  }
}
