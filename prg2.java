package lab;
import shape.*;
import java.util.*;
public class prg2 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter circle radius");
		circle c=new circle(sc.nextInt());
		System.out.println("Enter square side");
		square s=new square(sc.nextInt());
		System.out.println("Enter rectangle length and breadth");
		rectangle r=new rectangle(sc.nextInt(),sc.nextInt());
		sc.close();
		System.out.println("Area of circle :"+c.calculate_area());
		System.out.println("Area of square :"+s.calculate_area());
		System.out.println("Area of rectangle :"+r.calculate_area());
	}
}
