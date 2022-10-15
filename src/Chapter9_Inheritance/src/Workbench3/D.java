package Workbench3;

public class D extends B
{
  private double q;
  protected double r;

  //constructor
  public D(int m, int n, double q, double r)
  {
    super(m, n);
    this.q = q;
    this.r = r;
  }

  //calc
  public double calc()
  {
    return q * r;
  }

  public double getQ()
  {
    return q;
  }

  public void setQ(double q)
  {
    this.q = q;
  }

  public double getR()
  {
    return r;
  }

  public void setR(double r)
  {
    this.r = r;
  }
}
