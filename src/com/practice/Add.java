package com.practice;


  class Test{
	
	int z;
	
	int add(int a, int b){
		
		z = 3;
		
		return a + b + z;
	}
	
	double add(int x,int y, int z){
		
		z = 4;
		return x + y +z ;
		
	}
	
	public static void main(String[] args) {
		
		 double c;
		
		Test t = new Test();
		
		  c = t.add(3, 4,5);
		  
		
		System.out.println(t.add(3, 4));
		System.out.println(c);
		

	}
}

 
 class Add {
	

	public static void main(String[] args) {
		
		 double c;
		
		Test t = new Test();
		
		  c = t.add(3, 4,5);
		  
		
		System.out.println(t.add(3, 4));
		System.out.println(c);
		

	}
	

}
