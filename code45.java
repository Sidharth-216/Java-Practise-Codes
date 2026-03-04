import java.util.*;
class swap1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,temp;
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
}
		
