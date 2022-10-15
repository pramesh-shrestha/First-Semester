/*Write a program that calculates and prints the circumference and area of a
circle with radius 22.5. (Hint: The circumference of a circle is 2πr, the area
is πr2. The expression Math.PI gives a value for π).*/

public class Exercise1_6
{
  public static void main(String[] args)
  {
    float radius = 22.5f;
    double circumference = 2 * Math.PI * radius;
    double area = Math.PI * radius * radius;
    System.out.printf("The circumference is %.2f", circumference);
    System.out.printf("\nThe area is %.2f", area);

  }
}
