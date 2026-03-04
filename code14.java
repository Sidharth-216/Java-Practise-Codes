import java.util.*;
class sor
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		int size=0;
		System.out.println("enter the size:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<size;i++)
		{
		  for(int j=0;j<size;j++)
		  {
		    if(arr[i]<arr[j])
		    {
		      temp=arr[j];
		      arr[j]=arr[i];
		      arr[i]=temp;
		    }
		 }
	       }
	       System.out.println("the sorted array");
	       for(int i=0;i<size;i++)
	       {
	         System.out.print(arr[i]+" ");
	       }
	}
}
