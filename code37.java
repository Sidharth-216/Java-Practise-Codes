interface Accountoperations
{
	public abstract void deposit();
	public abstract void withdraw();
}
class SavingAccount implements Accountoperations
{
	void deposit()
	{
	 	System.out.println("deposit");
	}
	void withdraw()
	{
		System.out.println("withdraw");
	}
	public static void main(String []args)
	{
		SavingAccount sc=new SavingAccount();
		sc.deposit();
		sc.withdraw();
	}
}
