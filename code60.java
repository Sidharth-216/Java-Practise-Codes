import java.util.*;
class dupi
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		int len=str.length();
		char []sid=new char[len];
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					continue;
				}
				else
				{
					sid[i]=str.charAt(i);
				}
			}
			System.out.println(sid);
		}
		//System.out.println(sid);
	}
}
