package com.upskill.java_5;

public class Encapsulation {

	//Encapsulation used to hide the data using setter method
	
	private String name = "upskill";                //write & read  
	private int ssn	= 1234567890;                 //write only
	private String	username = "Forhadahmed";     //read only
	
	//setter method - name			
	public  void setName(String value ){	   //set the data, write
		name = value;
	}		
		
	//Getter Method - name 	
	public String getName(){	             //get the data, read
		return name;
	}		
		

	//setter method - ssn			
			public  void setSSN(int value ){	  
				ssn = value;	
			}
				//Getter Method - username 	
				public String getUsername(){	             //get the data, read
					return username;
				}		
	
				
				
				
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("upskill");
		System.out.println(obj.getName());
		obj.setSSN(1234567890);
		obj.getUsername();
		System.out.println(obj.getUsername());
	}		
		
	

}
