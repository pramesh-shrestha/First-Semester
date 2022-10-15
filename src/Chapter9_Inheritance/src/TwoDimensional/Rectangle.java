package TwoDimensional;

public class Rectangle extends TwoDimensionalShape
{
	private double width;
	private double length;

	public Rectangle(double x, double y, double width, double length)
	{
		super(x, y);
		this.width = width;
		this.length = length;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

	public double getLength()
	{
		return length;
	}
  
	public void setLength(double length)
	{
		this.length = length;
	}

	public double getArea()
	{
		return width * length;
	}

	public String toString()
	{
		return super.toString() + "Width: " + width + "Length: " + length;
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Rectangle))
		{
			return false;
		}
		Rectangle other = (Rectangle) obj;
		return super.equals(other) && width == other.width && length == other.length;
	}
}
