package person;


public class MyDateTest
{
  public static void main(String[] args)
  {
    MyDate birthday = new MyDate(2,3,2002);
    Person person1 = new Person("Rohit", birthday);
    Person person2 = new Person("Manisha",birthday);
    person1.setYear(2020);
    System.out.println(person1.getAge());
    System.out.println(person2.getAge());
  }
}
