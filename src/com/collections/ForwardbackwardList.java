package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ForwardbackwardList {

	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Dilip");
		al.add("Zeebra");
		al.add("Divya");
		al.add("Program");
		al.add("Program");
		ListIterator listIterator = al.listIterator();
		
		System.out.println("Transversing in forward direction");
		
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		
		System.out.println("Transversing in reverse direction");
		
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}

	}

}
