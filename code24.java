import java.util.*;
class Employee
{
	String name ;
	double salary;
	int hiredate;
	public Employee(String name,double salary,int hiredate)
	{
		this.name=name;
		this.salary=salary;
		this.hiredate=hiredate;
	}
	void exp(int current_date)
	{
		int exp1=current_date-hiredate;
		System.out.println("The Exprience :"+exp1);
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		String name=sc.next();
		sc.nextLine();
		System.out.println("enter the salary:");
		double salary=sc.nextDouble();
		System.out.println("enter the hire_date:");
		int hiredate=sc.nextInt();
		System.out.println("ENter the current year:");
		int current_date=sc.nextInt();
		Employee emp=new Employee(name,salary,hiredate);
		emp.exp(current_date);
	}
	
}
