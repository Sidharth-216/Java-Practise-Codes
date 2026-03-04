import java.util.*;
class MathOperation 
{
	void add ()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the num1 :");
		double num1=sc1.nextInt();
		System.out.println("Enter the num2 :");
		double num2=sc1.nextInt();
		double sum=num1+num2;
		System.out..println("The sum of two numbers are:"+sum); 
		
	}
	void subtr()
	{
		Scanner sc2 =new Scanner (System.in);
		System.out.println("Enter the num1:");
		double num1=sc.nextDouble();
		System.out.println("Enter the num2 :");
		double num2=sc.nextDouble();
		double sub=num1+num2;
		System.out.println("The difference of the number is:"+sub);
		
		
	}
	void multi()
	{
		System.out.println("ENter the num1:");
		double num1
		System.out.println("ENter the num2:"0;
		
	}
	void devide()
	{
	}
	public static void main(String [] args)
	{
		MathOperation op=new MathOperation();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Math Opertaion");
			System.out.println("1.Addition");
			System.out.println("2.Subtract");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter the choice:");
			int cho=sc.nextInt();
			switch(cho)
			{
				case 1:
					op.add();
					break;
				case 2:
					op.subtr();
					break;
				case 3:
					op.multi();
					break;
				case 4:
					op.devide();
					break;
				case 5:
					System.exit(0);
					
				default:
					System.out.println("Invaild input");
					
			}
		}
		
	
	}
}
