package Assignements;

public class Nullpointere 
{
	public static void main(String[] args) {

        // Initializing String variable with null value
        String ptr =null;
 
        // Checking if ptr is null using try catch.
        try
        {
            if (ptr.equals("Shristi"))
                System.out.print("Same");
            else
                System.out.print("Not Same");            
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }		
    }  


}
