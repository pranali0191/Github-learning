package Assignements;

import java.util.Scanner;

public class ArrayOutofbounds {

	public static void main(String[] args) 
	 {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id between 0 to 5");
		
		int a=sc.nextInt();
		
		String arr[]= {"pranali", "Arjun", "Pratiksha","Anushka","Swati","Karan"};
		
		try
		{
			System.out.println(arr[a]);
		}
		
		catch(ArrayIndexOutOfBoundsException obj) 
		{
			System.out.println("Enter valid id");
		}

	}

}
