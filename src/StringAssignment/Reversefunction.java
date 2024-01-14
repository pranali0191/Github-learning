package StringAssignment;

public class Reversefunction {

	public static void main(String[] args) 
	
	{
		System.out.println("String revrese with reverse() Function");
		StringBuilder s1= new StringBuilder ("Pranali");
		System.out.println("Print original string :"+s1);
		s1.reverse();
		System.out.println("String reversed with revrese() function : "+s1);
		
		System.out.println("String Reverese without reverse() function*******");
		String s3="Pranali";
		String s4=" ";

		for(int i=0; i<s3.length();i++)
		{
			char ch=s3.charAt(i);
			s4=ch+s4;
			
		}
		System.out.println(s4);
	}

}
