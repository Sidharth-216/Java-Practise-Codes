import java.util.*;
class Myhash
{
	int BUCKET;
	ArrayList<LinkedList<Integer>>table;
	
	public Myhash(int b)
	{
		BUCKET=b;
		table=new ArrayList<>();
		for(int i=0;i<BUCKET;i++)
		{
			table.add(new LinkedList<>());
		}
	}
	int hash(int key)
	{
		return key%BUCKET;
	}
	void insert(int key)
	{
		int i=hash(key);
		table.get(i).add(key);
	}
	boolean search(int key)
	{
		int i=hash(key);
		return table.get(i).contains(key);
	}
	void remove(int key)
	{
		int i=hash(key);
		table.get(i).remove((Integer)key);
	}
	void display()
	{
		for(int i=0;i<BUCKET;i++)
		{
			System.out.print(i+"->"+table.get(i));
		}
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Myhash m=new Myhash(7);
		m.insert(70);
		m.insert(89);
		m.insert(21);
		m.insert(45);
		
		m.display();
		
		m.remove(89);
		m.remove(45);
		
		m.display();
		
		
	}
}
