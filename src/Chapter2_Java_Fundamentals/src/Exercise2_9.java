/*Write a program that displays the following pattern:
    *
   ***
  *****
 *******
  *****
   ***
    *
 */
import java.util.Scanner;
public class Exercise2_9
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter half of the total row you want to print: ");
    int row = input.nextInt();
    int space = row - 1;
    int i,j,k;
    for(i = 1; i <= row; i++) {
      for(j = 1; j <= space; j++) {
        System.out.print(" ");
      }
      space -= 1;
      for(k = 1; k <= (2*i - 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    space = 1;
    for(i = 1; i <= (row - 1); i++) {
      for(j = 1; j <= space; j++) {
        System.out.print(" ");
      }
      space += 1;
      for(k = 1; k <= (2 * (row - i) -1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
