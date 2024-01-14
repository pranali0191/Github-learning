 package Inheritance;
 
 
 
 class A{
	 
	 public void m1()
	
	 {System.out.println("M1 is calling from A class");}
	 
 }
	 
	 class B extends A
	 {
	 
	 public void m2()
	 {
		 System.out.println("M2 is calling from B class");
	 }
	 }

	 class C extends A  
	 {
		 public void m3()
		 {
			 System.out.println("M3 is calling from C class");
		 }
	 }

	
public class Inheritancedemo 

{
	public static void main(String[] args)
	{
		//Parent class referrence and Parent class object
		/*A a1=new A();
		a1.m1();*/
		
		
		B b1=new B();
		b1.m2();
		b1.m1();
		
		C c1=new C();
		c1.m1();
		c1.m3();
		
		
	}

}
