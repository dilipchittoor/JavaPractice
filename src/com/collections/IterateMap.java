package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMap {

	
	public static  void main(String[] args) {
		
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Dilip");
		map.put(2, "Divya");
		map.put(3, "India");
		map.put(5, "Believe");
		map.put(4, "Believe");
		
		
//		ArrayList al = new ArrayList();
//		al.add(map);
//		
//		Iterator itr = al.iterator();
//		while(itr.hasNext()){
//			try{
//				System.out.println("Entered");
//			Map.Entry p = (Map.Entry)itr.next();
//			System.out.println(p.getKey() + " " + p.getKey());
//			}
//			
//		catch(Exception exception){
//			System.out.println(exception);
//		}
//		}
		
//		Set<Entry<Integer, String>> set = map.entrySet();
		System.out.println(map);
		Iterator<?> i = map.entrySet().iterator();
		
		while(i.hasNext()){
			Map.Entry pair =   (Map.Entry)i.next();
			System.out.println(pair.getKey() + " = "+ pair.getValue());
		}
		
//		Iterator iterator = set.iterator();
		
//		for (Iterator iterator2 = set.iterator(); iterator2.hasNext();) {
//			Object object = (Object) iterator2.next();
//			
//		}
		
//		for(Entry<Integer, String> tm : set){
//			System.out.println(map.get(tm));
//			
//		}
		
//		Iterator iterator = map.
//		

	}

}
