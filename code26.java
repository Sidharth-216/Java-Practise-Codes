/*Write a Java program to create a class called Book with instance variables title, author, and price.
Implement a zero-argument constructor for default values and two parameterized constructors:
a. One constructor takes title and author as parameters.
b. The other constructor takes title, author, and price as parameters.
c. Print the values of the variables for each constructor.*/


class book
{
	String title ;
	String author;
	double price;
	public book()
	{
		this.title="xyz";
		this.author="unknown";
		this.price=0.00;
		System.out.println("The output from zero parameter constructor");
		System.out.println("Title"+title);
		System.out.println("Author:"+author);	
	}
	public book(String title,String author)
	{
		this.title=title;
		this.author=author;
		System.out.println("The output from two parameter constructor");
		System.out.println("Title"+title);
		System.out.println("Author:"+author);		
	}
	public book(String title,String author , double price)
	{
	 	this.title=title;
	 	this.author=author;
	 	this.price=price;
	 	System.out.println("The output from three parameter constructor");
	 	System.out.println("Title:"+title);
	 	System.out.println("Author:"+author);
	 	System.out.println("Price:"+price);
	}
	
	public static void main(String [] args)
	{
		book bn=new book();
		book bn1=new book("python programming","Resvolt",9000);
		book bn2=new book("java geeks","overton",8999);
		
		
	}
}
