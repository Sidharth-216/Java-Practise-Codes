import java.io.*;
import java.util.*;

 class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String c=A+B;
        int count=0;
        for(int i=0;i<c.length();i++)
        {
            count+=1;
        }
        System.out.println(count);
        String f=A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase();
        String g=B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase();
        int com=A.compareTo(B);
        System.out.println(A.length()+B.length());
        if(com>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        System.out.println(f+" "+g);
    }
}



