package com.practice;


class A{
	int count = 30;
	
	void message(){
		System.out.println("Parent message");
	}
	
	A(){
		System.out.println("Parent constructor");
	}
}

public class SuperTest extends A {
	int count = 60;
	
	void message(){
		
		System.out.println("Child message");
		System.out.println(super.count);
	}
	
	void display(){
		
		message();
		super.message();
	}

	SuperTest(){
		System.out.println("Child Constructor");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SuperTest st = new SuperTest();
		st.display();
		
		
	}

}
