package Challenge8_Testscores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestScoresTest
{
  public static void main(String[] args)
  {
    //DecimalFormat class to set decimal place
    DecimalFormat formatter = new DecimalFormat("#0.00");
    //getting input from user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first test score: ");
    double first_score = input.nextDouble();
    System.out.print("Enter second test score: ");
    double second_score = input.nextDouble();
    System.out.print("Enter third test score: ");
    double third_score = input.nextDouble();

    //creating an instance of TestScores class
    TestScores testScores = new TestScores();
    //storing values to the fields
    testScores.setScore1(first_score);
    testScores.setScore2(second_score);
    testScores.setScore3(third_score);

    //calling the average() method and printing the average score
    System.out.println("The average is: " + formatter.format(testScores.average()));
  }

}
