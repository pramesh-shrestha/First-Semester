//Create an array of 5 floats and calculate their sum.
public class SumOfArray
{
  public static void main(String[] args)
  {
    //creating an array with 5 elements
    float[] numbers = {52.5f,50.0f,62.8f,77,7f,59.6f};
    //initializing sum
    float sum = 0;
    //use for-each loop to iterate
    for(float elements: numbers)
    {
      sum = sum + elements;
    }
    System.out.println("The sum is: " + sum);

  }
}
