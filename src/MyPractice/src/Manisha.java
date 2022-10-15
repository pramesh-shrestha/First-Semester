public class Manisha
{
  private int a;
  private int b;

 public Manisha()
 {
   a = 5;
   b= 10;
 }
 public Manisha(int c)
 {
   a = 1;
   b = 2;
 }


 public int getA()
 {
   return a;
 }

  public int getB()
  {
    return b;
  }

  public void setA(int a)
  {
    this.a =a;
  }

  private int sum()
 {
   return a+b;//15
 }

 public void getSum()
 {
   System.out.println(sum());
 }
}
