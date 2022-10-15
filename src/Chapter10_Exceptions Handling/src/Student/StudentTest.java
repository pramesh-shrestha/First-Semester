package Student;

import java.util.Scanner;

public class StudentTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);


    boolean flag = false;
    do
    {
      System.out.println("Enter a grade: ");

      try{
        int grade = input.nextInt();
        Student s1 = new Student("John", grade);
        System.out.println(s1);
        flag = true;
      }
      catch (IllegalGradeException e)
      {
        System.out.println(e.getMessage());
      }
    }while(!flag);

  }
}
