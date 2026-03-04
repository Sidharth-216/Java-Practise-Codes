import java.util.*;
class lar
{
	static public void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		int num2;
		System.out.println("Enter the 2nd num:");
		num2=sc.nextInt();
		int lar=num>num2? num:num2;
		System.out.println("THe largest:"+lar);
	}
}
