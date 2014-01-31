package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.SortedSet;

public class SimpleSet {

	
	public static void main(String[] args) {

		HashSet hs = new HashSet();
		
		SortedSet ss = null; 
		hs.add("India");
		hs.add("Nature");
		hs.add("China");
		hs.add("Russia");
		hs.add("India");
		hs.add("Russia");
		
		ss.add("ssss");
		ss.add("ggg");
		ss.add("kkhu");
		ss.add("piyt");
		
		hs.add("s");
		hs.add("a");
		hs.add("h");
		hs.add("j");
		hs.add("t");
		hs.add("z");
		
//		Iterator i = hs.iterator();
//		while(i.hasNext()){
//			System.out.println(i.next());
//		}
		
		Iterator i1 = ss.iterator();
		while(i1.hasNext()){
			System.out.println("loop");
			System.out.println(i1.next());
		}
		
			
		System.out.println();

	}

}
