import java.util.*;
class stu
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		int total;
		String result;
		int MinMarks=0;
		int MaxMarks=100;
		int MinPassingMarks=33;
		System.out.println("Enter the marks of Physics:");
		int physics=sc.nextInt();
		System.out.println("ENter the marks of Chemistry:");
		int chem=sc.nextInt();
		System.out.println("Enter the marls of Math:");
		int maths=sc.nextInt();
		System.out.println("Enter the marks of English:");
		int eng=sc.nextInt();
		System.out.println("Enter the marks of Hindi:");
		int hin=sc.nextInt();
		total=physics+chem+maths+eng+hin;
		if(physics>=MinPassingMarks && chem>=MinPassingMarks && maths>=MinPassingMarks && eng>=MinPassingMarks && hin>=MinPassingMarks)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Supplementry");
		}
		double per=(total/5);
		System.out.println("Percentage:"+per);
		
		if(per>=60)
		{
			System.out.println("1st Division");
		}
		else if (per>=45 && per<=60)
		{
			System.out.println("2nd Division");
		}
		else if(per>=35 && per<=45)
		{
				System.out.println("3rd Division");
		}
	}
}
