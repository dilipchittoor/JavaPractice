package com.oakton;

public class EqualsTest { 
/** * @param args */ String xyz; 
public EqualsTest(String s) {
xyz = s; 
} 
public static void main(String[] args) { 
	
// TODO Auto-generated method stub 
	
EqualsTest eTest = new EqualsTest("Hai"); 
System.out.println(eTest.xyz);

EqualsTest eTest1 = new EqualsTest("Hai"); 
System.out.println(eTest1.xyz);

System.out.println(eTest.equals(eTest1)); 
System.out.println(eTest==eTest1); 
}
}

