package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

class A{
	
	String s;
	int b;
	Double d;
	
	A(String s1, int b1,Double d1){
		s = s1;
		b = b1;
		d = d1;
	}
}


public class ListCollection {

	public static void main(String[] args) {

		A a3 = new A("dilip", 24, 24.3);
		A a1 = new A("Dilip", 25, 24.3);
		A a2 = new A("diliP", 26, 24.3);
		
		ArrayList<A> al = new ArrayList<A>();
		al.add(a3);
		al.add(a1);
		al.add(a2);
		
		Iterator<A> iterator = al.iterator();
		while (iterator.hasNext()) {
			A a = (A) iterator.next();
			System.out.println(a.s+" "+a.b+" "+a.d);
		}
	}

}
