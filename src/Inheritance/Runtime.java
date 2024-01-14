package Inheritance;

public class Runtime {

	public static void main(String[] args) {
		// parent class ref and parent class object
		
		Parent p1=new Parent();
		p1.color();//red
		
		//child class ref and child class object
		
		Child c1=new Child();
		c1.color();//pinc
		
		//Child class ref and parent class object
		//Child c2=new Parent();
		//c2.color();
		
		//Parent ref and child object
		
		Parent p2=new Child();
		p2.color();//pink
		
		

	}

}
