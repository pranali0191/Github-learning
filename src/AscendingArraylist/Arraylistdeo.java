package AscendingArraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdeo {

	public static void main(String[] args) {
		ArrayList<Integer> Li=new ArrayList<Integer>();
		Li.add(45);
		Li.add(80);
		Li.add(60);
		Li.add(75);
		Li.add(95);
		System.out.println("Before Sort "+Li);
		Collections.sort(Li);
System.out.println("Sorted list in acending order "+Li);
	}

}
