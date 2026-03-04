/*write a program to create a method to calculate the simple intrest according to the time ,principal,and amount provided with default rate*/

import java.util.*;
class SI
{
	double r=1.5;
	void simple(int principal,double year)
	{
		double si=(principal*r*year)/100;
		System.out.println("the Simple Intrest:"+si);
	}
 	public static void main(String [] args)
 	{
 		Scanner sc=new Scanner(System.in);
 		System.out.println("enter the principal amount:");
 		int principal=sc.nextInt();
 		double year;
 		System.out.println("enter the time(years):");
 		year=sc.nextDouble();
 		SI s=new SI();
 		s.simple(principal,year);
 	}
 }
 		
