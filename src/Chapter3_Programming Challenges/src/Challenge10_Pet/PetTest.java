package Challenge10_Pet;

import java.util.Scanner;

public class PetTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter name of a pet: ");
    String name = input.nextLine();
    System.out.print("Enter type of the pet: ");
    String type = input.nextLine();
    System.out.print("Enter age of the pet: ");
    int age = input.nextInt();

    //creating Pet object
    Pet pet = new Pet(name,type,age);
    System.out.println("Name: " + pet.getName());
    System.out.println("Type:" + pet.getType());
    System.out.println("Age:" + pet.getAge());
  }
}
