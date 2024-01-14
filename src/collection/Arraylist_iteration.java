package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_iteration {

	public static void main(String[] args) {
		ArrayList<Integer> it=new ArrayList<Integer>();
		it.add(20);
		it.add(30);
		it.add(80);
		it.add(60);
		it.add(95);
		System.out.println(it);
		//For loop
		//for(int i=0;i<=it.size()-1;i++)
		//{
			//System.out.println(it.get(i));
		//}
		
		//foreach loop
		//for(Integer i:it)
		//{
		//	System.out.println(i);
		//}
		//Iterator
		System.out.println("Iteration using iterator");
		Iterator<Integer>ir=it.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		System.out.println("Foreach");
		for(Integer i:it)
		{
			System.out.println(i);
		}
			
	}

}
