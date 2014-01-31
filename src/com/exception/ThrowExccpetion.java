package com.exception;

public class ThrowExccpetion {

	 static void checkAge(int a){
		try{
			if(a > 23){
				throw new ArithmeticException("Exception Throwed");
			}
			else{
				System.out.println("no exception");
			}
		}
	catch (Exception e) {
			System.out.println("exception caught" + e);
		}

	}
	
	public static void main(String[] args) {
		 
		checkAge(30);
	
	}

}
