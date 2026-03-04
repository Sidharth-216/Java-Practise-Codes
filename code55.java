import java.util.*;
class sumfor
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for range:");
		int ran=sc.nextInt();
		int sum=0;
		for(int i=0;i<=ran;i++)
		{
			sum+=i;
		}
		System.out.println("THe sum of natural number are:"+sum);
	}
}
			
