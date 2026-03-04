/*write a java program to create a static and non static method .
where the  static method will be used to calculate the area of rectangle
and non static method will be used to calculate the area of square*/

import java.util.*;
class Area
{
	
	static void rec(int length,int breath)
	{
		int area=length*breath;
		System.out.println("The area of rectangle:"+area);
	}
	void sqe(int side)
	{
		int area=side*side;
		System.out.println("the area of square:"+area);
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int length,breath;
		System.out.println("enter the length:");
		length=sc.nextInt();
		System.out.println("enter the breath:");
		breath=sc.nextInt();
		Area ar=new Area();
		Area.rec(length,breath);//in static method we can call the method without creating class object if it is single class
		System.out.println("enter the side of square");
		int side=sc.nextInt();
		ar.sqe(side);
	}
}
		
		 
