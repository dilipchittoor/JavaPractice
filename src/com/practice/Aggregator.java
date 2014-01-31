package com.practice;

class Location {
	
	
	String city, state;
	
	Location(String city, String state) {
	 
	 System.out.println("Location constructor called");
	 
	 this.city = city;
	 this.state = state;

}
	

}

public class Aggregator{
	
	int id;
	
	String name;
	
	Location location;
	
	Aggregator(int i, String s,Location location ) {

		 System.out.println("Aggregator constructor called");
		 id = i;
		 name = s;
		 this.location = location;

	}
	 
	 void display(){
		 
		 System.out.println(id + " "+ name + " " + location.city);
	 }
	 
	 public static void main(String[] args){
		 
		 Location l = new Location("HYD", "AP");
		 
		 Location l1 = new Location("BANG", "Karnataka");
		 
		 Aggregator ag = new Aggregator(2, "DILIP", l);
		 
		 Aggregator ag1 = new Aggregator(2, "DILIP", l1);
		 
		 ag.display();
		 ag1.display();
		 
		 
		 
		 
		
		 
		 
	 }
	
	
}
