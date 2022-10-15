package Challenge6_DriverLicenseExam;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class DriverLicenseTest
{
  public static void main(String[] args)
  {
    //create DriverLicenseExam object
    DriverLicenseExam exam = new DriverLicenseExam();

    Scanner input = new Scanner(System.in);
    System.out.println("Enter student's answers");
    for (int i = 0; i < exam.totalQuestion; i++)
    {
      boolean flag = true;
      do
      {
        String ans = input.next(); //because char has no method
        try
        {
          exam.setUserAnswers(i,ans.charAt(0));  //this will give the character
          flag = false;
        }
        catch (InputValidationException e)
        {
          System.out.println(e.getMessage());
        }
      }while(flag);
    }
    //Displaying total correct answers
    System.out.println("Total correct answers: " + exam.totalCorrect());

    //Displaying total incorrect answers
    System.out.println("Total incorrect answer: " + exam.totalIncorrect());

    //displaying total questions missed
    int[] missedQ = exam.questionMissed();
    System.out.print("Questions Missed: ");
    for(int i = 0; i < exam.questionMissed().length; i++)
    {
      System.out.print(missedQ[i] + " ");
    }
  }
}
