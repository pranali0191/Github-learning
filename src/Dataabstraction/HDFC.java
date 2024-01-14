package Dataabstraction;

public class HDFC implements RBI

{

void customerdetails()
{
	System.out.println("HDFC: Customerdetails()");
}

@Override
public void deposite() 
{
	System.out.println("HDFC Deposite()");
	
}

@Override
public void withdraw() 
{

	System.out.println("HDFC withdraw()");
	
}

@Override
public void rateofinterest() 
{

	System.out.println("HDFC ROI()");
	
}

	

}
