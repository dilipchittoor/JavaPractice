package com.oakton;


abstract class A{
	
	void test(){
		
		System.out.println("Testing");
	}
	
	void run(){
		
		System.out.println("Parenty class");
	}
	
}
public class Abstract extends A {

	void run(){
		System.out.println("Child class ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new Abstract();
		
		Abstract a = new Abstract();
		
		a1.run();
		a.test();
		
	}

}
