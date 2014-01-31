package com.oakton;

public class CompareString {


	public static void main(String[] args) {
	
  String s1 = "Dilip";
  String s2 = "dilip";
  String s3 = "Divya";
  
  String s = "Dilip";
  
  System.out.println(s1.equalsIgnoreCase(s2));
  
  System.out.println(s1.compareTo(s2));
  System.out.println(s1.compareTo(s3));
  
  System.out.println(s1.compareTo(s));
  
  String a = "india";
  String b = "india";
  a = a.concat(" great country");
  
  System.out.println(a);
  
  String b1 = b.concat(" mahan country");
  
  System.out.println(b);
  
  System.out.println(s1.concat("ddddd"));
  System.out.println(s1);
  
  StringBuffer sb = new StringBuffer("StringBuffer");
  System.out.println(sb);
  System.out.println(sb.append(" Test"));
  System.out.println(sb);
  
  
  		
	}

}
