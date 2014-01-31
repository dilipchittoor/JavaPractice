package com.equals.hashcode;

public class EqualsHash {

	private String name;
	private String city;
	private int age;
	
	EqualsHash(String name,String city,int age){
		
		this.name = name;
		this.city = city;
		this.age = age;
		
	}
	
	public boolean equals(Object object){
		boolean result = false;
	
	if(object == null || object.getClass() != getClass()){
		return result;
	}
	else{
		EqualsHash equalsHash = (EqualsHash)object;
		if(this.name == equalsHash.getName() && this.city ==  equalsHash.getCity()){
			result = true;
		}
	}
		return result;
	}
	
	
	public int hashcode(){
		System.out.println("entered method");
		int hash = 0;
		hash = this.name.hashCode();
		System.out.println(hash);
		hash = this.city.hashCode();
		
		return hash;
	}
	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
	
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
	
		EqualsHash eh = new EqualsHash("Dilip", "HYD", 24);
		EqualsHash eh1 = new EqualsHash("Dilip", "HYD", 25);
		EqualsHash eh2 = new EqualsHash("Dilip", "HYD", 27);
		
		System.out.println(eh.equals(eh1));
//		System.out.println(eh == eh1);
		
		System.out.println("hash code is of eh "+ eh.hashcode());
		System.out.println("hash code is of eh1 "+ eh1.hashcode());

	}

}
