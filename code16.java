/* write a program to create  a class student with name, rollno and course as a attribute.
create a method that provides options for course and another method that displays name, rollno , course selected */

import java .util.*;
class Student
{
	String name,course;
	int rollno;
	public Student(String name,String course,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		this.course=course;
		
	}
	String options()
	{
		Scanner sc=new Scanner(System.in);
	        String choice;
		String arr[]={"1.B.TECH CSE","2.B.TECH ECE","3.B.TECH CSE AIML","4.B.TECH BIOTECH","5.B.TECH AEROSPACE","6.BSC PHYSICS","7.BSC CHEMISTRY","8.BSC MATMATICS"};
		for(int i=0;i<arr.length;i++)
		{
		 	System.out.println(arr[i]);
		 }
		 System.out.println("Select the choice:");
		 int mod=sc.nextInt();
		 int mod1=mod-1;
		 choice=arr[mod1];
		 course=choice;
		 return choice;
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("rollno:"+rollno);
		System.out.println("course:"+course);
	}
	public static void main(String []args)
	{
	         
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc1.next();
		System.out.println("enter the rollno:");
		int rollno=sc1.nextInt();
		String course1=" ";
	 	Student stu=new Student(name,course1,rollno);
	 	String course=stu.options();
	 	Student stu1=new Student(name,course,rollno);
	 	stu1.display();
	 }
}
