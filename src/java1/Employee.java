package java1;

public class Employee {
	
	int id;
	
	String name;
	
	public void display()
	
	{
		System.out.println("Employee id is : "+id);
		System.out.println("EMployee name is :"+name);
		
	}
	
	

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		
		e1.id=01;
		e1.name="Pranali";
		e1.display();
		
		System.out.println("**********************************");
		
Employee e2=new Employee();
		
		e2.id=02;
		e2.name="Arjun";
		e2.display();
		
		System.out.println("**********************************");

		Employee e3=new Employee();
		e3.id=03;
		e3.name="Nivedita";
		e3.display();
		System.out.println("**********************************");	
		
		Employee e4=new Employee();
		
		e4.id=04;
		e4.name="Tushar";
		e4.display();
		
		System.out.println("**********************************");
		
		Employee e5=new Employee();
		
		e5.id=05;
		e5.name="Namita";
		e5.display();
		
		System.out.println("**********************************");
		
		

	}

}
