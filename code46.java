import java.util.*;
class swap2
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}
}
		
