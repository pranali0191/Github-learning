package arraydemo;

public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//array 1D
		
		int sid[]=new int[5];
			sid[0]=101;
			sid[1]=121;

			sid[2]=103;

			sid[3]=104;
			sid[4]=105;
			
			System.out.println("Length of array"+sid.length);
			//System.out.println(sid[5]);
			for(int i=0; i<sid.length ; i++)
			{
				System.out.println(sid[i]);
			}
			
			/*String p[]=new String[4];
			p[0]="Pnali";
			p[1]="Suresh";
			p[2]="Nalini";
			p[3]="Anuja";
		/*	for(int j=0; j<p.length; j++)
		
		{
				System.out.println(p[j]);
				
				
				
		}
			
				
			for(String i:p)
			{
				System.out.println(i);
			}*/
			
			String p[]= {"Pranali", "Arjun", "Ayushi"};
			System.out.println(p.length);
			
			
			for(String i:p)
				
			{
				
				System.out.println(i);
			}
			


	}

}
