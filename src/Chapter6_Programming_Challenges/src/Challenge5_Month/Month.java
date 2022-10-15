/*5. Month class
Write a class named Month. The class should have an int field named monthNumber that
holds the number of the month. For example,
January would be 1, February would be 2, and so forth. In addition, provide the following
methods:
● A no-arg constructor that sets the monthNumber field to 1.
● A constructor that accepts the number of the month as an argument. It should set the
monthNumber field to the value passed as the argument. If a value less than 1 or greater
than 12 is passed, the constructor should set monthNumber to 1.
● A constructor that accepts the name of the month, such as “January” or “February”,
as an argument. It should set the monthNumber field to the correct corresponding value.
● A setMonthNumber method that accepts an int argument, which is assigned to the
monthNumber field. If a value less than 1 or greater than 12 is passed, the method
should set monthNumber to 1.
● A getMonthNumber method that returns the value in the monthNumber field.
● A getMonthName method that returns the name of the month. For example, if the
monthNumber field contains 1, then this method should return “January”.
● A toString method that returns the same value as the getMonthName method.
● An equals method that accepts a Month object as an argument. If the argument object
holds the same data as the calling object, this method should return true. Otherwise,
it should return false.
● A greaterThan method that accepts a Month object as an argument. If the calling
object’s monthNumber field is greater than the argument’s monthNumber field, this
method should return true. Otherwise, it should return false.
● A lessThan method that accepts a Month object as an argument. If the calling object’s
monthNumber field is less than the argument’s monthNumber field, this method should
return true. Otherwise, it should return false.*/
package Challenge5_Month;

public class Month
{
  private int monthNumber;

  //no arg constructor
  public Month()
  {
    monthNumber = 1;
  }

  //1 arg constructor
  public Month(int monthNumber)
  {
    setMonthNumber(monthNumber);
    this.monthNumber = monthNumber;
  }
  //constructor that accepts name of the month
  public Month(String name)
  {
    if(name.equalsIgnoreCase("january"))
    {
      setMonthNumber(1);
    }
    else if(name.equalsIgnoreCase("february"))
    {
      setMonthNumber(2);
    }
    else if(name.equalsIgnoreCase("march"))
    {
      setMonthNumber(3);
    }
    else if(name.equalsIgnoreCase("april"))
    {
      setMonthNumber(4);
    }
    else if(name.equalsIgnoreCase("may"))
    {
      setMonthNumber(5);
    }
    else if(name.equalsIgnoreCase("june"))
    {
      setMonthNumber(6);
    }
    else if(name.equalsIgnoreCase("july"))
    {
      setMonthNumber(7);
    }
    else if(name.equalsIgnoreCase("august"))
    {
      setMonthNumber(8);
    }
    else if(name.equalsIgnoreCase("september"))
    {
      setMonthNumber(9);
    }
    else if(name.equalsIgnoreCase("october"))
    {
      setMonthNumber(10);
    }
    else if(name.equalsIgnoreCase("november"))
    {
      setMonthNumber(11);
    }
    else if(name.equalsIgnoreCase("december"))
    {
      setMonthNumber(12);
    }
    else
    {
      System.out.println("Invalid month name");
    }
  }

  //setMonthNumber
  public void setMonthNumber(int monthNumber)
  {
    if(monthNumber < 1 || monthNumber > 12)
    {
      monthNumber = 1;
    }
    this.monthNumber = monthNumber;
  }

  //getMonthNumber
  public int getMonthNumber()
  {
    return monthNumber;
  }
  //getMonthName
  public String getMonthName()
  {
    if(monthNumber == 1)
    {
      return "January";
    }
    else if(monthNumber == 2)
    {
      return "February";
    }
    else if(monthNumber == 3)
    {
      return "March";
    }
    else if(monthNumber == 4)
    {
      return "April";
    }
    else if(monthNumber == 5)
    {
      return "May";
    }
    else if(monthNumber == 6)
    {
      return "June";
    }
    else if(monthNumber == 7)
    {
      return "July";
    }
    else if(monthNumber == 8)
    {
      return "August";
    }
    else if(monthNumber == 9)
    {
      return "September";
    }
    else if(monthNumber == 10)
    {
      return "October";
    }
    else if(monthNumber == 11)
    {
      return "November";
    }
    else if(monthNumber == 12)
    {
      return "December";
    }
    else
    {
      return "Invalid month number";
    }
  }

  //toString
  public String toString()
  {
    return "Month Number: " + monthNumber + " Month: " + getMonthName();
  }

  //equals
  public boolean equals(Month obj)
  {
    return monthNumber == obj.monthNumber;
  }

  //greaterThan
  public boolean greaterThan(Month month)
  {
    if(monthNumber > month.monthNumber)
    {
      return true;
    }
    return false;
  }

  //lessThan
  public boolean lessThan(Month month)
  {
    if(monthNumber < month.monthNumber)
    {
      return true;
    }
    return false;
  }

}
