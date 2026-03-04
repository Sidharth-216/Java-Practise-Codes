/* write a program to demonstrate the use of this keyword (all the types of usages of this keyword)*/

class abc
{
	String name;
	int age;
	double salary;
	public abc ()
	{
		this("Asit Patnaik",20,22000.0);
	}
	
	public abc(String name , int age, double salary)
	{
		
		this.name=name;//using this for initilizing instance variable using constructor
		this.age=age;
		this.salary=salary;
	}
	void display3()
	{
	  System.out.println("Name:"+this.name);
	  System.out.println("Age:"+this.age);
	  System.out.println("Salary:"+this.salary);	
	}
	
	void display1(String name,int age,double salary)
	{
	  System.out.println("Name:"+name);
	  System.out.println("Age:"+age);
	  System.out.println("Salary:"+salary);	
	  
	}
	
	void display2()
	{
		
		this.display1("ROhit Patnaik",23,32000.0);//calling another method using this keyword
		
		
	}
	
	public static void main(String [] args)
	{
	 	abc a=new abc("Sidharth Patnaik",21,21000.0);
	 	a.display1("Sidharth Patnaik",21,21000.0);
	 	a.display2();
	 	abc b=new abc();
	 	b.display3();
	}
}
