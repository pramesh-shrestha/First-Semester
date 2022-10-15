/*Write a program that asks the user to enter three test scores. The program should display
each test score, as well as the average of the scores.*/
import java.util.Scanner;
public class Exercise2_5
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first score: ");
    float score1 = input.nextFloat();
    System.out.print("Enter second score: ");
    float score2 = input.nextFloat();
    System.out.print("Enter third score: ");
    float score3 = input.nextFloat();
    float average = (score1 + score2 + score3)/3;
    System.out.printf("The first score is %.2f.\nThe second score is %.2f.\n" +
        "The third score is %.2f.\nThe average is %.2f", score1, score2, score3, average);
  }
}
