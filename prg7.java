package lab;

class Account
{
	private String acname;
	private int acnumber;
	private double balance;
	private Account(String acname,int acnumber, double balance)
	{
		this.acname=acname;
		this.acnumber=acnumber;
		this.balance=balance;
	}

	private static class Accountholder
	{
		private static final Account Instance=new Account("Default",0,0);
	}
	
	public static Account getInstance(String acname,int acnumber, double balance)
	{
		Accountholder.Instance.acname=acname;
		Accountholder.Instance.acnumber=acnumber;
		Accountholder.Instance.balance=balance;
		return Accountholder.Instance;
	}
	
	public String getName()
	{
		return this.acname;
	}
	
	public int getNumber()
	{
		return this.acnumber;
	}
	
	public void deposit(double amount)
	{
		this.balance+=amount;
	}
	
	public void withdraw(double amount)
	{
		if(this.balance>amount)
		{
			this.balance-=amount;
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	
	public double getBalance()
	{
		return this.balance;
	}
}

class Thread3 extends Thread
{
	public void run()
	{
		Account sb=Account.getInstance("ABC", 12345, 100000);
		System.out.println("Account name1 :"+sb.getName());
		System.out.println("Account number1 :"+sb.getNumber());
		sb.deposit(100000);
		sb.withdraw(50000);
		System.out.println("Account balance1 :"+sb.getBalance());
	}
}

class Thread4 extends Thread
{
	public void run()
	{
		Account sb=Account.getInstance("XYZ", 6789, 1000);
		System.out.println("Account name2 :"+sb.getName());
		System.out.println("Account number2 :"+sb.getNumber());
		sb.deposit(100000);
		sb.withdraw(50000);
		System.out.println("Account balance2 :"+sb.getBalance());
	}
}

public class prg7
{
	public static void main(String [] args)
	{
		Thread t1=new Thread3();
		Thread t2=new Thread4();
		
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		}
		catch (Exception e) {}
	}
}
