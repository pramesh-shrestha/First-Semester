package Animal;

public class AnimalTest
{
  public static void main(String[] args)
  {
    Animal[] animals = new Animal[4];
    animals[0] = new Frog(12, "Green");
    animals[1] = new Dog(3,"Tommy", "German Shepard");
    animals[2] = new Cat(4,"Munni", true);
    animals[3] = new Bee(1,true);

    for(int i = 0; i < animals.length; i++)
    {
      System.out.println(animals[i].speak());
    }
  }
}
