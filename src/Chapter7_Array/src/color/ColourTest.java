package color;

public class ColourTest
{
  public static void main(String[] args)
  {
    Colour c1 = new Colour(1,2,3);
    Colour c2 = new Colour(4,5,6);
    ColourPalette temp = new ColourPalette(3); // maxnumofcolors , arraylist<color>
    ColourPalette temp2 = new ColourPalette(3); // maxnumofcolors , arraylist<color>

    temp.add(c1);
    temp.add(c2);

    temp2.add(c2);
    temp2.add(c1);

    System.out.println(temp.equals(temp2));
  }
}
