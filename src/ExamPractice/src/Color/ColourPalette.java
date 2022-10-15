package Color;

import java.util.ArrayList;

public class ColourPalette
{
  private int numberOfColours;
  private ArrayList<Color> colors;

  public ColourPalette(int maxNumberOfColours)
  {
    numberOfColours = maxNumberOfColours;
    colors = new ArrayList<>(maxNumberOfColours);
  }

  public int getNumberOfColours()
  {
    return numberOfColours;
  }
  public void add(Color color)
  {
    if(colors.size() < numberOfColours)
    {
      colors.add(color.copy());
    }

  }
  public Color get(int index)
  {
    return colors.get(index).copy();
  }
  public int getNumberOfGrayColors()
  {
    int count = 0;
    for (int i = 0; i < colors.size(); i++)
    {
      if(colors.get(i).isGray())
      {
        count++;
      }
    }
    return count;
  }
  public void mixColour(int index, Color color2)
  {
    colors.get(index).mixWith(color2.copy());
  }
  public boolean equals(Object obj)
  {
    if(!(obj instanceof ColourPalette))
    {
      return false;
    }
    ColourPalette other =(ColourPalette) obj;
    return numberOfColours == other.numberOfColours && colors.equals(other.colors);
  }

  //toString method
  public String toString()
  {
    String str = "";
    for(int i = 0; i < colors.size(); i++)
    {
      str += colors.get(i) + " ";
    }return "Colours: " + str + "Number of colours: " + numberOfColours;
  }
}
