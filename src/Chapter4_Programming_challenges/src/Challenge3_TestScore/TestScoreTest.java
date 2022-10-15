package Challenge3_TestScore;

import java.awt.*;
import java.util.Scanner;

public class TestScoreTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first score: ");
    double score1 = input.nextInt();
    System.out.print("Enter second score: ");
    double score2 = input.nextInt();
    System.out.print("Enter third score: ");
    double score3 = input.nextInt();

    //creating TestScores object
    TestScores testScores = new TestScores(score1, score2, score3);

    double average = testScores.average();
    System.out.printf("The average is: %.2f", average);
    System.out.println();

    if(average >= 90 && average <= 100)
    {
      System.out.println("Grade: A");
    }
    else if(average >= 80 && average <= 89)
    {
      System.out.println("Grade: B");
    }
    else if(average >= 70 && average <= 79)
    {
      System.out.println("Grade: C");
    }
    else if(average >= 60 && average <= 69)
    {
      System.out.println("Grade: D");
    }
    else
    {
      System.out.println("Grade: F");
    }
  }
}
