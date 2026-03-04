/*EXP-10
Write a program (WAP) to create a class called Vehicle with a method called drive.
 Create a subclass called Car that overrides the drive method to print "repairing a car".
*/
class vechicle
{
	void drive()
	{
	}
	
}
class car 
{
	void drive()
	{
		System.out.println("Repairing a car");
	}
}
class xzy
{
	public static void main(String [] args)
	{
		car cr=new car();
		cr.drive();
	}
	
}

