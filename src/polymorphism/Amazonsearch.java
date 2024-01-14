package polymorphism;

public class Amazonsearch {

	
	public void search(String pname)
	

	{
		
		System.out.println("Product serach with name :"+pname);
	}
	
	public void search(int price)
	{
		System.out.println("Product serach with price :"+price);
	}
	
	public void search(String pname,String bname)
	{System.out.println("Product serach with brand name :"+bname+" &product name "+pname);
	}
	
	public void search(String pname, int price)
	{
		System.out.println("Product search with product name "+pname+" &pname ");
	}
	
	

}
