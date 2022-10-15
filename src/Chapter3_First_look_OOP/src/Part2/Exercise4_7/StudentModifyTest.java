package Part2.Exercise4_7;

import Part2.Exercise4_6.Student;

public class StudentModifyTest
{
  public static void main(String[] args)
  {
    //creating 3 Student objects
    StudentModify student1 = new StudentModify("Pramesh", 'M',325833);
    StudentModify student2 = new StudentModify("Rajiv",'F');
    StudentModify student3 = new StudentModify("Suhani", 'F', 125896);

    System.out.println(student1);
    System.out.println(student2);
    System.out.println(student3);
  }
}

