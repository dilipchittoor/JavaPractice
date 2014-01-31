package com.collections;

import java.util.HashMap;

public class SearchKey {


	public static void main(String[] args) {

		HashMap<Integer, String> hp = new HashMap<Integer, String>();

		hp.put(1, "India");
		hp.put(2, "China");
		hp.put(3, "USA");
		hp.put(4, "Russia");
		
		if(hp.containsKey(1)){
			System.out.println("contains desired key");
		}
		else{
			System.out.println("contains does not desired key");
		}
	}

}
