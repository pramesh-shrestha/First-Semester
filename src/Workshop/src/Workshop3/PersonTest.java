package Workshop3;

public class PersonTest
{
  public static void main(String[] args)
  {
    Job job = new Job("chocolate eater","Milka Company", 300);
    Name name = new Name("Beatricia", "Nagit");
    Name petName = new Name("Lexie", "");
    Name petName2 = new Name("Mia", "");
    Pet pet = new Pet(petName);
    Pet pet2 = new Pet(petName2);
    Person person = new Person('F',name,job,pet);


    System.out.println(person.getFullName() + " is working at " + job.getCompany() + " as a " + job.getPosition() + ". She earns\n" + job.getSalary()
        + " per month. She has two pets," + pet + "and " + pet2);

    System.out.println("Is " + name + " male? " + person.isMale() );


  }
}
