/*Write an application that uses a Scanner object, to read your name, age
and address. Afterwards the application should display the information
on the screen. */

import java.util.Scanner;
public class Exercise2_4
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = input.nextLine();
    System.out.print("Enter your age: ");
    int age = input.nextInt();
    //removing the line character (\n) to make it possible to use nextLine() method after nextInt() method
    input.nextLine();
    System.out.print("Enter your address: ");
    String address = input.nextLine();
    System.out.printf("Your name is %s\n", name);
    System.out.printf("Your age is %d\n", age);
    System.out.printf("Your address is %s", address);
  }
}
