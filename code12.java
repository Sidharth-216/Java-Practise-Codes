//write a program to input a array and find out the numbers which are duplicate 
/*test case arr={1,2,3,4,4,2,5,6}
  output:Duplicate element:2
         Duplicate element:4
*/

import java.util.*;
class dup
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int size;
    System.out.println("enter the size of array:");
    size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the elements:");
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++)
    {
      for(int j=i+1;j<size;j++)
      {
        if(arr[i]==arr[j])
        {
          System.out.println("Duplicate element:"+arr[i]);
        }
        else
        {
          System.out.println("No duplicates");
        }
      }
    }
  }
 }
        
