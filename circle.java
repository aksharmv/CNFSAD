package shape;

public class circle
{
	private int radius;
	public circle(int radius)
	{
		this.radius=radius;
	}
	public double calculate_area()
	{
		return this.radius*this.radius*(22/7);
	}
}
