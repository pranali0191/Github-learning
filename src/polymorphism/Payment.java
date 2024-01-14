package polymorphism;

public class Payment {
	
	/*cod upi cc dc apay*/
	
	public void paywith(int amount)
	{
		System.out.println( amount+" to be paid at the time of delivery");
	}
	
	public void paywith(String bankname, long accnumber, int amount)
	{
		System.out.println(amount+" to be paid using "+bankname+" with account number "+accnumber);
	}
	
	public void paywith(String cardtype, long cardnumber,int amount, int cvv)
	{
		
		System.out.println(amount+" to be paid using "+cardtype+" Enter card number :"+cardnumber+" Enter Cvv :"+cvv);
	}
	
}