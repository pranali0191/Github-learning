package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistDemo {

	public static void main(String[] args) 
	
	{// Non generic way
		
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add(30);
		al.add(0, 50);
		al.addAll(al);
		System.out.println(al);
		//al.clear();
		System.out.println("Cleared"+al);
		al.clone();
		System.out.println("Clioned"+al);
		System.out.println(al.contains(50));   
		
		//Generic way
		ArrayList<Integer>s1=new ArrayList<Integer>();
		s1.add(20);
		s1.add(01, 30);
		s1.addAll(s1);
		s1.addAll(03, s1);
		System.out.println(s1);
		
		System.out.println(s1.containsAll(al));
		System.out.println(s1.hashCode());
		System.out.println(s1.indexOf(30));
		System.out.println(s1.isEmpty());
		System.out.println(s1.toString());
		
		//String
		ArrayList<String>str=new ArrayList<String>();
		str.add("Pranali");
		str.add("Vijay");
		str.add("Anusha");
		str.add("Priya");
		System.out.println(str);
		str.add(0, "Vikas");
		System.out.println(str);
		System.out.println(str.isEmpty());
		System.out.println(str.size());
		//str.clear();
		str.remove(0);
		//System.out.println(str);
		System.out.println(str);
		str.add(1, null);
		System.out.println(str);
		System.out.println(str.contains(100));
		
		//oBJECT
		ArrayList<Object>ol=new ArrayList<Object>();
		ol.add(str);
		ol.add("Kiran");
		ol.add(0, 10);
		ol.add("Kiran");
		System.out.println("Object"+ol);
		System.out.println(ol.size());
		System.out.println(ol.indexOf("Kiran"));
		System.out.println(ol.indexOf("Kiran"));
		System.out.println(ol.get(0));
		System.out.println("Iterator for loop");
		for(int i=0;i<ol.size();i++)
		{
			System.out.print(ol.get(i)+" ");
		}
		
		System.out.println("Iterator foreach loop");
		for(Object d:ol)
		{
			System.out.println(d);
		}
		
		System.out.println("Iterator using iterator");
		
		Iterator<Object> ir=ol.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
	
		
	}

}
