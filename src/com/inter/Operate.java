package com.inter;

public class Operate {

	Calculates c1;
	
//	public Operate(Calculates c) {
//		
//		calculates = c;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculates calculates = new Add();
		calculates.calculate();
		
		Calculates c = new Substract();
		c.calculate();

	}

}
