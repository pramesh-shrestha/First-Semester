package brain;

public class Person
{
  private String name;
  private String address;
  private MyDate birthday;
  private Brain brain;

  //3 args constructor
  public Person(String name, String address, MyDate birthday)
  {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
    brain = new Brain();
  }

  //2 args constructor
  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday.copy();
    brain = new Brain();
  }

  //1 arg constructor
  public Person(MyDate birthday)
  {
    this.birthday = birthday.copy();
    brain = new Brain();
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
    return birthday.copy();
  }

  //getAge() method
  public int getAge()
  {
    int year = birthday.getYear();
    int month = birthday.getMonth();
    int day = birthday.getDay();
    int age = 0;

    if(year < person.MyDate.today().getYear())
    {
      age = person.MyDate.today().getYear() - year;

      if(month < person.MyDate.today().getMonth())
      {
        age = age - 1;
      }
      else if(month == person.MyDate.today().getMonth() && day < MyDate.today().getDay())
      {
        age = age - 1;
      }
      return age;
    }
    else {
      return 0;
    }
  }

  //getIQ() method
  public int getIQ()
  {
    return brain.getIQ();
  }

  //isBrainDamaged() method
  public boolean isBrainDamaged()
  {
    return brain.isBrainDamaged();
  }

  //doYouRemember() method
  public boolean doYouRemember(String topic)
  {
    return brain.recall(topic);
  }

  //rememberThis() method
  public void rememberThis(String topic)
  {
    if(brain.recall(topic))
    {
      brain.refreshMemory(topic);
    }
    else
    {
      brain.remember(topic);
    }
  }
  //whatAreYouThinkingAbout() method
  public String whatAreYouThinkingAbout()
  {
    return brain.recall();
  }
  //toString method

  public String toString()
  {
    return "Person{" + "name='" + name + '\'' + ", address='" + address + '\''
        + ", birthday=" + birthday + ", brain=" + brain + '}';
  }

  //equals() method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Person))
    {
      return false;
    }
    Person other = (Person)obj;
    return name.equals(other.name) &&
        address.equals(other.address) &&
        birthday.equals(other.birthday) &&
        brain.equals(other.brain);
  }
}
