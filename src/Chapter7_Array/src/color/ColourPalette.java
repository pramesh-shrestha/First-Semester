package color;


import java.util.ArrayList;

public class ColourPalette
{
  private int numberOfColours;
  private ArrayList<Colour> colours;

  //constructor
  public ColourPalette(int maxNumberOfColours)
  {
    numberOfColours = maxNumberOfColours;
    colours = new ArrayList<>(maxNumberOfColours);
  }
  //getNumberOfColours
  public int getNumberOfColours()
  {
    return numberOfColours;
  }

  //add
  public void add(Colour colour)
  {
    if(colours.size() < numberOfColours)
    {
      colours.add(colour.copy());
    }
  }
  //get
  public Colour get(int index)
  {
    return colours.get(index).copy();
  }

  //getNumberOfGrayColours
  public int getNumberOfGrayColours()
  {
    int count = 0;
    for(int i = 0; i < colours.size(); i++)
    {
      if(colours.get(i).isGray())
      {
        count += 1;
      }
    }return count;
  }

  //mixColour
  public void mixColour(int index, Colour colour2)
  {
    colours.get(index).mixWith(colour2.copy());
  }
  //equals() method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof ColourPalette))
    {
      return false;
    }
    ColourPalette other =(ColourPalette) obj;
    return numberOfColours == other.numberOfColours && colours.equals(other.colours);
  }

  //toString method
  public String toString()
  {
    String str = "";
    for(int i = 0; i < colours.size(); i++)
    {
      str += colours.get(i) + " ";
    }return "Colours: " + str + "Number of colours: " + numberOfColours;
  }

}
