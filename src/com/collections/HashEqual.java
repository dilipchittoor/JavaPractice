package com.collections;

 class Emp{
	 
	 private int age;
	 
	 int b;
	 Emp(){
		 
	 }
	 Emp(int age){
		 
		 this.age = age;	 
	 }
	 
	public boolean equals(Object obj){
		 
		 boolean flag = false;
		 Emp e = (Emp)obj;
		 System.out.println(b);
			System.out.println(e.age);
			System.out.println(age);
		 if(e.age == age){
			 b = e.age;
			 System.out.println(b);
			System.out.println(e.age);
			System.out.println(age);
			 flag = true;
		 }
		
		return flag;
	 }
	
}


public class HashEqual {

	
	public static void main(String[] args) {
		
		Emp emp = new Emp(23);
		Emp emp1 = new Emp(24);
		Emp emp2 = new Emp(25);
		Emp e1 = new Emp();
		System.out.println(emp2.equals(emp1));
		System.out.println(e1.b);
		

	}

}
