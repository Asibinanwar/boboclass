class Rectangle implements Shape
{
	private int length, width;

	public Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}

	public double area()
	{
		return (double)(length * width);
	}
	
}