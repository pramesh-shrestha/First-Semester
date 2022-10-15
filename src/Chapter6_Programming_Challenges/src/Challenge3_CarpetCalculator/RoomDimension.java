/*3. Carpet Calculator
The Westfield Carpet Company has asked you to write an application that calculates the
price of carpeting for rectangular rooms. To calculate the price, you multiply the area of the
floor (width times length) by the price per square foot of carpet. For example, the area of
floor that is 12 feet long and 10 feet wide is 120 square feet. To cover that floor with carpet
that costs $8 per square foot would cost $960. (12 3 10 3 8 5 960.)
First, you should create a class named RoomDimension that has two fields: one for the length
of the room and one for the width. The RoomDimension class should have a method that
returns the area of the room. (The area of the room is the room’s length multiplied by the
room’s width.)
Next you should create a RoomCarpet class that has a RoomDimension object as a field. It
should also have a field for the cost of the carpet per square foot. The RoomCarpet class
should have a method that returns the total cost of the carpet.
Figure 6-21 is a UML diagram showing possible class designs and depicting the relationships between the classes.
Once you have written these classes, use them in an application
that asks the user to enter the dimensions of a room and the price per square foot of the
desired carpeting. The application should display the total cost of the carpet.
(The UML diagram is in the book's exercise)*/
package Challenge3_CarpetCalculator;

public class RoomDimension
{
  private double length;
  private double width;

  //creating two arguments constructor
  public RoomDimension(double length, double width)
  {
    this.length = length;
    this.width = width;
  }
  //method to calculate area of the room
  public double areaOfTheRoom()
  {
    return length * width;
  }
  //get methods of all instance fields
  public double getLength()
  {
    return length;
  }
  public double getWidth()
  {
    return width;
  }
}
