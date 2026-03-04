/*
write a program to perform polymorphism(method overriding)
consider a senerio  bank as a parent class  that provides amethod to calculate the intrest according to the rates of intrest
but rates of intrest may differ according to the banks, for example SBI,icici,axis are providing -8.4,7.3,9.7 rates of intrest respectvely
*/
import java.util.*;
class Bank
{	
	double principal;
	double time;
	double rate;
	public Bank(double principal,double time,double rate)
	{
		this.principal=principal;
		this.time=time;
		this.rate=rate;
	}
	void si(double principal,double time,double rate)
	{
	}
}
 class sbi extends Bank
 {
 	public sbi(double principal,double time, double rate)
 	{
 		super(principal,time,rate);
 	}
 	void si(double principal,double time,double rate)
 	{
 		double si=(super.principal*super.time*super.rate)/100;
 		System.out.println("Thee simple intrest of SBI:"+si);
 	}
 }
 class icici extends Bank
 {
 	public icici(double principal,double time,double rate)
 	{
 		super(principal,time,rate);
 	}
 	void si(double principal,double time,double rate)
 	{
 		double si=(super.principal*super.time*super.rate)/100;
 		System.out.println("The intrest of icici bank:"+si);
 	}
 }
 class axis extends Bank
 {
 	public axis(double principal,double time,double rate)
 	{
 		super(principal,time,rate);
 	}
 	void si(double principal,double time,double rate)
 	{
 		double si=(super.principal*super.time*super.rate)/100;
 		System.out.println("THe intrest of Axis bank:"+si);
 	}
 }
 class Mainco
 {
 	public static void main(String [] args)
 	{
 		//Bank bn=new Bank();
 		Scanner sc=new Scanner(System.in);
 		while (true)
 		{
 			System.out.println("CHECK INTREST RATE");
 			System.out.println("1.SBI");
 			System.out.println("2.ICICI");
 			System.out.println("3.AXIS");
 			System.out.println("4.Exit");
 			System.out.println("Enter the choice:");
 			int choice=sc.nextInt();
 			switch(choice)
 			{
 				case 1:
 					System.out.println("Enter the Principal:");
 					double principal=sc.nextDouble();
 					System.out.println("Enter the time:");
 					double time=sc.nextDouble();
 					double rate=8.4;
 					sbi sb=new sbi(principal,time,rate);
 					sb.si(principal,time,rate);
 					//sb.si();
 					break;
 				case 2:
 					System.out.println("Enter the Principal");
 					double principal1=sc.nextDouble();
 					System.out.println("Enter the time:");
 					double time1=sc.nextDouble();
 					double rate1=7.3;
 					icici ic =new icici(principal1,time1,rate1);
 					ic.si(principal1,time1,rate1);
 					//ic.si();
 					break;
 				case 3:
 					System.out.println("ENter the principal:");
 					double principal2=sc.nextDouble();
 					System.out.println("Enter the time:");
 					double time2=sc.nextDouble();
 					double rate2=9.2;
 					axis ax=new axis(principal2,time2,rate2);
 					ax.si(principal2,time2,rate2);
 					//axis.si();
 					break;
 				case 4:
 					System.exit(0);
 				default:
 					System.out.println("Invalid input");
 					
 			}
 		}
 		
 	}
 	
 }
