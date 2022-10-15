/*The Speed of Sound
The following table shows the approximate speed of sound in air, water, and steel.
Medium          Speed
-------------------------------------
Air             1100 feet per second
Water           4900 feet per second
Steel           16,400 feet per second
Design a class that stores in a distance field the distance, in feet, traveled by a sound wave.
The class should have the appropriate accessor and mutator methods for this field. In addition, the class should have the following methods:
● getSpeedInAir. This method should return the number of seconds it would take a
sound wave to travel, in air, the distance stored in the distance field. The formula to
calculate the amount of time it will take the sound wave to travel the specified distance in air is:
Time 5 distance/1100
● getSpeedInWater. This method should return the number of seconds it would take a
sound wave to travel, in water, the distance stored in the distance field. The formula
to calculate the amount of time it will take the sound wave to travel the specified
distance in water is:
Time 5 distance/4900
● getSpeedInSteel. This method should return the number of seconds it would take a
sound wave to travel, in steel, the distance stored in the distance field. The formula
to calculate the amount of time it will take the sound wave to travel the specified
distance in air is:
Time 5 distance/16400
Write a program to demonstrate the class. The program should display a menu allowing
the user to select air, water, or steel. Once the user has made a selection, he or she should be
asked to enter the distance a sound wave will travel in the selected medium. The program
will then display the amount of time it will take. Check that the user has selected one of the
available choices from the menu*/
package Challenge9_TheSpeedOfSound;

public class TheSpeedOfSound
{
  private double distance;

  public TheSpeedOfSound(double distance)
  {
    this.distance = distance;
  }

  public double getDistance()
  {
    return distance;
  }

  public void setDistance(double distance)
  {
    this.distance = distance;
  }

  //getSpeedInAir
  public double getSpeedInAir()
  {
    return distance/1100;
  }

  //getSpeedInWater
  public double getSpeedInWater()
  {
    return distance/4900;
  }

  //getSpeedInSteel
  public double getSpeedInSteel()
  {
    return distance/16400;
  }
}
