import java.util.*;
import java.lang.Math.*;
class Shape 
{
	double length;
	double breadth;
	double side;
	void area(double length,double breath)
	{
		this.length=length;
		this.breadth=breadth;
		double area =length*breadth;
		System.out.println("the Area of Rectangle :"+area);
	}
	void area(double side)
	{
		this.side=side;
		double area =side*side;
		System.out.println("the area of square:"+area);
	}
	void area()
	{
		Scanner sc1=new Scanner(System.in);
		double a,b,c;
		System.out.println("enter the side 1:");
		a=sc1.nextDouble();
		System.out.println("enter the side 2:");
		b=sc1.nextDouble();
		System.out.println("enter the side 3:");
		c=sc1.nextDouble();
		double s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("the area of scalene Triangle :"+area);
			
	}
	public static void main(String [] args)
	{
		Shape sh=new Shape();
		Scanner sc=new Scanner(System.in);
		while (true)
		{
			System.out.println("1.Area of Rectangle");
			System.out.println("2.Area of Square");
			System.out.println("3.Area of scalene Triangle ");
			System.out.println("4.Exit");
			System.out.println("Enter the choice:");
			int cho=sc.nextInt();
			switch(cho)
			{
				case 1:
					System.out.println("enter the length:");
					double length=sc.nextDouble();
					System.out.println("enter the breath:");
					double breath=sc.nextDouble();
					sh.area(length,breadth);
					break;
				case 2:
					System.out.println("enter the side:");
					double side=sc.nextDouble();
					sh.area(side);
					break;
				case 3:
					sh.area();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Invalid input");
					
			}
		}
		
	}
}
