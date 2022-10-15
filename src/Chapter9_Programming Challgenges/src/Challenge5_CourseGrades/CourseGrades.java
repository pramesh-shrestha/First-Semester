/**
 * 5. Course Grades
 * In a course, a teacher gives the following tests and assignments:
 * ● A lab activity that is observed by the teacher and assigned a numeric score.
 * ● A pass/fail exam that has 10 questions. The minimum passing score is 70.
 * ● An essay that is assigned a numeric score.
 * ● A final exam that has 50 questions.
 Write a class named CourseGrades. The class should have a GradedActivity array named
 grades as a field. The array should have four elements, one for each of the assignments
 previously described. The class should have the following methods:
 * setLab: This method should accept a GradedActivity object as its argument. This object should already hold the student’s score for the
 * lab activity. Element 0 of the grades "eld should reference this
   object.
 * setPassFailExam: This method should accept a PassFailExam object as its argument. This object should already hold the student’s score for the
 * pass/fail exam. Element 1 of the grades "eld should reference this
   object.
 * setEssay: This method should accept an Essay object as its argument. (See
   Programming Challenge 4 for the Essay class. If you have not
   completed Programming Challenge 4, use a GradedActivity
   object instead.) This object should already hold the student’s
   score for the essay. Element 2 of the grades "eld should reference
   this object.
 * setFinalExam: This method should accept a FinalExam object as its argument.
   This object should already hold the student’s score for the "nal
   exam. Element 3 of the grades "eld should reference this object.
 * toString: This method should return a string that contains the numeric
   scores and grades for each element in the grades array.
 Demonstrate the class in a program.
 */
package Challenge5_CourseGrades;

public class CourseGrades extends GradedActivity
{
  private GradedActivity[] grades;

  /**constructor*/
  public CourseGrades()
  {
    super();
    grades = new GradedActivity[4];
  }

  /**setLab*/
  public void setLab(GradedActivity gradedActivity)
  {
    /**Element 0 of the grades "eld should reference this
     object*/
    grades[0] = gradedActivity;
  }

  /**setPassFailExam*/
  public void setPassFailExam(PassFailExam passFailExam)
  {
    grades[1] = passFailExam;
  }

  /**setEssay*/
  public void setEssay(Essay essay)
  {
    grades[2] = essay;
  }

  /**setFinalExam*/
  public void setFinalExam(FinalExam finalExam)
  {
    grades[3] = finalExam;
  }

  /**toString*/
  public String toString()
  {
    return "Lab score: " + grades[0] + "\n" +
        "Pass/Fail: " + grades[1] + "\n" +
        "Essay score: " + grades[2] + "\n" +
        "Final score: " + grades[3];
  }


}
