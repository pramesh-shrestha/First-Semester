package MethodOverriding;

class TV
{
  //methods
  public void switchOn()
  {
    System.out.println(("Tv is switched on"));
  }
  public void changeChannel()
  {
    System.out.println(("Tv channel is changed"));
  }
}

class SmartTv extends TV
{
  //These methods are called Overridden because the exact same method with same signature is available in superclass-TV.
  //And SmartTv inherits TV which means all the properties, methods and variable are available to this class, but still
  //we chose to write the exact method in this class. That is why they are called Override.
  @Override
  public void switchOn()
  {
    System.out.println(("Smart Tv is switched on"));
  }
  @Override
  public void changeChannel()
  {
    System.out.println(("Smart Tv channel is changed"));
  }

  public void browse()
  {
    System.out.println("Smart Tv browsing");
  }
}


public class Overriding
{
  public static void main(String[] args)
  {
    //creating an object of super class
    TV tv = new TV();
    //These both methods below will call the methods of super class
    tv.switchOn();
    tv.changeChannel();


    //creating an object of subclass
    SmartTv smartTv = new SmartTv();
    //Because SmartTv extends TV, all the methods of TV class are available to SmartTv class plus SmartTv's own overridden methods.
    //However, smartTv refers to SmartTv object, which means it will shadow the super classes' methods and execute subclasses' methods
    smartTv.switchOn();
    smartTv.changeChannel();
    smartTv.browse();


    //creating an object of subclass, however referring to super class
    TV sub =  new SmartTv(); //Here even though, the reference is a super class, but the object that is created is of subclass.
    //In this kind of situation, the object is the important ones. Therefore, methods of the object's class i.e.,subclass will be called and not of the super class
    sub.switchOn();
    sub.changeChannel();

    //We cannot call the browse method in this case, because when we say, TV sub =  new SmartTv();, we can only call those methods that are defined super class(TV).
    //browse method is only defined in the subclass, not in the super class that is why we cannot call this method.

//    sub.browse();
  }
}
