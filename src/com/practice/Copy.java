package com.practice;

 class Copy {
	
	int id;
	String name;
	
	Copy(int i, String s){
		
		id = i;
		name = s;
		
	}
	
//	Copy(Copy c){
//		
//		id = c.id + 5;
//		name = c.name + " Dilip";
//		
//	}
	
	void display(){
		
		System.out.println(id + " " + name);
	}
	
	
	
	public static void main(String args[]){
		
		Copy c1 = new Copy(3, "Hanuman");
		
//		Copy c2 = new Copy(c1);
		
//		Copy c2 = new Copy();
		
		c1.display();
//		c2.display();
		
		CallMethod d = new CallMethod();
		System.out.println(d.sub());
		
	}

}
