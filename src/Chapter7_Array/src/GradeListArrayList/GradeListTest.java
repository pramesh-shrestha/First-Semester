package GradeListArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GradeListTest
{
  public static void main(String[] args)
  {
    //creating 4 grades objects
    Grade grade1 = new Grade("SDJ",12);
    Grade grade2 = new Grade("RWD",12);
    Grade grade3 = new Grade("DMA",12);
    Grade grade4 = new Grade("SEP",12);

    //creating gradelist object
    GradeList gradeList1 = new GradeList();
    //adding grades to gradelist
    gradeList1.addGrade(grade1);
    gradeList1.addGrade(grade2);
    gradeList1.addGrade(grade3);
    gradeList1.addGrade(grade4);
    System.out.println(gradeList1); //printing all grades

    //printing out average
    System.out.print("The average is: ");
    System.out.println(gradeList1.getAverage());


  }
}
