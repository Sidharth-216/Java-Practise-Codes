import java.io.*;
import java.lang.Math;
class xyz
{
  public  static void main(String [] args)throws IOException
  {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int num;
     System.out.println("enter the num:");
     num=Integer.parseInt(br.readLine());
     int copy1=num;
     int copy2=num;
     int am=0;
     int length=0;
     while(num>0)
     {
       int a=num%10;
       length+=1;
       num/=10;
     }
     
     while(copy1>0)
     {
       am=am+(int)Math.pow((copy1%10),length);
       copy1/=10;
     }
     if(am==copy2)
     {
       System.out.println("it is a amstrong number");
     }
     else
     {
       System.out.println("not a amstrong number");
     }
   }
 }
