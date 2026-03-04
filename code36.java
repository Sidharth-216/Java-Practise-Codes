import java.io.*;
class thread1 extends Thread 
{
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
				if(i%2!=0)
				{
					System.out.println(i);
				}
		}
	}
}
class main1 extends Thread 
{
	public static void main(String [] args)
	{
		thread1 t1=new thread1();
		thread2 t2 =new thread2();
		t1.start();
		t2.start();	
	}
}

