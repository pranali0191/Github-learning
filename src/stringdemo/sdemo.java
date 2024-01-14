package stringdemo;

public class sdemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		/*String s1="Hello";
		String s2=new String("Hello");
		System.out.println(s1==s2);
		String s3="Hello";
		System.out.println(s3==s1);*/
		
		
		
		
		
		StringBuilder sb=new StringBuilder("hello");
		
		/*StringBuffer b=new StringBuffer("Hello");*/
		
		System.out.println(sb.reverse());
		
		
		
		StringBuffer t=new StringBuffer("Pranali");
		System.out.println(t.reverse());
		
		
		String s1="Hello";
		
		System.out.println("Length of the ting is :"+s1.length());
		
		String s3="hello";
		
		String s2=s1+"Hi";
		System.out.println(s2);
		System.out.println("Length of s2 is :"+s2.length());
		System.out.println("Charatcter at index 1 "+s1.charAt(1));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.contains("Hi"));
		
		
		String s4="      Hi this is Pranali    ";
		System.out.println(s4);
		System.out.println(s4.trim());
		
		
		String s5="My name is Pranali";
		System.out.println(s5.startsWith("My"));
		
		System.out.println(s5.endsWith("Pranali"));
		String arr[]=s5.split(" ");
		for(int i=0;i<=3;i++)
		{
			System.out.println(arr[i]);
		}
		

		
}}