public class MaxValue_VariableArguments
{
  public void max(int...num)
  {
    int largest = 0;
    int sum = 0;
    if(num.length == 0)
      System.out.println(Integer.MIN_VALUE);
    else
    {
      for(int i : num)
      {
        sum += i;
        if(i > largest) largest = i;
      }
    }
    System.out.println("Largest number: " + largest);
    System.out.println("Sum: " + sum);

  }

  public static void main(String[] args)
  {
    MaxValue_VariableArguments number = new MaxValue_VariableArguments();
    number.max(19,45,26,55,39);

  }
}
