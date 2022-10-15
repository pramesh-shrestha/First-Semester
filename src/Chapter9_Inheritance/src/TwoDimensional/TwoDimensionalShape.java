package TwoDimensional;

public abstract class TwoDimensionalShape
{
	private double x;
	private double y;

	public TwoDimensionalShape(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}
 
	public void moveTo(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public String toString()
	{
		return "X: " + x + "Y: " + y;
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof TwoDimensionalShape))
		{
			return false;
		}
		TwoDimensionalShape other = (TwoDimensionalShape) obj;
		return x == other.x && y== other.y;

	}
	public abstract double getArea();
}
