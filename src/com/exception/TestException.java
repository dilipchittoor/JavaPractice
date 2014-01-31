package com.exception;

public class TestException {


	public static void main(String[] args) {

		try{
			int a = 50;
			
			try{
				int b[] = new int[5]; 
				b[5] = 10;
			}
			catch(ArrayIndexOutOfBoundsException aar){
				System.out.println("nested try");
			}
		}
		
		
		catch(ArithmeticException exception){
			
		System.out.println();
		}
				
		System.out.println("rest of the code excecuted");
	}

}
