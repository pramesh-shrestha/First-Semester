/*7. Widget Factory
Design a class for a widget manufacturing plant. The class should have a method whose
argument is the number of widgets that must be produced. The class should have another
method that calculates how many days it will take to produce the number of widgets.
(Assume that 10 widgets can be produced each hour. The plant operates two shifts of eight
hours each per day.)*/
package Challenge7_Widget_factory;

public class Widget
{
  //declaring fields of class
  private int totalWidget;
  private int widgetPerDay;

  //crating one argument constructor
  public Widget(int totalWidget)
  {
    this.totalWidget = totalWidget;
  }
  //creating set method
  public void setWidgetPerDay(int widgetPerDay)
  {
    this.widgetPerDay = widgetPerDay;
  }
  //creating production() method that return the total days to produce the given widgets
  public int production()
  {
    if(totalWidget % widgetPerDay == 0)
    {
      return totalWidget/widgetPerDay;
    }
    else
    {
      return totalWidget/widgetPerDay + 1;
    }
  }
}
