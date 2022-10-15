package Workshop6;

import java.util.ArrayList;

public class Parrot extends Animal
{
  private ArrayList<String>favouriteWords;

  public Parrot(int nrOfColors,String sound, String ownerName,String name, ArrayList<String> favouriteWords)
  {
    super(nrOfColors, sound, ownerName, name);
    this.favouriteWords = favouriteWords;
  }

  public ArrayList<String> getFavouriteWords()
  {
    return favouriteWords;
  }

  public void setFavouriteWords(ArrayList<String> favouriteWords)
  {
    this.favouriteWords = favouriteWords;
  }

  public String toString()
  {
    return super.toString() + favouriteWords;
  }
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Parrot))
    {
      return false;
    }
    Parrot other = (Parrot) obj;
    return super.equals(other) && favouriteWords.equals(other.favouriteWords);
  }
}
