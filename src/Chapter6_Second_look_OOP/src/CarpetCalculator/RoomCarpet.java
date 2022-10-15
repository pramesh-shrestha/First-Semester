package CarpetCalculator;

public class RoomCarpet
{
  private RoomDimension size;
  private double carpetCost;

 //RoomDimension roomDimension = new RoomDimension(size.getLength(), size.getWidth());

 //creating a RoomCarpet constructor
  public RoomCarpet(RoomDimension size, double carpetCost)
  {
    this.size = size;
    this.carpetCost = carpetCost;
  }
  //total cost of carpet
  public double totalCost()
  {
    return carpetCost * size.areaOfTheRoom();
  }

  //get methods of all instance fields
  public double getCarpetCost()
  {
    return carpetCost;
  }
  public RoomDimension getSize()
  {
    return size;
  }

}

