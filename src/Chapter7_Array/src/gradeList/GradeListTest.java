package gradeList;

public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList gradeList = new GradeList(3);
    gradeList.setGrade(7,0);
    gradeList.setGrade(4,1);
    gradeList.setGrade(12,2);

    GradeList gradeList1 = new GradeList(3);
    gradeList.setGrade(7,0);
    gradeList.setGrade(4,1);
    gradeList.setGrade(12,2);

    System.out.println(gradeList.getAverage());
    System.out.println(gradeList.getGrade(2));
    System.out.println(gradeList);
    System.out.println(gradeList.equals(gradeList1));

  }
}
