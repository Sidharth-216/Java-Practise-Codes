/*write a java program to demonstrate multiple inhertance through default method (using interface)
*/
interface inti1
{
	default void display()
	{
		System.out.println("HI message from default method  of intreface inti1");
	}
}
interface inti2
{
	default void display1()
	{
		System.out.println("HELLO message from default method of interface initi2 ");
	}
}
class abc implements inti1,inti2
{
}
class mainia
{
	public static void main(String [] args)
	{
		System.out.println("=======Multiple inhertance with default method using interfaces=========");
		abc a=new abc();
		a.display();
		a.display1();
	}
}
