package shape;

public class rectangle
{
	private int length;
	private int breadth;
	public rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public int calculate_area()
	{
		return this.length*this.breadth;
	}
}
