import java.util.*;
class person
{
	String name;
	int age;
	public person(String name,int age)
	{
		this. name=name;
		this.age=age;
	}
	void display(String name,int age)
	{
		System.out.println("Name:"+name);
		System.out.println("AGe:"+age);
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of record:");
		int rec=sc.nextInt();
		for(int i=0;i<rec;i++)
		{
			System.out.println("enter the name:");
			String name=sc.next();
			sc.nextLine();
			System.out.println("enter the age:");
			int age=sc.nextInt();
			person p=new person(name,age);
			p.display(name,age);
		}
	}
}
