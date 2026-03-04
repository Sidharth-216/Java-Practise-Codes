/*
Write a Java program to create a class called Point with instance variables x and y.
Implement overloaded constructors:
a) One constructor takes int parameters.
b) Another constructor takes double parameters.
c) Print the values of the variables for each constructor.
*/
class Point
{
	//int x,y;
	double x,y;
	public 	Point(int x, int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("The integer constructor");
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
	}
	public 	Point(double x,double y)
	{
		this.x=x;
		this.y=y;
		System.out.println("The double constructor");
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
	}
	public static void main(String [] args)
	{
		Point pt=new Point(2,10);
		Point pt1=new Point(24.764,98.876);
	}
}
