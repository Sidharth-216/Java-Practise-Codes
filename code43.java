import java.io.*;
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Table of 5:");
		for(int i=1;i<=10;i++)
		{
			System.out.println("5x"+i+"="+(5*i));
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("Table of 7:");
		for (int i=1;i<=10;i++)
		{
			System.out.println("7x"+i+"="+(7*i));
		}
	}
}
 class xiu 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
	}

}

