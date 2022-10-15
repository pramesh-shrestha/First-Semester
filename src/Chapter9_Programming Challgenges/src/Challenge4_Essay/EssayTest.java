package Challenge4_Essay;

import java.util.Scanner;

public class EssayTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter point for grammar: ");
    int grammar = input.nextInt();
    System.out.print("Enter point for spelling: ");
    int spelling = input.nextInt();
    System.out.print("Enter point for correct length: ");
    int length = input.nextInt();
    System.out.print("Enter point for content: ");
    int content = input.nextInt();

    //calculating total score
    int totalScore = grammar + spelling + length + content;

    //creating Essay object
    Essay essay = new Essay(grammar,spelling,length,content);

    //setting score in superclass
    essay.setScore(totalScore);

    //determining and displaying grade
    System.out.println("Point obtained");
    System.out.println("--------------");
    System.out.println(essay);
    System.out.println("Grade          : " + essay.getGrade()); //inheritance allow Essay(subclass) to use methods of superclass(GradedActivity)

  }
}
