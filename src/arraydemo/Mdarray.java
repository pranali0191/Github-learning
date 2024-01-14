package arraydemo;

public class Mdarray {

	public static void main(String[] args) {
		// New kw way
		
	int arr[][]=new int[2][3];
	arr[0][0]=10;
	arr[0][1]=20;
	arr[0][2]=30;
	arr[1][0]=40;
	arr[1][1]=50;
	arr[1][2]=60;
	
	System.out.println(arr.length);	
	/*for(int i=0; i<2;i++)
	{
		for(int j=0; j<3; j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	for(int i=0; i<arr.length;i++)
	{
		for(int j=0; j<arr[i].length; j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	*/
	
	for(int i[]:arr)
	{
		for(int j:i)
		{System.out.print(i+" ");
		
	}
		
		
		
	System.out.println();	
		
		
	}
	//literal way//
	int sid[][]= {{10,20},{30,40},{50,60}};
	System.out.println("Total rows"+sid.length);
	System.out.println("Total columns"+sid[0].length);
	for(int c=0;c<sid.length;c++)
	{
		for(int d=0;d<sid[c].length;d++)
		{
			System.out.print(sid[c][d]+" ");
		}
		System.out.println();
	}
	
	for(int e[]:sid)
	{
		for (int f:e)
		{System.out.print(f);}
		
		System.out.println();
	}
	
	
	StringBuilder sb=new StringBuilder("Hello");
	System.out.println(sb.reverse());
	String q="Prabali";
	
	String p=" ";
	for(int t=q.length()-1;t>=0;t--)
	{
		System.out.println(p=p+q.charAt(t));
	}
	
	
	}

}
