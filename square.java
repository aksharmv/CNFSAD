package shape;

public class square
{
	private int side;
	public square(int side)
	{
		this.side=side;
	}
	public int calculate_area()
	{
		return this.side*this.side;
	}
}
