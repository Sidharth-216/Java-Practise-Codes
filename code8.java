import java.util.Scanner;
class xyz
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("enter the number:");
    num=sc.nextInt();
    int count=0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
      {
        count+=1;
       }
    }
    if(count==2)
    {
      System.out.println("it is a prime number");
    }
    else
    {
     System.out.println("Not a prime number");
    }
   }
 }
