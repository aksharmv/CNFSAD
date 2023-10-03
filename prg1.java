package lab;
import java.util.*;

interface Person
{
	void display_details();
}

interface Staff
{
	void calculate_salary();
}

interface Student
{
	void calculate_fees();
}

class staffc implements Person,Staff
{
	private String Name;
	private int Age;
	private double Salary;
	public staffc(String Name, int Age, double Salary)
	{
		this.Name=Name;
		this.Age=Age;
		this.Salary=Salary;
	}
	public void display_details()
	{
		System.out.println("Name :"+this.Name);
		System.out.println("Age :"+this.Age);
		System.out.println("Salary "+this.Salary);
	}
	public void calculate_salary()
	{
		this.Salary*=1.2;
	}
}

class studentc implements Person,Student
{
	private String Name;
	private String Course;
	private double Fees;
	public studentc(String Name, String Course, double Fees)
	{
		this.Name=Name;
		this.Course=Course;
		this.Fees=Fees;
	}
	public void display_details()
	{
		System.out.println("Name :"+this.Name);
		System.out.println("Age :"+this.Course);
		System.out.println("Fees "+this.Fees);
	}
	public void calculate_fees()
	{
		this.Fees+=6000;
	}
}

public class prg1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student details:");
		System.out.println("Name :");
		String Name=sc.nextLine();
		System.out.println("Course :");
		String Course=sc.nextLine();
		System.out.println("Fees :");
		double Fees=sc.nextDouble();
		sc.nextLine();
		studentc student=new studentc(Name,Course,Fees);
		student.calculate_fees();
		student.display_details();
		
		System.out.println("Enter Employee details");
		System.out.println("Name :");
		String Name1=sc.nextLine();
		System.out.println("Age :");
		int Age=sc.nextInt();
		System.out.println("Salary :");
		double Salary=sc.nextDouble();
		staffc staff=new staffc(Name1,Age,Salary);
		staff.calculate_salary();
		staff.display_details();
		sc.close();
	}
}