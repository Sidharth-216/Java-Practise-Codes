import java.util.*;
class freq
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count+=1;
				}
			}
			System.out.println("The count of letter "+" '"+str.charAt(i)+"' "+ "  is :"+ count);
		}
	}
}
