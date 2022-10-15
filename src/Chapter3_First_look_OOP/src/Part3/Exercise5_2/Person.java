package Part3.Exercise5_2;/*Exercise 3.01The Part1.Exercise3_1.Person class Create a class called Part1.Exercise3_1.Person representing
 a person with 2 fields: A name (String) and a birthday (String).
 a)First draw a UML class diagram of the class (use astah).
 b)Then implement the class Part1.Exercise3_1.Person in Java.
 c)Add get and set methods for the fields.
 d)Implement a test class with a main method for your class Part1.Exercise3_1.Person,
 where you create at least two Part1.Exercise3_1.Person objects, use the set methods to assign
 values to the fields, and then finally print out the values by using the get methods.
   */

public class Person
{
  //creating fields
  private String name;
  private String birthday;

  //initializing 2 arguments constructor
  public Person(String name, String birthday) {
    this.name =name;
    this.birthday = birthday;
  }

  //creating set methods
  public void setName(String newName) {
    name = newName;
  }
  public void setBirthday(String newBirthday) {
    birthday = newBirthday;
  }

  //creating get methods
  public String getName() {
    return name;
  }
  public String getBirthday() {
    return birthday;
  }
}

