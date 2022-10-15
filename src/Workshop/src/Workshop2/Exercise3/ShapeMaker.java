package Workshop2.Exercise3;

public class ShapeMaker
{
  public ShapeMaker()
  {

  }
  public void makeADownPyramid()
  {
    int i,j;
    for(i = 1; i <= 6; i++)
    {
      for(j = 1; j <= i; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public void makeAnUpPyramid()
  {
    int i,j;
    for(i = 1; i <= 6; i++)
    {
      for(j = 6; j >= i; j--)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public void twoInnerPyramids()
  {
    makeAnUpPyramid();
    makeADownPyramid();
  }
  public void twoOuterPyramids()
  {
    makeADownPyramid();
    makeAnUpPyramid();
  }

}
