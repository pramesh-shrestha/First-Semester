package Challenge5_CourseGrades;

public class CourseGradesTest
{
  public static void main(String[] args)
  {
    //creating GradedActivity object
    GradedActivity gradedActivity = new GradedActivity();
    gradedActivity.setScore(75);
    //creating FinalExam object
    FinalExam finalExam = new FinalExam(50,10);
    //creating Essay object
    Essay essay = new Essay(30,20,20,20);
    //creating PassFailExam object
    PassFailExam passFailExam = new PassFailExam(80);
    //Creating CourseGrade object
    CourseGrades grades = new CourseGrades();
    //setting finalExam score
    grades.setFinalExam(finalExam);
    //setting essay score
    grades.setEssay(essay);
    //setting lab score
    grades.setLab(gradedActivity);
    //Setting pass fail score
    grades.setPassFailExam(passFailExam);
    System.out.println(grades);

  }
}
