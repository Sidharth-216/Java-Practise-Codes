/*import java.util.*;
class abc extends Thread 
{
    public void run()
    {
        System.out.println("Even Thread");
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
class xyz extends Thread
{
    public void run()
    {
        System.out.println("Odd Thread ");
        for(int i=1;i<20;i++)
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
       abc t1=new abc();
       xyz t2=new xyz();
       t1.start();
       t2.start();
   }
}*/






/*import java.util.*;
class abc implements Runnable
{
	public synchronized void run(int num)
	{
		System.out.println("Even Thread");
		for(int i=0;i<20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
class def implements Runnable 
{
	public synchronized void run(int num1)
	{
		System.out.println("Odd Number");
		for(int i=0;i<20;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	
	}
}
class main extends Thread
{
	public static void main(String [] args)
	{
		abc a=new abc();
		def d=new def();
		Thread t1=new Thread(a);
		Thread t2=new Thread(d);
		t1.start();
		t2.start();
	}
}*/


/*import java.util.*;
class myexception extends Exception
{
}
class main1
{
	public static void main(String [] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int a;
			a=sc.nextInt();
			System.out.println("the number:"+a);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
		 	System.out.println("Successfull");
		}
	}
}*/


import java.util.*;
class myexception extends Exception
{
	myexception(String msg)//exception constructor
	{
		super(msg);
	}
}
class main1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		try
		{
			System.out.println("enter the Age:");
			int age=sc.nextInt();
			
				if(age>=18)
				{
					System.out.println("Eligible to cast vote");
				}
				else
				{
					throw new myexception("Not Eligible");
				}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}
