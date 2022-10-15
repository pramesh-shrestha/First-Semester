public class labels
{
  public static void main(String[] args)
  {
    loop1:
    for (int i = 0; i < 5; i++)
    {
      loop2:
      for (int j = 0; j < 5; j++)
      {
        if(j >= 0 && j < 3)
        {
          continue loop2;
        }
        else
        {
          break loop1;
        }
      }
    }
  }
}
