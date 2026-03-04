/*write a program to diplay the same elements of two arrays
test case: arr1={"java","python","c","c++","mysql"}
           arr2={"go lang","rust","c#","mysql","java","c"}
outpt:output_array:{"java","pyhton","c","mysq"}*/

import java.util.*;
class sti
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int size1,size2;
    System.out.println("enter the size of array 1:");
    size1=sc.nextInt();
    String arr[]=new String[size1];
    System.out.println("enter the elements:");
    for(int i=0;i<size1;i++)
    {
      arr[i]=sc.nextLine();
    }
    
    
    System.out.println("enter the size of array 2:");
    size2=sc.nextInt();
    String arr2[]=new String[size2];
    System.out.println("enter the elements to array 2:");
    for(int i=0;i<size2;i++)
    {
      arr2[i]=sc.nextLine();
     }
     
     int size3=size1+size2;
     String arr3[]=new String[size3];
     
     
     //merge the both arrays 1&2
     for(int i=0;i<size1;i++)
     {
       arr3[i]=arr[i];
     }
     for(int i=0;i<size2;i++)
     {
       arr3[i]=arr2[i];
     }
     int length=0;
     String result[]=new String[length];
     //finding the repeated terms
     for(int i=0;i<size3;i++)
     {
       for(int j=i+1;j<size1;j++)
       {
         if(arr3[i]==arr3[j])
         {
           length+=1;
           result[length]=arr3[i];
         }
       }
     }
     
     
     //printing the elements
     for(int i=0;i<length;i++)
     {
       System.out.print(result[i]+" ");
     }
  }
}    
           
     
