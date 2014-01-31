package com.oakton;

public class SubString {

	
	public static void main(String[] args) {

		String a = " Dilip Chittoor";
		
			
		System.out.println(a.substring(1));
		System.out.println(a.substring(0, 8));

		System.out.println(a.trim());
		System.out.println(a.startsWith(" Dil"));
		
		
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println(sb.reverse());
		System.out.println(sb.replace(1, 4, "Java"));
		
		System.out.println(sb.reverse());
		
	}

}
