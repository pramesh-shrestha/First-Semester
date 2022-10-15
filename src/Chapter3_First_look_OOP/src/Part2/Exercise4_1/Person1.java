/*Exercise 4.01
For each of the three classes (Person, MyDate and Payroll) that you created in the
exercises from our last session (Exercise 3.01, 3.02 and 3.03) do the following:
a) Create a constructor with the necessary parameters to initialize the instance
fields in the classes.
b) Create a no-argument constructor to initialize the instance fields to default
values of your choice.
c) Create a toString() method, returning a meaningful representation of objects
from the class.
d) Add the constructors and new methods to your UML class diagrams
e) Add the necessary changes to your existing test classes, to test the new
functionality.
*/
package Part2.Exercise4_1;


public class Person1
{
  private String name;
  private String birthday;

  //Setting up no-arg constructor
  public Person1()
  {
    name = "Pramesh";
    birthday = "Saturday";
  }

  //setting up two parameters constructor
  public Person1(String name, String birthday)
  {
    this.name = name;

    this.birthday = birthday;
  }
    public void setName(String name) {
      name = name;
    }
    public void setBirthday(String birthday) {
      birthday = birthday;
    }
    public String getName() {
      return name;
    }
    public String getBirthday() {
      return birthday;
   }

   //creating toString method
  public String toString() {
    return name+ "\n" + birthday;

  }
}

