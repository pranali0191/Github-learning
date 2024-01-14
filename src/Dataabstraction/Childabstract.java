package Dataabstraction;

public class Childabstract extends Abstractdemo
{

	

	@Override
	public void show() {
		System.out.println("Show method impemented by its child class");
		
	}
	
	public void childm()

	{
	System.out.println("childm():This is child class inherited method");	
	}
	
	public static void main(String[] args) 
	{
		//child reference and child object
		Childabstract c1=new Childabstract();
		c1.accept();//inherited
		c1.show();//inherited abstract
		c1.childm();//individual
		
		//Parent ref and parent object-Invalid
		//Abstractdemo a1=new Abstractdemo();
		
		//Parent ref and child object
		Abstractdemo b1=new Childabstract();
		b1.accept();//individual
		b1.show();//individual
		
		//child ref and parent object-Invalid
		//Childabstract c2=new Abstractdemo();
			
	
				
			
		
	}

}
