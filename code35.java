/*write a program to implement the static keyword and represnts all its types*/
class stati
{
	static//use of static keyword for block
	{
 		System.out.println("Message from Stic block ");
	}
	static String name;//use of static keyword for variables
	static int age;
	static double salary;
	public stati()
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	static void display(String name,int age,double salary)//use of static keyword for methods
	{
		
		System.out.println("details from Static method");
		System.out.println("Name:"+name);
		System.out.println("Age:"+salary);
		System.out.println("Salary:"+salary);
	}
	public static void main(String [] args)
	{
		stati s=new stati();
		s.display("Sidharth Patnaik",21,21000);
		
	}
}

