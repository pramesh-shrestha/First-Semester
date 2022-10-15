package Challenge3_Personal_information;

public class PersonalInformationTest
{
  public static void main(String[] args)
  {
    //creating three instances of the class PersonalInformation
    PersonalInformation myInfo = new PersonalInformation();
    PersonalInformation friend1 = new PersonalInformation();
    PersonalInformation friend2 = new PersonalInformation();

    //setting my personal info
    myInfo.setName("Pramesh");
    myInfo.setAddress("Kolding");
    myInfo.setAge(10);
    myInfo.setPhoneNumber(123456789);

    //setting values for friend1 object
    friend1.setName("John");
    friend1.setAddress("Horsens");
    friend1.setAge(9);
    friend1.setPhoneNumber(459875121);

    //setting values for friend2 object
    friend2.setName("Rosy");
    friend2.setAddress("Odense");
    friend2.setAge(14);
    friend2.setPhoneNumber(1234561);

    //displaying info for myinfo
    System.out.println("Name: " + myInfo.getName() + "\nAddress: " + myInfo.getAddress()
        + "\nAge: " + myInfo.getAge() + "\nPhone: " + myInfo.getPhoneNumber());

    //displaying info for friend1
    System.out.println("\nName: " + friend1.getName() + "\nAddress: " + friend1.getAddress()
        + "\nAge: " + friend1.getAge() + "\nPhone: " + friend1.getPhoneNumber());

    //displaying info for friend1
    System.out.println("\nName: " + friend2.getName() + "\nAddress: " + friend2.getAddress()
        + "\nAge: " + friend2.getAge() + "\nPhone: " + friend2.getPhoneNumber());

  }
}
