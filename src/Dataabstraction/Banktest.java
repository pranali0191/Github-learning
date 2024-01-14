package Dataabstraction;

public class Banktest {

	public static void main(String[] args) 
	{
		/*HDFC h1=new HDFC();
		h1.customerdetails();//Individual
		h1.deposite();//Inherited absttract
		h1.withdraw();//Inheried abstract
		h1.rateofinterest();//Inherited abstract
		
		//RBI r1=new RBI();//Cannot instantiate the type RB
		
		RBI r1=new HDFC();
		r1.deposite();
		r1.withdraw();
		r1.rateofinterest();*/
		
		Axis b1=new Axis();
		b1.customerdetails();
		b1.deposite();
		b1.withdraw();
		b1.rateofinterest();
		
		RBI r2=new Axis();
		r2.deposite();
		r2.rateofinterest();
		r2.withdraw();
		
	}

}
