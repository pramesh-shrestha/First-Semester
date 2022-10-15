package brain;

public class BrainTest
{
  public static void main(String[] args)
  {
    MyDate birthday = new MyDate(11,12,1988);
    MyDate bithday2 = new MyDate(11,12,1988);
    Brain brain = new Brain();
    Person person = new Person("Pramesh","Kolding", birthday);
    System.out.println(person);
    System.out.println(person.equals(birthday));
    System.out.println(birthday.equals(bithday2));
    brain.remember("Java assignment");
    person.rememberThis("Multiplicative inverse");
    brain.recall("Some text");
    System.out.println(person.whatAreYouThinkingAbout());
  }
}
