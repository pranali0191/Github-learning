package Dataabstraction;

public abstract class Abstractdemo 

{//class declared with abstract create
//has implemented and non implemented
//cant create object when class is not implemented
//All methods needs to be implemented by its child
//non implemeted is method withoud body-abstract 
	
	//Implemeted
	public void accept()
	{
		System.out.println("Accept():This is implemented method");
	}
	//Abstract
	public abstract void show();
	
	//public static void main(String[] args)
	//{//cannot instantiate the trype abstractcdemo
	//	Abstractdemo a1=new Abstractdemo();
	//}

}