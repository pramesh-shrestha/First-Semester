package Workshop6;

import java.util.ArrayList;

public class Animal
{
  private int nrOfColors;
  private String sound;
  private String ownerName;
  private String name;
  private ArrayList<String> colors;

  public Animal(int nrOfColors,String sound, String ownerName,String name)
  {
    this.nrOfColors = nrOfColors;
    this.sound = sound;
    this.ownerName = ownerName;
    this.name = name;
    colors = new ArrayList<>();
  }

  public int getNrOfColors()
  {
    return nrOfColors;
  }

  public void setNrOfColors(int nrOfColors)
  {
    this.nrOfColors = nrOfColors;
  }

  public String getSound()
  {
    return sound;
  }

  public void setSound(String sound)
  {
    this.sound = sound;
  }

  public String getOwnerName()
  {
    return ownerName;
  }

  public void setOwnerName(String ownerName)
  {
    this.ownerName = ownerName;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public ArrayList<String> getColors()
  {
    return colors;
  }


  //toString
  public String toString()
  {
    return nrOfColors + sound + ownerName + name;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Animal))
    {
      return false;
    }
    Animal other = (Animal) obj;
    return name.equals(other.name) &&
        nrOfColors == other.nrOfColors &&
        sound.equals(other.sound) &&
        ownerName.equals(other.ownerName)&&
        colors.equals(other.colors);
  }
}
