import java.util.Scanner;
public class AreaOfRectangle
{
 public static void main(String[] args)
 {
   //creating new Scanner object
   Scanner input = new Scanner(System.in);
   //creating new Rectangle object
   Rectangle box = new Rectangle();
   System.out.print("Enter length: ");
   //getting user input
   double newLength = input.nextDouble();
   //calling the method setLength()
   box.setLength(newLength);
   System.out.print("Enter width: ");
   //getting use input
   double newWidth = input.nextDouble();
   //calling the method setWidth()
   box.setWidth(newWidth);
   //calling the method area() and assigning the value to newArea
   double newArea = box.area();
   System.out.printf("The area is %.2f",newArea );
 }
}