public class MaxValue
{
  public int max(int x, int y)
  {
    if(x > y)
      return x;
    else
      return y;
  }

  public static void main(String[] args)
  {
    MaxValue value = new MaxValue();
    int maxValue = value.max(5,10);
    System.out.println(maxValue);
  }

}
