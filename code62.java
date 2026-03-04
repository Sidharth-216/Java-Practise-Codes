import java.util.*;
class fibno
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENter the Range:");
		int ran=sc.nextInt();
		for(int i=0;i<ran;i++)
		{
			System.out.print(fac(i)+" ");
		}
	}
	static int fac(int ran)
	{
		if(ran==0)
		{
			return 0;
		}
		else if(ran==1 )
		{
			return 1;
		}
		else
		{
			return fac(ran-1)+fac(ran-2);
		}
	}
}

