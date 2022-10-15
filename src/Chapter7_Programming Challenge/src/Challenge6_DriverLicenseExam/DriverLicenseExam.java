package Challenge6_DriverLicenseExam;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DriverLicenseExam
{
  public final int totalQuestion = 20;
  private char[] correctAnswers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
  private char[] userAnswers;

  //constructors
  public DriverLicenseExam()
  {
    userAnswers = new char[20];
  }
  //setUserAnswers
  public void setUserAnswers(int index, char ans)
  {
    if(ans != 'A' && ans != 'B' && ans != 'C' && ans != 'D' && ans != '0')
    {
      throw new InputValidationException("Invalid character, enter A, B , C or D");
    }
    this.userAnswers[index] = ans;
  }

  //getUserAnswers
  public char getUserAnswers(int index)
  {
    return userAnswers[index];
  }

  //passed
  public boolean passed()
  {
    if(totalCorrect() >= 15)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  //If the user answer and the correct answer at same index matches then the answer is correct
  public int totalCorrect()
  {
    int rightAnswers = 0;
    for(int i = 0; i < totalQuestion; i++)
    {
      if(userAnswers[i] == correctAnswers[i])
      {
        rightAnswers += 1;
      }
    }
    return rightAnswers;
  }

  //The difference between the question length and the correct answer from the above method gives total number of incorrect answers
  public int totalIncorrect()
  {
    return totalQuestion - totalCorrect();
  }


  //If any array index has default value 0, then the question is unanswered
  public int[] questionMissed()
  {
    //count total question missed
    int count = 0;
    for(int i = 0; i < totalQuestion; i++)
    {
      if(userAnswers[i] == '0')
      {
        count++; //this provides the total questions that were unanswered
      }
    }
    int index = 0;
    //the size of the array is the total unanswered question
    int[] missed = new int[count];
    for(int i = 0; i < totalQuestion; i++)
    {
      if(userAnswers[i] == '0')
      {
        missed[index] = i + 1;
        index++;
      }
    }
    return missed;
  }
}
