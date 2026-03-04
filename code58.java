import java.util.*;
class rev
{
	public static void main(String [] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		int len=str.length();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(len-1-i))
			{
				count+=1;
			}
		}
		if(count==len)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
	}

}
