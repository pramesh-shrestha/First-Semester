package RandomIntegers;

import java.io.*;
import java.util.Scanner;

public class ReadRandomIntegers
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a file name");
    String fileName = input.nextLine();
    try
    {
      FileInputStream fileIn = new FileInputStream("Files/src/RandomIntegers/" + fileName);
      ObjectInputStream read = new ObjectInputStream(fileIn);
      while(true)
      {
        try
        {
          int content = read.readInt();
          System.out.println(content);
        }
        catch (EOFException e)
        {
          System.out.println("End of line.");
          break;
        }
      }
      read.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found.");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO reading file.");
      System.exit(1);
    }
  }
}
