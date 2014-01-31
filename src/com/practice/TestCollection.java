package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {

//	static int a[] = {2,3,4,5};
	int b[] = new int[5];
	
	public static void main(String[] args) {
	
//	int a[] = {2,3,4,5};
//	int z[][] = {{2,3,4,5,6,7},{89,23,7,12,4,8}};
		
 ArrayList al = new ArrayList();
 al.add("dilip");
 al.add("divya");
 al.add("sandeep");
 al.add("siddu");
 al.add("sindhu");

 
 Iterator iterator = al.iterator();
 while(iterator.hasNext()){
	 
	 System.out.println(iterator.next());
 }
		for (Object object : al) {
		System.out.println(object);
		}
		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//	}
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 6; j++) {
//				System.out.println(z[i][j]);
//			}
//		}
//		System.out.println(z.length);
	
	}
}
