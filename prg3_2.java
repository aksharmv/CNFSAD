package lab;

interface vehicle
{
	void drive();
}

abstract class abstract_vehicle implements vehicle
{
	public abstract void drive();
}

class car extends abstract_vehicle
{
	public void drive()
	{
		System.out.println("Driving in car");
	}
}

class bike extends abstract_vehicle
{
	public void drive()
	{
		System.out.println("Driving in bike");
	}
}

public class prg3_2
{
	public static void main(String [] args)
	{
		vehicle bmw=new car();
		vehicle ducati=new bike();
		bmw.drive();
		ducati.drive();
	}
}
