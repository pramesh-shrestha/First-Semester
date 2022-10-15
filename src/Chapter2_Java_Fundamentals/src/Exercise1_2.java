/*Write a program that has the following String variables: firstName, middleName, and
lastName. Initialize these with your first, middle, and last names. The program should also
have the following char variables: firstInitial, middleInitial, and lastInitial. Store
your first, middle, and last initials in these variables. The program should display the
 contents of these variables on the screen*/

public class Exercise1_2
{
  public static void main(String[] args)
  {
    String firstName, middleName, lastName;
    firstName = "Pramesh";
    middleName = "Lal";
    lastName = "Shrestha";
    char firstInitial, middleInitial, lastInitial;
    firstInitial = 'P';
    middleInitial = 'L';
    lastInitial = 'S';
    System.out.println(firstName + " " + middleName + " " + lastName);
    System.out.println("First initial: " + firstInitial);
    System.out.println("Middle initial: " + middleInitial);
    System.out.println("Last initial: " + lastInitial);

  }
}
