import java.io.*;
class xyz
{
  public static void main(String [] args)throws IOException
  {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int num;
     System.out.println("enter the number:");
     num=Integer.parseInt(br.readLine());
     int pali=0;
     int copy=num;
     while(num>0)
     {
       pali=pali*10+num%10;
       num/=10;
      }
      System.out.println("The reverse num="+pali);
      if(pali==copy)
      {
        System.out.println("It is a pallindrome number");
       }
       else
       {
         System.out.println("not a palindrome number ");
       }
    }
  }
