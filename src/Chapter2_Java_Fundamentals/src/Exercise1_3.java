/*Write a program that displays the following information, each on a separate line:
● Your name
● Your address, with city, state, and ZIP
● Your telephone number
● Your college major
Although these items should be displayed on separate output lines, use only a single println
statement in your program.*/

public class Exercise1_3
{
  public static void main(String[] args)
  {
    String name = "Pramesh Shrestha";
    String address = "Hestehaven 39, Kolding";
    int zip = 6000;
    String collegeMajor = "Software engineering";
    System.out.println(name);
    System.out.println(address);
    System.out.println(zip);
    System.out.println(collegeMajor);
  }
}
