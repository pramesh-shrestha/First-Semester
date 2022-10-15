
/*Exercise 24.02
Write a program that can read and print out all contents of any text file. The program should ask the
user for the name of a text file, open that file, and then print out every line from the file.
If the file is “friends.txt” from the previous exercise (if that’s what you called the file) the output
could be:
Contents of the file friends.txt:
Bob
Carl
Dave */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile
{
  public static void main(String[] args)
  {
    Scanner reader = null;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a file name:");
    String fileName = input.nextLine();
    try
    {
      FileInputStream fileIn = new FileInputStream("Files/src/Friends/" + fileName);
      reader = new Scanner(fileIn);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File you entered do not exist.");
      System.exit(1);
    }
    System.out.println("Reading text file:");
    while(reader.hasNext())
    {
      System.out.println(reader.nextLine());
    }
    reader.close();
  }
}
