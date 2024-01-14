package Assignements;

public class Nullpointer {

	public static void main(String[] args) 
	
	{
		/*int arr[]=null;
		try {
		System.out.println(arr[0]);
		}
		catch(NullPointerException e)
		{
			System.out.println("Current field is Null");		
		}*/
		
		
		
		/*try {
		System.out.println(ptr.charAt(0));
		}
		catch(NullPointerException e)
		{
			System.out.println("Current field is null");
		}*/
		
		String ptr=null;
		
		try {
			
		if(ptr.equals("jtp"))
			{System.out.println("Strings are equal");}
		else
			
			{System.out.println("Strings are not equal");}
		
		}
		catch(NullPointerException e)
		
		{
			System.out.println("Current field is null");
		}
		
		
		
		
		
		
		
		
	}	
}

