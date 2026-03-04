import java.util.*;
class Rectangle
{
	double width;
	double heigth;
	public Rectangle(double width,double heigth)
	{
		this.width=width;
		this.heigth=heigth;
	}
	void area(double width,double heigth)
	{
		double area=width*heigth;
		System.out.println("the area:"+area);
	}
	void peri(double width,double heigth)
	{
		double peri=2*(width+heigth);
		System.out.println("the perimeter:"+peri);
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the width:");
		double width=sc.nextDouble();
		System.out.println("enter the height:");
		double heigth=sc.nextDouble();
		Rectangle rc=new Rectangle(width,heigth);
		rc.area(width,heigth);
		rc.peri(width,heigth);
	}
}
