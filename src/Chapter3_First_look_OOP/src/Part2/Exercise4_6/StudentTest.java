package Part2.Exercise4_6;

public class StudentTest
{
  public static void main(String[] args)
  {
    //creating 3 Student objects
    Student student1 = new Student("Pramesh", 'M',325833);
    Student student2 = new Student("Rajiv",'F');
    Student student3 = new Student("Suhani", 'F', 125896);

    System.out.println("Name1: " + student1.getName());
    System.out.println("Gender1: " + student1.getGender());
    System.out.println("ID1: " + student1.getStudentNumber());
    System.out.println();
    System.out.println("Name2: " + student2.getName());
    System.out.println("Gender2: " + student2.getGender());
    System.out.println("ID2: " + student2.getStudentNumber());
    System.out.println();
    System.out.println("Name3: " + student3.getName());
    System.out.println("Gender3: " + student3.getGender());
    System.out.println("ID3: " + student3.getStudentNumber());
    System.out.println();

    //calling set method of student1
    student1.setName("John");
    student1.setStudentNumber(258963);
    System.out.println("Name4: " + student1.getName());
    System.out.println("ID4: " + student1.getStudentNumber());
    System.out.println();

    //calling set method of student2
    student2.setName("Jack");
    student2.setStudentNumber(258977);
    System.out.println("Name5: " + student2.getName());
    System.out.println("ID5: " + student2.getStudentNumber());
    System.out.println();

    //calling set method of student3
    student3.setName("Harry");
    student3.setStudentNumber(452871);
    System.out.println("Name5: " + student3.getName());
    System.out.println("ID5: " + student3.getStudentNumber());


  }
}
