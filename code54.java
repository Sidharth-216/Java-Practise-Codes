import java.util.*;
class fivfor
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for table:");
		int ran=sc.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.println(ran+" X"+i+" ="+(ran*i));
		}
	}
}
			
