package Encapsulation;

class Employee
{
	private int id=200;
	private String name ="pranali";
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public void show()
	{
		System.out.println("Employee id is "+id);
		System.out.println("Employee name is "+name);
	}


}

public class Encapdemo1 

{
 public static void main(String[] args)
 {
	 
	 
Employee e1=new Employee();
 e1.show();
 // e1.id=400; The field e1.id is not visible
 //e1.name="Sangeeta";
 e1.show();
 e1.setId(200);
 e1.setName("Anusha");
 System.out.println( e1.getId()+" "+e1.getName()  );
 
 }
}
