package Course;

public class Test
{
  public static void main(String[] args)
  {
    Instructor instructor = new Instructor("Pramesh",605);
    Instructor instructor1 = new Instructor("Rajib", 322);

    Student student1 = new Student("Suhani", 1);
    Student student2 = new Student("Rodrigo", 1);

    Course course =new Course("SDJ", instructor);
    Course course1 =new Course("RWD", instructor1);

    course.addStudent(student1);
    course.addStudent(student2);


    System.out.println(course.getNumberOfInstructors());
    System.out.println(course.getNumberOfStudents(1));
    System.out.println(course1.getNumberOfStudents(1));
    System.out.println(course);
  }
}
