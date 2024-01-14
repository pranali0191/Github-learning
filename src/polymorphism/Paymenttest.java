package polymorphism;

public class Paymenttest {

	public static void main(String[] args) 
	
	{

		Payment p=new Payment();
		
		p.paywith(500);
		p.paywith("HDFC", 123456789, 500);
		p.paywith("creditcard", 12345678, 500, 123);
		p.paywith("debitcard", 123456, 500, 123);
		
	}

}
