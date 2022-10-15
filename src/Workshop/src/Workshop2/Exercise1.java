/*Exercise1: Write a program that asks the user to enter the names of his/her family members.
After the question it should ask if he/she has more, if yes it should ask again,
if not the program should stop.*/
package Workshop2;

import java.util.Scanner;

public class Exercise1
{
  public static void main(String[] args)
  {
    char nameChar;
    do {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter names of your family members: ");
      String famName = input.nextLine();
      System.out.println("Do you have more?, Y/N");
      String moreMembers = input.nextLine();
      nameChar = moreMembers.charAt(0);
    }while(nameChar == 'Y' || nameChar == 'y');
  }
}
