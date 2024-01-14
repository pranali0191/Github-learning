package assignment_multiple_inheritance;

public class DPS implements CBSE,ICSE
{	public void education()
	{
		System.out.println("Individual Method calling from DPS");
	}
	@Override
	public void termA() 
	{
		System.out.println("Term A:Inherited abstract method calling from CBSE Interface");
	}
	@Override
	public void termB() 
	{
		System.out.println("Term B:Inherited abstract method calling from CBSE interface");
	}

	@Override
	public void termC() 
	{
		System.out.println("Term C:Inherited abstract method calling from ICSE interface");
	}
	@Override
	public void termD() 
	{
		System.out.println("term D:Inherited abstract method calling from ICSE interface");
	}

	public static void main(String[] args)
	{
	DPS d1=new DPS();
	d1.termA();
	d1.termB();
	d1.termC();
	d1.termD();
	}
}
