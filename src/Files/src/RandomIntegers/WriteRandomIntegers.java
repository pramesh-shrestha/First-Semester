/*Exercise 24.03
Implement a program that generates some random integers and writes them to a binary file. First the
program should ask the user to input how many integers it should make.
Then implement another program that can read the binary file and print its contents to the screen.*/
package RandomIntegers;


import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class WriteRandomIntegers
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How many integers should it make?");
    int num = input.nextInt();

    Random rand = new Random();
    int randNum = 0;

    try
    {
      FileOutputStream fileOut = new FileOutputStream("Files/src/RandomIntegers/Random.bin");
      ObjectOutputStream write = new ObjectOutputStream(fileOut);

      for(int i = 0; i < num; i++)
      {
        randNum = rand.nextInt(100);
        write.writeInt(randNum);
      }

      write.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO error writing to a file");
    }
    System.out.println("Done writing.");

  }

}
