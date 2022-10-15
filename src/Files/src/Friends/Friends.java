package Friends;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*Programming Exercises - SDJ - Session 24
Exercise 24.01
Write a program that asks the users to input names of all their friends. The program should write all
the names to a file specified by the user. The first keyboard input is the name of the file and the
following inputs are names of friends. To finish the keyboard input type DysteONE. Then try to open
the file using Notepad or similar to see its content.
An example run could be the following (bold text is user input):
Type filename: friends.txt
Type name of friend: Bob
Type name of friend: Carl
Type name of friend: Dave
Type name of friend: DONE

Now the file “friends.txt” should contain the following:
Bob
Carl
Dave */
public class Friends
{
  public static void main(String[] args)
  {
    PrintWriter writer = null;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a file name you want to create: ");
    String fileName = input.nextLine();

    try
    {
      FileOutputStream fileOut = new FileOutputStream("Files/src/Friends/" + fileName);
      writer = new PrintWriter(fileOut);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found.");
      System.exit(1);
    }
    System.out.println("Enter names of friends:");
    String friends;
    do
    {
      friends = input.nextLine();
      if(!friends.equalsIgnoreCase("done"))
      {
        writer.println(friends);
      }
    }while(!friends.equalsIgnoreCase("done"));

    System.out.println("Writing done.");
    writer.close();

  }
}
