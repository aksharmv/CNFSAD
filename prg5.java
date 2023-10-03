package lab;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread "+i);
			try
			{
				System.out.println("Thread sleeping for 2 seconds");
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		for (int i=10;i<=15;i++)
		{
			System.out.println("Thread "+i);
			try
			{
				System.out.println("Thread sleeping for 2 seconds");
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class prg5
{
	public static void main(String[] args)
	{
		Thread t1=new Thread1();
		Thread t2=new Thread2();
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main program executed");
	}
}
