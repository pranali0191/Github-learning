package collection;

import java.util.Collections;
import java.util.Vector;

import java.util.Iterator;

public class Vectordemo {

	public static void main(String[] args) 
	{
		Vector<Integer>v1=new Vector<Integer>();
		if(v1.isEmpty())
		{
		v1.add(20);
		v1.add(50);
		v1.add(20);
		v1.add(60);
		}
		System.out.println(v1);//20 50 20 60
		Collections.sort(v1);
		System.out.println(v1);//20 20  50 60
//v1.remove(0);
System.out.println(v1);//20 50 60
System.out.println(v1.contains(30));//False
System.out.println(v1.size());//3

System.out.println("****Iteration****");

for(int i=0;i<v1.size();i++)
{
	System.out.println(v1.get(i));
}


System.out.println("Iteration using for each");
for(Integer j:v1)
{
	System.out.println(j);
}

System.out.println("Iteration using iterator");
Iterator<Integer>ir=v1.iterator();
while(ir.hasNext())
{
	System.out.println(ir.next());}

	}

}
