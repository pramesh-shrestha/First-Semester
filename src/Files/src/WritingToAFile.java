import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingToAFile
{
  public static void main(String[] args) throws IOException
  {
    //creating instance of FileWrite object to establish connection between FileWrite and Test.txt file
    FileWriter writer = new FileWriter("E:/Test.txt");
    writer.write("What is up?\n");
    writer.close();
    FileWriter writer1 = new FileWriter("E:/Test.txt",true);
    writer1.write("Some more appended text to the previous file");
    writer1.close();


  }
}
