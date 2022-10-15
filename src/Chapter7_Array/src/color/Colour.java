package color;

public class Colour
{
  private int red;
  private int green;
  private int blue;

  //constructor
  public Colour(int red, int green, int blue)
  {
    set(red,green,blue);
  }
  //setMethod
  public void set(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }
  //getMethods
  public int getRed()
  {
    return red;
  }
  public int getGreen()
  {
    return green;
  }
  public int getBlue()
  {
    return blue;
  }
  //isGray()
  public boolean isGray()
  {
    if(red == green && green == blue)
    {
      return true;
    }
    return false;
  }

  //mixWith
  public void mixWith(Colour colour2)
  {
    red = (int)(0.5 * red + 0.5 * colour2.getRed());
    green = (int)(0.5 * green + 0.5 * colour2.getGreen());
    blue = (int)(0.5 * blue + 0.5 * colour2.getBlue());
  }

  //copy()
  public Colour copy()
  {
    return new Colour(red,green,blue);
  }

  //equals() method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Colour))
    {
      return false;
    }
    Colour other = (Colour) obj;
    return red == other.red && green == other.green && blue == other.blue;
  }

  //toString()
  public String toString()
  {
    return "Red: " + red + "Green: " + green + "Blue: " + blue;
  }
}
