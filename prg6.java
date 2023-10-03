package lab;

class shop
{
	int item;
	boolean flag=false;
	public synchronized void put(int item)
	{
		while(flag)
		{
			try{wait();}catch (Exception e){}
		}
		System.out.println("producing item :"+item);
		this.item=item;
		flag=true;
		notify();
	}
	public synchronized void get()
	{
		while(!flag)
		{
			try {wait();}catch (Exception e){}
		}
		System.out.println("consuming item :"+item);
		flag=false;
		notifyAll();
	}
}

class consumer extends Thread
{
	shop s;
	public consumer(shop s)
	{
		this.s=s;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			s.put(i);
			try {Thread.sleep(2000);} catch (InterruptedException e){}
		}
	}
}

class producer extends Thread
{
	shop s;
	public producer(shop s)
	{
		this.s=s;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			s.get();
			try {Thread.sleep(1000);} catch (InterruptedException e){}
		}
	}
}

public class prg6
{
	public static void main(String [] args)
	{
		shop s=new shop();
		Thread p=new producer(s);
		Thread c=new consumer(s);
		p.start();
		c.start();
		try
		{
			p.join();
			c.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main program executed");
	}
}
