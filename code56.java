import java.util.*;
class itfor
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int ran=sc.nextInt();
		int dup=ran;
		int sum=0;
		for(int i=ran;i>0;i--)
		{
			ran=ran%10;
			System.out.println(ran);
			sum+=1;
			System.out.println("--"+ran);
		}
		System.out.println("the total digit are:"+sum);
	}
}
			
