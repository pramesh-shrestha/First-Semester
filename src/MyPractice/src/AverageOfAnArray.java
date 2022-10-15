/*Calculate the average marks from an array containing marks of all students in
Physics using for-each loop*/

import java.util.Scanner;
public class AverageOfAnArray
{
  public static void main(String[] args)
  {
    //allocating memory for the inputs from the user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter total number of students: ");
    //getting inputs from a user
    int totalStudents = input.nextInt();
    float[] marks = new float[totalStudents];
    //declare and initialize sum
    float sum = 0;
    System.out.println("Enter marks of each student: ");
    //adding elements to the array
    for(int i = 0; i < totalStudents; i++){
      marks[i] = input.nextFloat();
      //adding each marks of the array
      sum = sum + marks[i];
    }
    float average = sum/totalStudents;
    System.out.println("The average marks is: " + average);
  }

}
