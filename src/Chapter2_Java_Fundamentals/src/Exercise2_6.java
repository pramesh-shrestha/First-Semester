/*Write a program that plays a word game with the user. The program should ask the user
to enter the following:
-His or her name
-His or her age
-The name of a city
-The name of a college
-A profession
-A type of animal
-A pet's name
After the user has entered these items, the program should display the following story,
inserting the user’s input into the appropriate locations:
There once was a person named NAME who lived in CITY. At the age of AGE,
NAME went to college at COLLEGE. NAME graduated and went to work as a
PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived
happily ever after!*/
import java.util.Scanner;
public class Exercise2_6
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter name: ");
    String name = input.nextLine();
    System.out.println(name);
    System.out.print("Enter your age when you started your college: ");
    int age = input.nextInt();
    input.nextLine();
    System.out.print("Enter city you live in: ");
    String city = input.nextLine();
    System.out.print("Enter your college you graduated from: ");
    String college = input.nextLine();
    System.out.print("Enter profession: ");
    String profession = input.nextLine();
    System.out.print("Enter animal you have: ");
    String animal = input.nextLine();
    System.out.print("Enter pet's name: ");
    String petName = input.nextLine();
    System.out.printf("There once was a person named %s who lived in %s.\nAt the age of %d, %s went to college at %s.\n" +
        "%s graduated and went to work as a %s.\nThen, %s adopted a %s named %s. They both lived happily ever after!"
        , name,city,age,name,college,name,profession,name,animal,petName);
  }
}
