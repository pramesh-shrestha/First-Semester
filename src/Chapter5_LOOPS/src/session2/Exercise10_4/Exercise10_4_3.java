/*. Write nested loops to draw this pattern:
##
#  #
#   #
#    #
#     #
#      #
*/
package session2.Exercise10_4;

import java.util.Scanner;

public class Exercise10_4_3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows you want to print: ");
    int rows = input.nextInt();


    for(int i = 1; i <= rows; i++) //this is a loop for the rows
    {
      for(int j = 0; j <= i; j++) //this is loop for column
      {
        if(j == 0 || j==i) //this condition allows to print '#' at first and last place
        {
          System.out.print("#");
        }

        else
        {
          System.out.print(" "); //prints space for the rest of position
        }
      }
      System.out.println(); // line break after every row
    }
  }
}
