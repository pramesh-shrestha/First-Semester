package Student;

import java.util.Scanner;

public class Test
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = input.nextLine();
    boolean flag = false;
    do {
      System.out.println("Enter your grade");
     int grade = input.nextInt();
      try{
        Student student = new Student(name, grade);
        System.out.println(student);
        flag = true;
      }
      catch (IllegalGradeException e)
      {
        System.out.println(e.getMessage());
      }
    } while(!flag);

  }
}
