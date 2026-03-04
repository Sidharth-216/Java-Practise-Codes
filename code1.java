class swap
{
    public static void main(String [] args )
    {
        int a=20;
        int b=30;
        System.out.println("The value of A before swap:"+a);
        System.out.println("The value of B before swap:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The value of A after swap:"+a);
        System.out.println("The value of B after swap:"+b);
    }
}