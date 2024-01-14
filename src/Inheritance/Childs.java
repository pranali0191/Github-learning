package Inheritance;

public class Childs extends ParentS
{
	
	int cid=201;
	
	public void childincome()
	{
		System.out.println("Child id is :"+cid);
		System.out.println("Child income is $90000");
		System.out.println("Parent id is :"+super.pid);
		super.income();
	}
	
	public Childs()
	{
		super();
		System.out.println("This is a default constructor");
	}
	
	
	public static void main(String[] args)
	{
		Childs c1=new Childs();
		c1.childincome();
		
	}

}
