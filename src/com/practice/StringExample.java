package com.practice;

public class StringExample {

	/**
	 * @param args
	 * 
	 * 
	 */
	
	
	 static String s1 = "Hai", s2="Hai";
	
	 String a = "new";
	 static int a1;
	String b = "new";

	static String ss1 = new String("test");
	static String ss2 = new String("test");
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String string = "String";
			String string2 = "String";
			
			System.out.println(string == string2);
//			System.out.println(string.hashCode());
			
			
		StringExample se;// = new StringExample();
		
		
		String s = new String("check");
		String d = new String("check");
		
		System.out.println(s.equals(d));
		System.out.println(s==d);
		
		System.out.println(a1);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
//		System.out.println("equals--->"+se.s1.equals(se.s2));
//		System.out.println(s1==s2);
		
		
		
//		System.out.println("equals--->"+se.a.equals(s1));
//		System.out.println(a==b);
		
		
		System.out.println("equals--->new "+ss1.equals(ss2));
		System.out.println(ss1==ss2);
		
		
	}

}
