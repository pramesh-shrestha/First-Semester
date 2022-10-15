package Kindergarten;

import java.util.ArrayList;

public class Kindergarten
{
  private int countTeachers;
  private ArrayList<Child> childs;

  public Kindergarten()
  {
    countTeachers = 0;
    childs = new ArrayList<>();
  }

  //addChild
  public void addChild(Child child)
  {
    childs.add(child);
  }

  //removeChild
  public void removeChild(Child child)
  {
    childs.remove(child);
  }

  //hireTeachers
  public void hireTeachers(int count)
  {
    countTeachers += count;
  }

  //fireTeachers
  public void fireTeachers()
  {
    countTeachers--;
  }

  //countChildren
  public int countChildren()
  {
   return childs.size();
  }

  //countTeachers
  public int countTeachers()
  {
    return countTeachers;
  }

  //getAverageChildAge
  public double getAverageChildAge()
  {
    int ageTotal = 0;
    for(int i = 0; i < childs.size(); i++)
    {
      ageTotal += childs.get(i).getAge();
    }
    double averageAge = (double)ageTotal/childs.size();
    return averageAge;
  }

  //getNorm
  public double getNorm()
  {
    return (double)childs.size()/countTeachers;

  }

  //celebrateBirthday
  public void celebrateBirthday(String name)
  {
    for(int i = 0; i < childs.size(); i++)
    {
      if(childs.get(i).getName().equals(name))
      {
        childs.get(i).setAge(childs.get(i).getAge() + 1);
      }
    }
  }

  //toString
  public String toString()
  {
    String str = "";
    for(int i = 0; i < childs.size(); i++)
    {
      str += childs.get(i) + "\n";
    }
    return "Children: " + str + "\n" + "Teachers: " + countTeachers;
  }

}
