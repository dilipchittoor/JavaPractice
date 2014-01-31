package com.practice;


public class CallMethod {

	/**
	 * @param args
	 * 
	 * 
	 */
	
	 static int add(int a, int b){
		
		return a + b;
	}
	
int sub(){
		
		int z = add(2,3);
		
		return z;
	}

int check(){
	
	int f = sub();
	
	return f;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallMethod c1 = new CallMethod();
		
		int d = add(2,5);
		
		System.out.println(c1.sub());	
	}
	
//System.out.println();
}
