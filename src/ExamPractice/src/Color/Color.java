package Color;

public class Color
{
  private int red;
  private int green;
  private int blue;

  public Color(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public void set(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

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
  public boolean isGray()
  {
    if(red == green && green == blue)
    {
      return  true;
    }
    return false;
  }
  public void  mixWith(Color color2)
  {
    red = (int)(0.5 * red + 0.5 * color2.getRed());
    green = (int)(0.5 * green + 0.5 * color2.getGreen());
    blue = (int)(0.5 * blue + 0.5 * color2.getBlue());
  }

  public Color copy()
  {
    return new Color(red,green,blue);
  }
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Color))
    {
      return false;
    }
    Color other = (Color) obj;
    return red == other.red && green == other.green && blue == other.blue;
  }

  //toString()
  public String toString()
  {
    return "Red: " + red + "Green: " + green + "Blue: " + blue;
  }
}
