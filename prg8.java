package lab;

import java.util.*;

class UBwildcards <T extends Number>
{
	private List <T> arr=new ArrayList<>();
	public void append(T number)
	{
		arr.add(number);
	}
	public double summation()
	{
		double sum=0;
		for(T number:arr)
		{
			sum+=number.doubleValue();
		}
		return sum;
	}
	public void sort()
	{
		Collections.sort(arr,(a,b)->Double.compare(a.doubleValue(),b.doubleValue()));
	}
	public List<? super T> display()
	{
		return arr;
	}
}

public class prg8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		UBwildcards <Number> GL=new UBwildcards<>();
		System.out.println("1.Append\n2.Sum\n3.Sort\n4.Display\n5.Exit");
		while(true)
		{
			System.out.println("Enter choice :");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter number :");
					if(sc.hasNextInt())
					{
						GL.append(sc.nextInt());
					}
					else if(sc.hasNextDouble())
					{
						GL.append(sc.nextDouble());
					}
					break;
			case 2:System.out.println("summation :"+GL.summation());
					break;
			case 3:GL.sort();
					System.out.println("Sort :"+GL.display());
					break;
			case 4:System.out.println("display :"+GL.display());
					break;
			case 5:System.out.println("Terminated");
					sc.close();
					System.exit(0);
			default:break;
			}
		}
	}
}
