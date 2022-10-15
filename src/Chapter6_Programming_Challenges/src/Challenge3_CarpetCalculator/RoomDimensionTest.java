package Challenge3_CarpetCalculator;

import java.util.Scanner;

public class RoomDimensionTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter length of the room: ");
    double length = input.nextDouble();
    System.out.print("Enter width of the room: ");
    double width = input.nextDouble();
    System.out.print("Enter price per square foot: ");
    double price = input.nextDouble();

    //creating RoomDimension Object because it is the independent one
    RoomDimension roomDimension = new RoomDimension(length,width);
    //creating object of RoomCarpet class to access the totalCost method of the class
    RoomCarpet roomCarpet = new RoomCarpet(roomDimension,price);
    //Now calling the totalCost method of RoomCarpet class
    roomCarpet.totalCost();
    //printing the total cost
    System.out.println(roomCarpet.totalCost());
  }
}
