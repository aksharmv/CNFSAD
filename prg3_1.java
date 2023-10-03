package lab;

abstract class printer
{
	abstract void configuration();
	abstract void display();
}

class DotMatrix extends printer
{
	public void configuration()
	{
		System.out.println("DotMatrix printer with Dot Matrix technology");
	}
	public void display()
	{
		System.out.println("printing using DotMatrix printer");
	}
}

class LaserJet extends printer
{
	public void configuration()
	{
		System.out.println("LaserJet printer Laser technology");
	}
	public void display()
	{
		System.out.println("printing using LaserJet printer");
	} 
}

public class prg3_1
{
	public static void main(String [] args)
	{
		printer dotmatrix=new DotMatrix();
		printer laserjet=new LaserJet();
		dotmatrix.configuration();
		dotmatrix.display();
		laserjet.configuration();
		laserjet.display();
	}
}
