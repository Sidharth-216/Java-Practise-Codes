class log
{
    public static void main(String [] args)
    {
        int a=10;
        if (a!=0)
        {
            if (a%2==0 && a>2)
            {
                System.out.println("The number is even and >2 "+a);
            }
            else if (a%2!=0 && a>1)
            {
                System.out.println("The number is odd and >1 "+a);
            }
            else if (a%2 ==0 || a%2<=4)
            {
                System.out.println("The number is even and <=4 "+a);
            }
            else
            {
                System.out.println("The number is odd and <=9 "+a);
            }
        }
        else
        {
            System.out.println("The number is zero "+a);
        }
    }
}