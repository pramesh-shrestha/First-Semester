package secondGradeList;

public class GradeTest
{
  public static void main(String[] args)
  {
    Grade grade1 = new Grade("SDJ", 12);
    Grade grade2 = new Grade("RWD", 12);
    Grade grade3 = new Grade("DMA", 12);
    Grade grade4 = new Grade("WSI", 12);
    Grade grade5 = new Grade("SEP", 12);

    GradeList gradeList1 = new GradeList(5); //this is my grade list

    gradeList1.setGrades(grade1,0);
    gradeList1.setGrades(grade2,1);
    gradeList1.setGrades(grade3,2);
    gradeList1.setGrades(grade4,3);
    gradeList1.setGrades(grade5,4);
    System.out.println(gradeList1);


  }
}
