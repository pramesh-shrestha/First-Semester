import javax.swing.*;

public class Option
{
  public static void main(String[] args)
  {
    int choice = JOptionPane.showConfirmDialog(null,"Do you want to continue?");

    //optional
    if(choice == 0)
    {
      System.out.println("Yes");
    }
    else if(choice == JOptionPane.NO_OPTION)
    {
      System.out.println("No");
    }
    else if(choice == 2)
    {
      System.out.println("Cancel");
    }
  }
}
