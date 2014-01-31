package com.collections;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	
	public static void main(String[] args) {
	
		HashMap<String, String> hp = new HashMap<String, String>();
		hp.put("first", "FIRST");
		hp.put("second", "SECOND");
		hp.put("third", "THIRD");
		hp.put("fourth", "FOURTH");
		

		System.out.println(hp.get("first"));
		System.out.println(hp.isEmpty());
		System.out.println(hp.values());
		
//		String a = hp.remove("second");
//		System.out.println(hp.remove("second"));
//      System.out.println(a);
//      System.out.println(hp.get("second"));
		
		// Getting keys and iterating through it
		Set<String> keys = hp.keySet();
		for (String key : keys) {
			System.out.println(hp.get(key));
		}
		// Copying content of 1 HashMap to another
		System.out.println();
		HashMap<String, String> hpnew = new HashMap<String, String>();
		
		hpnew.put("India", "Delhi");
		hpnew.put("Nepal", "Bhutan");
		
		hp.putAll(hpnew);
		
		Set<String> keys2 = hp.keySet();
		for (String key : keys2) {
			System.out.println(hp.get(key));
		}
	}
	

}
