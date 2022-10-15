import java.util.Scanner;

public class AreaOfAHouse
{
  public static void main(String[] args)
  {
    //creating new Scanner object
    Scanner input = new Scanner(System.in);

    //creating new Rectangle objects
    Rectangle bedRoom = new Rectangle();
    Rectangle livingRoom = new Rectangle();
    Rectangle kitchen = new Rectangle();
    Rectangle bathroom = new Rectangle();

    //getting inputs from user for bedroom
    System.out.print("Enter length of bedroom: ");
    double bedRoomLength = input.nextDouble();
    bedRoom.setLength(bedRoomLength);
    System.out.print("Enter width of bedroom: ");
    double bedRoomWidth = input.nextDouble();
    bedRoom.setWidth(bedRoomWidth);

    //getting inputs from user for living room
    System.out.print("Enter length of living room: ");
    double livingRoomLength = input.nextDouble();
    livingRoom.setLength(livingRoomLength);
    System.out.print("Enter width of living room: ");
    double livingRoomWidth = input.nextDouble();
    livingRoom.setWidth(livingRoomWidth);

    //getting inputs from user for kitchen
    System.out.print("Enter length of kitchen: ");
    double kitchenLength = input.nextDouble();
    kitchen.setLength(kitchenLength);
    System.out.print("Enter width of kitchen: ");
    double kitchenWidth = input.nextDouble();
    kitchen.setWidth(kitchenWidth);

    //getting inputs from user for bathroom
    System.out.print("Enter length of bathroom: ");
    double bathroomLength = input.nextDouble();
    bathroom.setLength(bathroomLength);
    System.out.print("Enter width of bathroom: ");
    double bathroomWidth = input.nextDouble();
    bathroom.setWidth(bathroomWidth);

    //calculating areas of different rooms
    double areaBedRoom = bedRoom.area();
    double areaLivingRoom = livingRoom.area();
    double areaKitchen = kitchen.area();
    double areaBathroom = kitchen.area();

    //adding up all areas to get the total area of the house
    double totalAreaOfHouse = areaBedRoom + areaLivingRoom +  areaKitchen + areaBathroom;
    System.out.printf("The total area is %.2f m².", totalAreaOfHouse);
  }
}
