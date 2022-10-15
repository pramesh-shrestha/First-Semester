/*Exercise 5.02
Create a class called Job
a) Implement three instance variables: a job title, a monthly salary and an employee.
Call the variables title, salary and employee, where title should be of type String,
salary of type double, and employee of type Person (use one of the Person classes
you have already implemented in the previous exercises).
b) Add a 3-argument constructor setting all three instance variables.
c) Add a 2-argument constructor with job title and salary as argument. Set the
employee to null, a person with the name "No one", or similar.
d) Add get and set methods for all the instance variables.
e) Add a method givePercentageRaise(double percentage) that takes a percentage as
argument and increases the salary with this percentage. An example: the salary is
200 and after calling givePercentageRaise(20) the new salary is increased by
20%, i.e. 200*1,2 = 240.
Now create a test class (JobTest) with a main method and test the class Job
f) Create at least two Job-objects
g) Call the methods you made in class Job, i.e. both constructors, all get and set
methods, and the givePercentageRaise method.
h) Print out all information of each Job-object.
*/
package Part3.Exercise5_2;

public class Job
{
  //crating fields
  private String jobTitle;
  private double salary;
  private Person employee;

  //initializing 3 arguments constructor
  public Job(String jobTitle, double salary, Person employee) {
    this.jobTitle = jobTitle;
    this.salary = salary;
    this.employee = employee;
  }
  //initializing 2 arguments constructor
  public Job(String jobTitle,double salary) {
    this.jobTitle = jobTitle;
    this.salary = salary;
    employee = null;
  }

  //creating set methods
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }
  public void setEmployee(Person employee) {
    this.employee = employee;
  }

  //creating get methods
  public String getJobTitle() {
    return jobTitle;
  }
  public double getSalary() {
    return salary;
  }
  public Person getEmployee() {
    return employee;
  }

  //creating givePercentageRaise() method
  public void givePercentageRaise(double percent) {
    this.salary = salary + (salary * percent/100);
  }
}
