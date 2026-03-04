class xyz
{
  public static void main(String [] args)
  {
    int num=1234567;
    System.out.println("The number:"+num);
    int num1=num;
    int sum=0;
    int a=0;
    int length=0;
    while(num>0)
    {
      a=num%10;
      length+=1;
      num=num/10;
    }
    //System.out.println("the length of number:"+length);
   // System.out.println("The copy number:"+num1);
    for(int i=length;i>0;i--)
    {
      a=num1%10;
       //'System.out.println(a);
       // System.out.println("the index of digit:"+a+":"+i);
       if(i%2==0)
       {
          sum+=a;
        }
        num1/=10;
    }
   
    System.out.println("the sum of numbers at even position:"+sum);
   }
 }
        
    
      
