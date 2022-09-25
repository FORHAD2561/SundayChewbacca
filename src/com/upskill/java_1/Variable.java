package com.upskill.java_1;

public class Variable {
	
		// Variables in Java
	
 
		public String country ="USA";               //Instance OR global variable - Variables declared in class level, outside method      
		
		public static String region = "America";    //Static variable - Variables belong to class and don't`t required creating object
		
		public static void main(String[] arge) {
			 
		
			
	       String city ="NYC";                    // Local variable - Variables declared in methods
	       
	       String name = "Forhad";
	       
	       System.out.println("method 1 : " + name);
	       System.out.println("method 1 : " + region);
	       
	       Variable obj = new Variable();
	       
//         ClassName objectName = new ClassName();
	       
	       
	       obj.myMethod("USA");
	       System.out.println("method 1 : " + obj.country);
	       
		}
	          
	   public void myMethod(String county){	       //method parameter - Variables used as method parameter
		
		
	   }
	  
}
