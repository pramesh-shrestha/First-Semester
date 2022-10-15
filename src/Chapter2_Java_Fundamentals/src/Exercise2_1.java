/*12. String Manipulator
Write a program that asks the user to enter the name of his or her favorite city.
Use a String
variable to store the input. The program should display the following:
-The number of characters in the city name
-The name of the city in all uppercase letters
-The name of the city in all lowercase letters
-The first character in the name of the city
 */
import javax.swing.JOptionPane;
import java.util.Locale;

public class Exercise2_1
{
  public static void main(String[] args)
  {
    String favouriteCity = JOptionPane.showInputDialog("Enter your favourite city's name");
    JOptionPane.showMessageDialog(null, "The total number of characters is " +
        favouriteCity.length());
    JOptionPane.showMessageDialog(null, favouriteCity.toUpperCase());
    JOptionPane.showMessageDialog(null,favouriteCity.toLowerCase());
    JOptionPane.showMessageDialog(null, "The first character is " +
        favouriteCity.charAt(0));
  }
}
