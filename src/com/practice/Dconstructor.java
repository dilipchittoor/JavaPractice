package com.practice;

public class Dconstructor {

	
	int id;
	String str;
	
	Dconstructor(){
		
		System.out.println("Calling Default Constructor");
	}
	
	Dconstructor(int i, String s){
		
//		this();
		
		id = i;
		str = s;
	}
	
	void display(){
		
		System.out.println(id + " " + str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dconstructor s1 = new Dconstructor(3, "dilip");
		Dconstructor s2 = new Dconstructor(5, "divya");
		
		s2.display();
		s1.display();
		
	}

}
