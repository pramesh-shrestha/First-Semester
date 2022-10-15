import javax.swing.*;

public class Confirm
{
  public static void main(String[] args)
  {
    int choice = JOptionPane.showConfirmDialog(null,"Do you want to continue?","Please confirm", JOptionPane.YES_NO_OPTION);
  }
}
