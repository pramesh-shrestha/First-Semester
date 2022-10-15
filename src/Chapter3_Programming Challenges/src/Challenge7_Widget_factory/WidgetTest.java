package Challenge7_Widget_factory;

import java.util.Scanner;

public class WidgetTest
{
  public static void main(String[] args)
  {
    //total number of widget to produce
    Scanner input = new Scanner(System.in);
    System.out.print("Enter total widgets you want to produce: ");
    int totalProduction = input.nextInt();

    //get input from user about how many widgets can be produced in an hour
    System.out.print("Enter total widgets produced in an hour: ");
    int widgetPerHour = input.nextInt();
    //total hours worked in a day
    System.out.print("Enter total hours worked in a day: ");
    int hours = input.nextInt();

    //creating Widget class object
    Widget widget = new Widget(totalProduction);

    //calculating widgets per day
    int total = widgetPerHour * hours;

    //using set method to store value in the class's fields
    widget.setWidgetPerDay(total);
    //displaying total days taken to produce the given amount of widgets
    System.out.println("It will take " + widget.production() + " days to produce " + totalProduction + " widgets");
  }
}
