package com.upskill.java_3;

/*Constructor is instance of class, method same as class name, java will excute constructor first
-   constructor cannot be static or override nor void or return type.
-   Default constructor : No constructor is initialized
-   parameterized constructor : add different signature
-   constructor overloading : Different signature 
 */




public class Constructor {
	
	String studentName;
	int studentAge;

	public Constructor (String name, int age){
		studentName=name;
		studentAge=age;
	}	
	
      public static void main(String[] args) {
    	
    	  Constructor obj = new Constructor("Forhad", 30);
    	  System.out.println(obj.studentName);
    	  System.out.println(obj.studentAge);
    	  
    }
}
