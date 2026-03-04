//exp-10 q-4
import java.util.*;
class Shape
{
	
	double r;
	public Shape(double r)
	{
		this.r=r;
	}
	void getperimeter(double r)
	{
	}
	void getArea(double r)
	{
	}
}
class Circle extends Shape
{
	public Circle(double r)
	{
		super(r);
	}
	void getperimeter(double r)
	{
		double pi=3.143;
		double peri=2*pi*r;
		System.out.println("The Perimeter of circle:"+peri);
	}
	void getArea(double r)
	{
		double pi=3.143;
		double area=pi*(r*r);
		System.out.println("The area of circle:"+area);
	}
}
class Main1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius of circle:");
		double r=sc.nextDouble();
		Circle c=new Circle(r);
		c.getperimeter(r);
		c.getArea(r);
	}
}
