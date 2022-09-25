package com.upskill.assignment_1;

public class JavaAssignment_1_1 {

	/*problem 01: 1.  A tringle three arms are:5,7 and 11 inches.
	write a method to display the perimeter of triangle in console output. */
	 
	
	public static void main(String[] args) {
		triangleperimeter();
	}			
	
	public static void triangleperimeter(){
   
	int a = 5;
	int b = 7;
	int c = 11;
	int perimeter = a+b+c;
	System.out.println("The perimeter of Triangle with arms 5, 7, 11 is " + perimeter);
	}
	
	
	}
	

