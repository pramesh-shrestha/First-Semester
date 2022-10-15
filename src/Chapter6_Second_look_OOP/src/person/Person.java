package person;

public class Person
{
  private String name;
  private String address;
  private MyDate birthday;

  //3 args constructor
  public Person(String name, String address, MyDate birthday)
  {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
  }

  //2 args constructor
  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday.copy();
  }

  //1 arg constructor
  public Person(MyDate birthday)
  {
    this.birthday = birthday.copy();
  }

  //getname() method
  public String getName()
  {
    return getName();
  }
  //setname() method
  public void setName(String name)
  {
    this.name = name;
  }
  //getaddress() method
  public String getAddress()
  {
    return address;
  }
  //setaddress() method
  public void setAddress(String address)
  {
    this.address = address;
  }
  //getBirthday() method
  public MyDate getBirthday()
  {
    return birthday;
  }

  public void setYear(int year)
  {
    birthday.setYear(year);
  }

  //toString() method
  public String toString()
  {
    return "Name: " + name + " Address: " + address + " Birthday: " + birthday;
  }

  //equals() method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Person))
    {
      return false;
    }
    Person other =  (Person)obj;
    return name.equals(other.name) && address.equals(other.address) && birthday.equals(other.birthday);
  }

  //getAge() method
  public int getAge()
  {
    int year = birthday.getYear();
    int month = birthday.getMonth();
    int day = birthday.getDay();
    int age = 0;


          age =MyDate.today().getYear() - year;

      if(month > MyDate.today().getMonth())
      {
        age = age - 1;
      }
      else if(month == MyDate.today().getMonth() && day > MyDate.today().getDay())
      {
        age = age - 1;
      }
      return age;



  }
}
