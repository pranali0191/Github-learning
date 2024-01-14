package Inheritance;

public class VehicalTest 

{
	public static void main(String[] args)
	
	{//child class ref and child class object
		BMW b1=new BMW();
		b1.autoengine();//individual
		b1.refuel();//inherited
		b1.start();//inherited
		b1.stop();//inherited
		b1.Break();
		b1.price();
		
		//Parent class ref and parent class object
		
		Car c1=new Car();
		c1.refuel();
		c1.start();
		c1.stop();
		c1.Break();
		c1.price();
		
		Audi a1=new Audi();
		a1.autogear();
		a1.refuel();
		a1.start();
		a1.stop();
		a1.Break();
		a1.price();
	}

}
